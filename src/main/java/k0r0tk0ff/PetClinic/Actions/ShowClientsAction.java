package k0r0tk0ff.PetClinic.Actions;

import k0r0tk0ff.PetClinic.Client;
import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.Validator;

/**
 * Class need for show clients from data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 21.10.2016
 * @version 1.0
 */

public class ShowClientsAction implements PetClinicAction {

    /**
     * Main method for ShowClientsAction
     * @since 21.10.2016
     *
     * Show clients in data storage
     */
    @Override
    public void exe(Data data){

        /**
         * Show clients
         */
        for (Client client : data.clients) {
            System.out.println(client.getClientName());
        }

    }

    /**
     * Text output from console, describe what key
     * we can push for do this action AddClientAction
     * @since 14.10.2016
     * @version 1.0
     *
     * @return text from console "Add a new client - 3"
     */
    @Override
    public void intro(){
        System.out.println(this.key()+" - Show the clients ");
    }

    /**
     * Key for this action
     * need for bind "1" from console input and AddClientAction
     * @since 14.10.2016
     * @version 1.0
     *
     * @return int key
     */

    @Override
    public int key(){
        return 3;
    }
}
