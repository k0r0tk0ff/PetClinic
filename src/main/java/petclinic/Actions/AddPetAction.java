package petclinic.Actions;

import petclinic.Data.Data;
import petclinic.IO.ConsoleIO;

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
            System.out.println("\n Add a pet to the Client \n");
            final String name = consoleIO.input_read(" Enter the name of client: ");
            for (int i = 0; i < data.clients.size(); i++) {
                if (data.clients.get(i).getClientName().equals(name)) {
                    found_client = name;
                    String.format(" Found the client - %s \n", found_client);
                    final String petName = consoleIO.input_read("\n Enter the nick of pet: ");
                    data.clients.get(i).getPetArrayList().add(petName);
                }
                success_exit = 1;
            }

            /**
             * If client is not exist, show list of clients
             */
            if (found_client.equals("\n Client not found ")) {
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
     * @return text from console "Add a pet - 4"
     */
    @Override
    public String intro(){ return " Add a pet "; }

    /**
     * Key for this action
     * need for bind "4" from console input and AddPetAction
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
