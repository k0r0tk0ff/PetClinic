package petclinic.Actions;

import petclinic.Data.Data;
import petclinic.IO.ConsoleIO;

/**.
 * Class describe find client`s pet to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 18.11.2016
 * @version 1.0
 */

public class FindPetAction implements PetClinicAction {

    /**.
     * Declare variable keyFindClientAction
     * - return key (8) for action FindPetAction.
     */
    private final int keyFindPetAction = 8;
    /**.
     * Declare variable foundPet- status of pet. Found or not.
     */
    private String foundPet = "\n Pet not found \n";
    /**.
     * Declare variable successExit - default value of if.
     */
    private int successExit = 0;

    /**.
     * Main method for FindPetAction
     * rename the client`s pet
     *
     * @since 18.11.2016
     */
    @Override
    public synchronized final void exe(final Data data, final ConsoleIO consoleIO) {
        do {
            final String nickForFind = consoleIO.inputRead(
                    " Enter the nick of pet for find: ");
            for (int i = 0; i < data.clients.size(); i++) {
                 if (data.clients.get(i).existPet(nickForFind)) {
                        System.out.println(String.format(
                                "\n Founf pet - %s", nickForFind));
                        foundPet = nickForFind;
                        System.out.println(String.format(
                                "\n Pet`s owner - %s",
                                data.clients.get(i).getClientName()));
                        successExit = 1;
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
     * @return text from console "Find the pet - 8"
     * @since 18.11.2016.
     */
    @Override
    public final String intro() {
        return " Find the pet";
    }

    /**.
     * Key for this action
     * need for bind "8" from console input and FindPetAction
     *
     * @return int key
     * @since 18.11.2016.
     */

    @Override
    public final int key() {
        return keyFindPetAction;
    }
}


