package k0r0tk0ff.PetClinic;

import k0r0tk0ff.PetClinic.Actions.*;
import k0r0tk0ff.PetClinic.IO.*;
import k0r0tk0ff.PetClinic.IO.Validator;

/**
 * Class describe a MainMenu
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */

public class MainMenu {

    AddClientAction addClientAction = new AddClientAction();
    DelClientAction delClientAction = new DelClientAction();
    //private IO io;
    Validator validator = new Validator();

    void showMainMenu(){
        System.out.print("\n Clinic home pets \n");
    }

    void showIntroFromActions(){
           addClientAction.intro();
           delClientAction.intro();
    }

    //validator.getI();

    //public void starter(){
    //    do{
    //       showIntroFromActions();

    //    }while();
}
