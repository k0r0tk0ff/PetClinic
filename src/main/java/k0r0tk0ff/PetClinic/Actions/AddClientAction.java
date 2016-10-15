package k0r0tk0ff.PetClinic.Actions;

/**
 * Class describe add client to data storage
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */

public class AddClientAction implements PetClinicAction {

    /**
     * Main method for AddClientAction
     * add a new client to data storage
     * @since 14.10.2016
     * @version 1.0
     *
     * @return int key
     */
    @Override
    public void exe(){

    }

    /**
     * Text output from console, describe what key
     * we can push for do this action AddClientAction
     * @since 14.10.2016
     * @version 1.0
     *
     * @return text from console "Add a new client - 1"
     */
    @Override
    public void intro(){
        System.out.print(" Add a new client - "+this.key());
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
        return 1;
    }
}
