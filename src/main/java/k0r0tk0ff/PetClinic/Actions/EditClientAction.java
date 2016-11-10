package k0r0tk0ff.PetClinic.Actions;

import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.ConsoleIO;


/**
 * Class describe del client to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */
public class EditClientAction implements PetClinicAction {

        /**
         * Main method for EditClientAction
         * add a new client to data storage
         * @since 15.10.2016
         *
         */
        @Override
        public void exe(Data data, ConsoleIO consoleIO) {
            final String name = consoleIO.input_read(" Enter the name of client for edit: ");
                for (int i = 0; i < data.clients.size(); i++) {
                    if (data.clients.get(i).getClientName().equals(name)) {
                        final String new_name = consoleIO.input_read("\n Enter the new name of client");
                        data.clients.get(i).setName(new_name);
                }
            }
        }

        /**
         * Text output from console, describe what key
         * we can edit the client do this action EditClientAction
         * @since 11.11.2016
         *
         * @return text from console "Edit the client - 8"
         */
        @Override
        public void intro(){
            System.out.println(this.key()+" - Edit the client");
        }

        /**
         * Key for this action
         * need for bind "2" from console input and EditClientAction
         * @since 15.10.2016
         *
         * @return int key
         */

        @Override
        public int key(){
            return 8;
        }
    }

