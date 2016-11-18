package k0r0tk0ff.PetClinic.Actions;

import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.ConsoleIO;


/**
 * Class describe find client`s pet to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 18.11.2016
 * @version 1.0
 */
public class FindClientAction implements PetClinicAction {

    private int success_exit = 0;
    //private String found_client = "\n Client not found \n";

    /**
     * Main method for FindClientAction
     * rename the client`s pet
     *
     * @since 18.11.2016
     */
    @Override
    public void exe(Data data, ConsoleIO consoleIO) {
        do {
            final String name_for_found = consoleIO.input_read(" Enter the name of client for find: ");
            for (int i = 0; i < data.clients.size(); i++) {
                 if (data.clients.get(i).getClientName().equals(name_for_found)) {
                     System.out.println(String.format("\n Found Client - %s", name_for_found));
                     success_exit = 1;
                 } else {

                     /**
                      * If client is not exist, show list of clients
                      */
                     data.actions.get(3).exe(data, consoleIO);
                 }
            }
        } while (success_exit == 0);
    }

    /**
     * Text output from console, describe what key
     * we can edit the client do this action EditPetAction
     *
     * @return text from console "Find the client - 9"
     * @since 18.11.2016
     */
    @Override
    public void intro(){ System.out.println(String.format("%s - Find the client", this.key())); }

    /**
     * Key for this action
     * need for bind "9" from console input and FindClientAction
     *
     * @return int key
     * @since 18.11.2016
     */

    @Override
    public int key() {
        return 9;
    }
}


