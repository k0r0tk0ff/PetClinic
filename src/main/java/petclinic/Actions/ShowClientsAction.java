package petclinic.Actions;

import petclinic.Client;
import petclinic.Data.Data;
import petclinic.IO.ConsoleIO;


/**.
 * Class need for show clients from data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 21.10.2016
 * @version 1.0
 */

public class ShowClientsAction implements PetClinicAction {

    /**.
     * Declare variable showListOfClient
     * - in actions key=3 action = ShowClientsAction
     */
    private final int keyShowClientsAction = 3;

    /**.
     * Main method for ShowClientsAction
     * @since 21.10.2016
     *
     * Show clients in data storage.
     */
    @Override
    public synchronized final void exe(final Data data, final ConsoleIO consoleIO) {

        /**
         * Show clients.
         */
        System.out.println("\n Show the petclinic`s clients: \n");
        for (Client client : data.clients) {
            System.out.println(client.getClientName());
        }
    }

    @Override
    public void exe(final Data data, final String clientName) {
        System.out.println("\n Show the petclinic`s clients: \n");
        for (Client client : data.clients) {
            System.out.println(client.getClientName());
        }
    }

    @Override
    public void exe(Data data, String clientName, String petNick) {
        System.out.println("\n Show the petclinic`s clients: \n");
        for (Client client : data.clients) {
            System.out.println(client.getClientName());
        }
    }

    /**.
     * Text output from console, describe what key
     * we can push for do this action ShowClientsAction
     * @since 14.10.2016
     * @version 1.0
     *
     * @return text from console "key: 3 action: ShowClientsAction".
     */
    @Override
    public final String intro() {
        return " Show the clients";
    }

    /**.
     * Key for this action
     * need for bind "3" from console input and ShowClientsAction
     * @since 14.10.2016
     * @version 1.0
     *
     * @return int keyShowClientsAction.
     */

    @Override
    public final int key() {
        return keyShowClientsAction;
    }
}
