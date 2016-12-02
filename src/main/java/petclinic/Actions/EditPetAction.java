package petclinic.Actions;

import petclinic.Data.Data;
import petclinic.IO.ConsoleIO;

/**.
 * Class describe del client to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 10.11.2016
 * @version 1.0.
 */

public class EditPetAction implements PetClinicAction {

    /**
     * Declare variable successExit - default value of if.
     */
    private int successExit = 0;

    /**
     * Declare variable foundClient - status of client. Found or not.
     */
    private String foundClient = "\n Client not found \n";

    /**
     * Declare variable foundPet- status of pet. Found or not.
     */
    private String foundPet = "\n Pet not found \n";

    /**
     * Declare variable keyEditPetAction
     * - return key (5) for action EditPetAction.
     */
    private final int keyEditPetAction = 5;

    /**
     * Declare variable showListOfClient
     * - in actions key=3 action = showListOfClient.
     */
    private final int showListOfClient = 3;

    /**.
     * Main method for EditPetAction
     * rename the client`s pet
     *
     * @since 10.11.2016.
     */
    @Override
    public synchronized final void exe(final Data data, final ConsoleIO consoleIO) {
        do {
            final String name = consoleIO.inputRead(
                    "Enter the name of client for edit the nick of his pet:");
            for (int i = 0; i < data.clients.size(); i++) {
                if (data.clients.get(i).getClientName().equals(name)) {

                    foundClient = name;

                    do {
                        final String petNick = consoleIO.inputRead(
                                "\n Enter the nick of pet: ");
                        if (data.clients.get(i).existPet(petNick)) {
                            System.out.println(String.format(
                                    "\n found pet - %s", foundPet));
                            foundPet = petNick;
                            final String newPetNick =
                                    consoleIO.inputRead(
                                            "\n Enter the new nick of pet: ");
                            data.clients.get(i).editPetNick(
                                    petNick, newPetNick);
                            successExit = 1;
                        }
                    } while (foundPet.equals("\n Pet not found \n"));
                }
            }
                if (foundClient.equals("\n Client not found \n")) {
                    System.out.println(" The clients: \n");
                    data.actions.get(showListOfClient).exe(data, consoleIO);

                    /**
                     * If client is not exist, ask to create him.
                     */
                    final String answer = consoleIO.inputRead(
                            "\n Add a new client? (y) ");
                    if (answer.equals("y")) {
                        data.actions.get(1).exe(data, consoleIO);
                    } else {
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
     * @return text from console "Edit the pet - 5"
     * @since 10.11.2016.
     */
    @Override
    public final String intro() {
        return " Edit the pet";
    }

    /**.
     * Key for this action
     * need for bind "5" from console input and EditPetAction
     *
     * @return int key
     * @since 15.10.2016.
     */

    @Override
    public final int key() {
        return keyEditPetAction;
    }
}


