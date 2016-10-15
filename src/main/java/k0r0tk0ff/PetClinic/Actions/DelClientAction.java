package k0r0tk0ff.PetClinic.Actions;

import javax.swing.*;

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
        public void exe(){

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

