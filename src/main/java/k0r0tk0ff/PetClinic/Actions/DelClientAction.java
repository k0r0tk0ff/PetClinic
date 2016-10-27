package k0r0tk0ff.PetClinic.Actions;

import k0r0tk0ff.PetClinic.Client;
import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.ConsoleIO;

import java.util.ArrayList;


/**
 * Class describe del client to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */
public class DelClientAction implements PetClinicAction {

        /**
         * Main method for DelClientAction
         * add a new client to data storage
         * @since 15.10.2016
         *
         */
        @Override
        public void exe(Data data, ConsoleIO consoleIO){
            int success_exit = 0;
            do {
                final String entered_name = consoleIO.input_read(" Enter the name of client: ");
                for (Client client : data.clients) {
                    if (client.getClientName().equals(entered_name)) {
                        data.clients.remove(client.getClientId());
                        success_exit = 1;
                    } else {
                        System.out.println(" Client does not exist. Try again");
                        System.out.println(" List of clients: - ");
                            for (Client iterable : data.clients) {
                                System.out.println(iterable.getClientName());
                            }
                    }
                }
            } while (success_exit == 0);
        }

        /**
         * Text output from console, describe what key
         * we can delete the client do this action DelClientAction
         * @since 15.10.2016
         *
         * @return text from console "Add a new client - 1"
         */
        @Override
        public void intro(){
            System.out.println(this.key()+" - Del the client");
        }

        /**
         * Key for this action
         * need for bind "2" from console input and DelClientAction
         * @since 15.10.2016
         *
         * @return int key
         */

        @Override
        public int key(){
            return 2;
        }
    }

