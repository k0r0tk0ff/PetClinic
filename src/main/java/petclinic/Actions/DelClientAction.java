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

public class DelClientAction implements PetClinicAction {

    /**
     * Declare variable foundClient - def value if client not found.
     */
    private String foundClient = "\n Client not found \n";

    /**
     * Declare variable keyDelClientAction
     * - in actions key=2 action = DelClientAction.
     */
    private final int keyDelClientAction = 2;

    /**.
    * Main method for DelClientAction
    * add a new client to data storage
    * @since 15.10.2016
    */
    @Override
    public synchronized final void exe(final Data data, final ConsoleIO consoleIO) {
    final String name = consoleIO.inputRead(
        " Enter the name of client: ");
    for (int i = 0; i < data.clients.size(); i++) {
        if (data.clients.get(i).getClientName().equals(name)) {
               foundClient = String.format("found the Client - %s \n", name);
                data.clients.remove(i);
        }
    }
        System.out.println(String.format("%s \n", foundClient));
    }

    @Override
    public void exe(Data data, String clientName) {

    }

    @Override
    public void exe(Data data, String clientName, String petNick) {

    }

    /**.
    * Text output from console, describe what key
    * we can delete the client do this action DelClientAction
    * @since 15.10.2016
    *
    * @return text from console "Del the client"
    */
    @Override
    public final String intro() {
        return " Del the client";
    }

    /**.
    * Key for this action
    * need for bind "2" from console input and DelClientAction
    * @since 15.10.2016
    *
    * @return int key
    */

    @Override
    public final int key() {
        return keyDelClientAction;
    }
}

