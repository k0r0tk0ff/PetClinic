package k0r0tk0ff.PetClinic.Actions;

import k0r0tk0ff.PetClinic.Client;
import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.ConsoleIO;

import java.util.ArrayList;

/**
 * Class describe add client to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */

public class AddClientAction implements PetClinicAction {
    //private ConsoleIO consoleIO;


    /**
     * Declare iterable variable for generate id for clients
     */
    private int iterable_id = 0;

    /**
     * Main method for AddClientAction
     * add a new client to data storage
     * @since 14.10.2016
     *
     * @return int key
     */
    @Override
    public void exe(Data data, ConsoleIO consoleIO){
        final String name = consoleIO.input_read(" Enter the name of client: ");
        Client client = new Client(iterable_id++, name, new ArrayList<>());
        data.clients.add(client);
    }

    /**
     * Text output from console, describe what key
     * we can push for do this action AddClientAction
     * @since 27.10.2016
     * @version 1.0
     *
     * @return text from console "Add a new client - 1"
     */
    @Override
    public void intro(){
        System.out.println(this.key()+" - Add a new client ");
    }

    /**
     * Key for this action
     * need for bind "1" from console input and AddClientAction
     * @since 27.10.2016
     * @version 1.0
     *
     * @return int key
     */

    @Override
    public int key(){
        return 1;
    }
}
