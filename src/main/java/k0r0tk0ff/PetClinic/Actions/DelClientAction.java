package k0r0tk0ff.PetClinic.Actions;

import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.ConsoleIO;

import java.util.Map;


/**
 * Class describe del client to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */
public class DelClientAction implements PetClinicAction {

    private String found_client = "\n Client not found \n";
         /**
         * Main method for DelClientAction
         * add a new client to data storage
         * @since 15.10.2016
         *
         */
        @Override
        public void exe(Data data, ConsoleIO consoleIO){
            final String name = consoleIO.input_read(" Enter the name of client: ");
            for ( int i = 0; i < data.clients.size(); i++) {
                if(data.clients.get(i).getClientName().equals(name)){
                    found_client = String.format("found the Client - %s \n",name);
                    data.clients.remove(i);
                }
            }
            System.out.println(String.format("%s \n",found_client));
        }

        /**
         * Text output from console, describe what key
         * we can delete the client do this action DelClientAction
         * @since 15.10.2016
         *
         * @return text from console "Add a new client - 1"
         */
        @Override
        public String intro() { return " Del the client"; }

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

