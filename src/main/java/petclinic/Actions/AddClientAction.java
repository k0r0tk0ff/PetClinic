package petclinic.Actions;

import petclinic.Client;
import petclinic.Data.Data;
import petclinic.IO.ConsoleIO;

import java.util.concurrent.CopyOnWriteArrayList;

    /**
    * @author k0r0tk0ff
    * @author peterarsentev
    * @since 14.10.2016
    * @version 1.0
    *
    * Class describe add client to data storage.
    */
public class AddClientAction implements PetClinicAction {

    /**.
    * Declare iterable variable for generate id for clients.
    */
    private int iterableId = 0;

    /**.
    * Declare iterable clientName - client name.
    */
    String clientName;

    /**
    * @since 14.10.2016
    *
    * @return int key
    * Main method for AddClientAction
    * add a new client to data storage.
    */
    @Override
    public synchronized final void exe(final Data data, final ConsoleIO consoleIO) {
        final String name = consoleIO.inputRead(" Enter the name of client: ");
        Client client = new Client(
                iterableId++, name, new CopyOnWriteArrayList<>());
        data.clients.add(client);
    }

    public synchronized final void exe(final Data data, String clientName) {
        Client client = new Client(
            iterableId++, clientName, new CopyOnWriteArrayList<>());
                data.clients.add(client);
    }

    @Override
    public void exe(Data data, String clientName, String petNick) {

    }

        /**
     * @since 14.10.2016
     * @version 1.0
     * @return text from console "Add a new client - 1"
     *
     * Text output from console, describe what key
     * we can push for do this action AddClientAction.
     */
    @Override
    public final String intro() {
        return " Add a new client";
    }

    /**
     * @since 14.10.2016
     * @version 1.0
     * @return int key
     *
     * Key for this action
     * need for bind "1" from console input and AddClientAction.
     */
    @Override
    public final int key() {
        return 1;
    }
}
