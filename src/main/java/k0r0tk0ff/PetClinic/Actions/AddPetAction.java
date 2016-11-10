package k0r0tk0ff.PetClinic.Actions;

import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.ConsoleIO;

/**
 * Class describe add a new pet to internal client storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 09.11.2016
 * @version 1.0
 */

public class AddPetAction implements PetClinicAction {

    private String found_client = "\n Client not found ";
    private int success_exit = 0;

    /**
     * Main method for AddPetAction
     * add a new pet to internal client storage
     * @since 09.11.2016
     *
     * @return int key
     */
    @Override
    public void exe(Data data, ConsoleIO consoleIO){
        do {
            final String name = consoleIO.input_read(" Enter the name of client: ");
            for (int i = 0; i < data.clients.size(); i++) {
                if (data.clients.get(i).getClientName().equals(name)) {
                    found_client = "\n Add a pet to Client" + name;
                    final String petName = consoleIO.input_read("\n Enter the nick of pet: ");
                    data.clients.get(i).getPetArrayList().add(petName);
                }
                success_exit = 1;
            }

            /**
             * If client is not exist, show list of clients
             */
            System.out.println(found_client + "\n");
            if (found_client.equals("\n Client not found ")) {
                System.out.println(" The clients: \n");
                data.actions.get(3).exe(data, consoleIO);

                /**
                 * If client is not exist, ask to create him
                 */
                final String answer = consoleIO.input_read("\n Add a new client? (y) ");
                    if(answer.equals("y")){
                        data.actions.get(1).exe(data, consoleIO);
                    } else { success_exit = 1;}
            }
        }while(success_exit == 0);
    }

    /**
     * Text output from console, describe what key
     * we can push for do this action AddPetAction
     * @since 09.11.2016
     * @version 1.0
     *
     * @return text from console "Add a new client - 4"
     */
    @Override
    public void intro(){
        System.out.println(this.key()+" - Add a pet ");
    }

    /**
     * Key for this action
     * need for bind "4" from console input and AddClientAction
     * @since 09.11.2016
     * @version 1.0
     *
     * @return int key
     */

    @Override
    public int key(){
        return 4;
    }
}
