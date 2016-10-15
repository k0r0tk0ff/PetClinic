package k0r0tk0ff.PetClinic;

import k0r0tk0ff.PetClinic.Actions.*;
import k0r0tk0ff.PetClinic.IO.*;

/**
 * Class describe a MainMenu
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */

public class MainMenu {

    AddClientAction addClientAction = new AddClientAction();
    Validator validator = new Validator;

    void showIntroFromActions(){
           addClientAction.intro();
    }

    validator.aaa();

    //public void starter(){
    //    do{
    //       showIntroFromActions();

    //    }while();
}
