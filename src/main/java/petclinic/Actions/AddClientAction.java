package petclinic.Actions;

import petclinic.Client;
import petclinic.Data.Data;
import petclinic.IO.ConsoleIO;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Calculate.
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class AddClientAction implements PetClinicAction {

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
        Client client = new Client(iterable_id++, name, new CopyOnWriteArrayList<>());
        data.clients.add(client);
    }

    /**
     * Text output from console, describe what key
     * we can push for do this action AddClientAction
     * @since 14.10.2016
     * @version 1.0
     *
     * @return text from console "Add a new client - 1"
     */
    @Override
    public String intro(){  return " Add a new client"; }

    /**
     * Key for this action
     * need for bind "1" from console input and AddClientAction
     * @since 14.10.2016
     * @version 1.0
     *
     * @return int key
     */

    @Override
    public int key(){
        return 1;
    }
}
