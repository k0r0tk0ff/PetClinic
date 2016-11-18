package k0r0tk0ff.PetClinic.Actions;

import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.ConsoleIO;


/**
 * Class describe find client`s pet to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 18.11.2016
 * @version 1.0
 */
public class FindPetAction implements PetClinicAction {

    private int success_exit = 0;
    private String found_pet = "\n Pet not found \n";

    /**
     * Main method for FindPetAction
     * rename the client`s pet
     *
     * @since 18.11.2016
     */
    @Override
    public void exe(Data data, ConsoleIO consoleIO) {
        do {
            final String nick_for_find = consoleIO.input_read(" Enter the nick of pet for find: ");
            for (int i = 0; i < data.clients.size(); i++) {
                 if (data.clients.get(i).existPet(nick_for_find)) {
                        System.out.println(String.format("\n Founf pet - %s", nick_for_find));
                        found_pet = nick_for_find;
                        System.out.println(String.format("\n Pet`s owner - %s", data.clients.get(i).getClientName()));
                        success_exit = 1;
                    }
            }
        } while (success_exit == 0);
    }

    /**
     * Text output from console, describe what key
     * we can edit the client do this action EditPetAction
     *
     * @return text from console "Find the pet - 8"
     * @since 18.11.2016
     */
    @Override
    public void intro(){ System.out.println(String.format("%s - Find the pet", this.key())); }

    /**
     * Key for this action
     * need for bind "8" from console input and FindPetAction
     *
     * @return int key
     * @since 18.11.2016
     */

    @Override
    public int key() {
        return 8;
    }
}


