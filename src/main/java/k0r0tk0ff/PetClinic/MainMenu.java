package k0r0tk0ff.PetClinic;

import k0r0tk0ff.PetClinic.Actions.*;
import k0r0tk0ff.PetClinic.IO.*;
import k0r0tk0ff.PetClinic.IO.Validator;
import java.util.Scanner;

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
    private IO io;
    private final Validator validator;

    public MainMenu(Validator validator) {
        this.validator = validator;
    }



    void showMainMenu(){
        System.out.print("\n Clinic home pets \n");
    }

    void showIntroFromActions(){
           addClientAction.intro();
           delClientAction.intro();
    }


    void runMainMenu(Validator validator){
        do{
            showIntroFromActions();
          } while(this.validator.compare("\n Work farther ? (y)\n", "y"));
    }
}
