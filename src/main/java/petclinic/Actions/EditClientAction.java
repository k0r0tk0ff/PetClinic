package petclinic.Actions;

import petclinic.Data.Data;
import petclinic.IO.ConsoleIO;

/**.
 * Class describe del client to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0.
 */
public class EditClientAction implements PetClinicAction {

     /**
     * Declare variable keyDelClientAction
     * - in actions key=8 action = keyEditClientAction.
     */
    private final int keyEditClientAction = 8;

    /**.
     *  Main method for EditClientAction
     * add a new client to data storage
     * @since 15.10.2016.
     */
    @Override
    public synchronized final void exe(final Data data, final ConsoleIO consoleIO) {
    final String name = consoleIO.inputRead(
            " Enter the name of client for edit: ");
    for (int i = 0; i < data.clients.size(); i++) {
        if (data.clients.get(i).getClientName().equals(name)) {
            final String newName = consoleIO.inputRead(
                    "\n Enter the new name of client");
                data.clients.get(i).setName(newName);
            }
    }
    }

    @Override
    public void exe(Data data, String clientName) {

    }

    @Override
    public void exe(Data data, String clientName, String petNick) {

    }

    /**.
    * Text output from console, describe what key
    * we can edit the client do this action EditClientAction
    * @since 11.11.2016
    *
    * @return text from console "Edit the client - 8".
    */
    @Override
    public final String intro() {
        return " Edit the client";
    }

    /**.
    * Key for this action
    * need for bind "8" from console input and EditClientAction
    * @since 23.11.2016
    *
    * @return int keyEditClientAction
    */

    @Override
    public final int key() {
        return keyEditClientAction;
    }
}

