package petclinic.Actions;

import petclinic.Data.Data;
import petclinic.IO.ConsoleIO;

/**.
 * Class describe add a new pet to internal client storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 09.11.2016
 * @version 1.0.
 */

public class DelPetAction implements PetClinicAction {

    /**.
     * Declare variable successExit - default value of if.
     */
    private int successExit = 0;

    /**
     * Declare variable keyAddClientAction
     * - in actions key=7 action = AddClientAction.
     */
    private final int keyAddClientAction = 7;

    /**.
     * Main method for DelPetAction
     * del a pet from internal client storage
     * @since 09.11.2016
     *
     * @return int key
     */
    @Override
    public final void exe(final Data data, final ConsoleIO consoleIO) {
         final String name = consoleIO.input_read(
                " Enter the name of client: ");
         for (int i = 0; i < data.clients.size(); i++) {
                if (data.clients.get(i).getClientName().equals(name)) {
                    /**
                    * Show pets before del.
                    */
                    System.out.println("\n Client`s pets - \n");
                    for (String pet: data.clients.get(i).getPetArrayList()) {
                        System.out.println(pet);
                    }

                    /**.
                    * Ask user what is pet will be delete.
                    * Check input.
                    */
                    do {
                        final String petNick = consoleIO.input_read(
                                "\n Enter the nick of pet for delete: ");
                                if (data.clients.get(i).existPet(petNick)) {
                                    data.clients.get(i)
                                            .getPetArrayList().remove(
                                    data.clients.get(i).getPetId(petNick));
                                    successExit = 1;
                                } else {
                                System.out.println(
                                        " Input error, try again \n");
                                }
                        } while (successExit != 1);
                } else {
                System.out.println(" Client not found \n");
                }
         }
    }

    /**.
     * Text output from console, describe what key
     * we can push for do this action AddPetAction
     * @since 09.11.2016
     * @version 1.0
     *
     * @return text from console "Del a pet - 7"
     */
    @Override
    public final String intro() {
        return " Del a pet";
    }

    /**.
     * Key for this action
     * need for bind "7" from console input and AddClientAction
     * @since 09.11.2016
     * @version 1.0
     *
     * @return int keyAddClientAction.
     */

    @Override
    public final int key() {
        return keyAddClientAction;
    }
}
