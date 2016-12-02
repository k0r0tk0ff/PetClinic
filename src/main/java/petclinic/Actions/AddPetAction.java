package petclinic.Actions;

import petclinic.Data.Data;
import petclinic.IO.ConsoleIO;

    /**
    * @author k0r0tk0ff
    * @author peterarsentev
    * @since 09.11.2016
    * @version 1.0
    * Class describe add a new pet to internal client storage.
    */

public class AddPetAction implements PetClinicAction {

    /**
    * Declare variable foundClient - def value if client not found.
    */
    private String foundClient = "\n Client not found ";

    /**
    * Declare variable successExit - default value of if.
    */
    private int successExit = 0;

    /**
    * Declare variable showListOfClient
    * - in actions key=3 action = showListOfClient.
    */
    private final int showListOfClient = 3;

    /**
    * Declare variable showListOfClient
    * - in actions key=4 action = AddPetAction.
    */
    private final int keyAddPetAction = 4;

    /**
    * @since 09.11.2016
    *
    * @return int key
    * Main method for AddPetAction
    * add a new pet to internal client storage.
    */
    @Override
    public synchronized final void exe(final Data data, final ConsoleIO consoleIO) {
        do {
            System.out.println("\n Add a pet to the Client \n");
            final String name = consoleIO.inputRead(
                    " Enter the name of client: ");
            for (int i = 0; i < data.clients.size(); i++) {
                if (data.clients.get(i).getClientName().equals(name)) {
                    foundClient = name;
                    String.format(" Found the client - %s \n", foundClient);
                    final String petName = consoleIO.inputRead(
                            "\n Enter the nick of pet: ");
                    data.clients.get(i).getPetArrayList().add(petName);
                }
                successExit = 1;
            }

            /**
             * If client is not exist, show list of clients.
             */
            if (foundClient.equals("\n Client not found ")) {
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

    /**.
     * Text output from console, describe what key
     * we can push for do this action AddPetAction
     * @since 09.11.2016
     * @version 1.0
     *
     * @return text from console "Add a pet - 4".
     */
    @Override
    public final String intro() {
        return " Add a pet ";
    }

    /**
     * @since 14.10.2016
     * @version 1.0
     * @return int key
     *
     * Key for this action
     * need for bind "4" from console input and AddPetAction.
     */
     @Override
     public final int key() {
         return keyAddPetAction;
     }
}
