package k0r0tk0ff.PetClinic.Actions;

import k0r0tk0ff.PetClinic.Client;
import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.ConsoleIO;

/**
 * Class describe add client to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 09.11.2016
 * @version 1.0
 */

public class AddPetAction implements PetClinicAction {

    /**
     * Main method for AddPetAction
     * add a new pet to internal client storage
     * @since 09.11.2016
     *
     * @return int key
     */
    @Override
    public void exe(Data data, ConsoleIO consoleIO){
        final String name = consoleIO.input_read(" Enter the name of client: ");
        for ( int i = 0; i < data.clients.size(); i++) {
            if(data.clients.get(i).getClientName().equals(name)){
                final String petName = consoleIO.input_read(" Enter the nick of pet: ");
                data.clients.get(i).getPetArrayList().add(petName);
            }
            else { System.out.println(" Client not found \n");}
        }
    }

    /**
     * Text output from console, describe what key
     * we can push for do this action AddClientAction
     * @since 09.11.2016
     * @version 1.0
     *
     * @return text from console "Add a new client - 1"
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
