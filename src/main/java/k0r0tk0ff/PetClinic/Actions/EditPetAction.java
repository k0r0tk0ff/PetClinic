package k0r0tk0ff.PetClinic.Actions;

import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.ConsoleIO;


/**
 * Class describe del client to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 10.11.2016
 * @version 1.0
 */
public class EditPetAction implements PetClinicAction {

    private int success_exit = 0;
    private String found_client = "\n Client not found \n";
    private String found_pet = "\n Pet not found \n";

    /**
     * Main method for EditPetAction
     * rename the client`s pet
     *
     * @since 10.11.2016
     */
    @Override
    public void exe(Data data, ConsoleIO consoleIO) {
        do {
            final String name = consoleIO.input_read(" Enter the name of client for edit the nick of his pet: ");
            for (int i = 0; i < data.clients.size(); i++) {
                if (data.clients.get(i).getClientName().equals(name)) {

                    found_client = name;

                    do {
                        final String petNick = consoleIO.input_read("\n Enter the nick of pet: ");
                        if (data.clients.get(i).existPet(petNick)) {
                            System.out.println("\n found pet - " + found_pet);
                            found_pet = petNick;
                            final String newPetNick = consoleIO.input_read("\n Enter the new nick of pet: ");
                            data.clients.get(i).editPetNick(petNick, newPetNick);
                            success_exit = 1;
                        }
                    } while (found_pet.equals("\n Pet not found \n"));
                }
            }
                if (found_client.equals("\n Client not found \n")) {
                    System.out.println(" The clients: \n");
                    data.actions.get(3).exe(data, consoleIO);

                    /**
                     * If client is not exist, ask to create him
                     */
                    final String answer = consoleIO.input_read("\n Add a new client? (y) ");
                    if (answer.equals("y")) {
                        data.actions.get(1).exe(data, consoleIO);
                    } else {
                        success_exit = 1;
                    }
                }

        } while (success_exit == 0);
    }


    /**
     * Text output from console, describe what key
     * we can edit the client do this action EditPetAction
     *
     * @return text from console "Edit the pet - 5"
     * @since 10.11.2016
     */
    @Override
    public void intro() {
        System.out.println(this.key() + " - Edit the pet");
    }

    /**
     * Key for this action
     * need for bind "2" from console input and EditPetAction
     *
     * @return int key
     * @since 15.10.2016
     */

    @Override
    public int key() {
        return 5;
    }
}


