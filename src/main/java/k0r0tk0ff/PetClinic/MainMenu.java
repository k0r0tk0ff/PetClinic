package k0r0tk0ff.PetClinic;

import k0r0tk0ff.PetClinic.Actions.*;
import k0r0tk0ff.PetClinic.Data.Data;
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



    private final Validator validator;
    public Data data;

    AddClientAction addClientAction = new AddClientAction(data);
    //DelClientAction delClientAction = new DelClientAction(data);


    public MainMenu(Validator validator, Data data) {
        this.validator = validator;
        this.data = data;
    }

    void showMainMenu(){
        System.out.print("\n Clinic home pets \n");
    }

    void showIntroFromActions(){
           addClientAction.intro();
           //delClientAction.intro();
    }


    void runMainMenu(){

        addClientAction.exe();

        do{
            showMainMenu();
            showIntroFromActions();




            for ( Client client : data.clients ) {
                client.getClientName();
            }



          } while(this.validator.compare("\n Work farther ? (y)\n", "y"));
    }
}
