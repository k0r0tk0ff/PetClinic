package petclinic.Actions;

import petclinic.Data.Data;
import petclinic.IO.ConsoleIO;

/**.
 * Class describe add client to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 09.11.2016
 * @version 1.0
 */

public class ShowPetAction implements PetClinicAction {

    /**.
     * Declare variable foundClient - def value if client not found.
     */
    private String foundClient = "\n Client not found \n";

    /**.
     * Declare variable keyFindClientAction
     * - return key (6) for action ShowPetAction.
     */
    private final int keyShowPetAction = 6;

    /**.
     * Main method for ShowPetAction
     * Show pets from internal client storage
     * @since 09.11.2016
     *
     * @return int key
     */
    @Override
    public synchronized final void exe(final Data data, final ConsoleIO consoleIO) {
        final String name = consoleIO.inputRead(
                " Enter the name of client: ");
        for (int i = 0; i < data.clients.size(); i++) {
            if (data.clients.get(i).getClientName().equals(name)) {
                foundClient = String.format("\n found the Client - %s", name);
                for (String pet: data.clients.get(i).getPetArrayList()) {
                    System.out.println(pet);
                }
            }
        }
        System.out.println(foundClient);
    }

    /**.
     * Text output from console, describe what key
     * we can push for do this action ShowPetAction
     * @since 09.11.2016
     * @version 1.0
     *
     * @return text from console "Show a client's pets - 6"
     */
    @Override
    public final String intro() {
        return " Show a client's pets";
    }

    /**.
     * Key for this action
     * need for bind "6" from console input and ShowPetAction
     * @since 09.11.2016
     * @version 1.0
     *
     * @return int key
     */
    @Override
    public final int key() {
        return keyShowPetAction;
    }
}
