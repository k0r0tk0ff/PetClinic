package petclinic.Actions;

import petclinic.Data.Data;
import petclinic.IO.ConsoleIO;

/**.
 * Class describe find client`s pet to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 18.11.2016
 * @version 1.0.
 */

public class FindClientAction implements PetClinicAction {

    /**.
     * Declare variable successExit - default value of if.
     */
    private int successExit = 0;

    /**
     * Declare variable showListOfClient
     * - in actions key=3 action = showListOfClient.
     */
    private final int showListOfClient = 3;

    /**.
     * Declare variable keyFindClientAction
     * - return key (5) for action FindClientAction.
     */
    private final int keyFindClientAction = 9;

    /**.
     * Main method for FindClientAction
     * rename the client`s pet
     *
     * @since 18.11.2016.
     */
    @Override
    public synchronized final void exe(final Data data, final ConsoleIO consoleIO) {
        do {
            final String nameForFound = consoleIO.inputRead(
                    " Enter the name of client for find: ");
            for (int i = 0; i < data.clients.size(); i++) {
                 if (data.clients.get(i).getClientName().
                         equals(nameForFound)) {
                     System.out.println(String.format(
                             "\n Found Client - %s", nameForFound));
                     successExit = 1;
                 } else {

                     /**.
                      * If client is not exist, show list of clients.
                      */
                     data.actions.get(showListOfClient).exe(data, consoleIO);
                 }
            }
        } while (successExit == 0);
    }

    @Override
    public void exe(Data data, String clientName) {

    }

    @Override
    public void exe(Data data, String clientName, String petNick) {

    }

    /**.
     * Text output from console, describe what key
     * we can edit the client do this action EditPetAction
     *
     * @return text from console "Find the client - 9"
     * @since 18.11.2016.
     */
    @Override
    public final String intro() {
        return " Find the client";
    }

    /**.
     * Key for this action
     * need for bind "9" from console input and FindClientAction
     *
     * @return int key
     * @since 18.11.2016.
     */

    @Override
    public final int key() {
        return keyFindClientAction;
    }
}


