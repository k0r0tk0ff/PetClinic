package k0r0tk0ff.PetClinic;

import k0r0tk0ff.PetClinic.Actions.AddClientAction;
import k0r0tk0ff.PetClinic.Actions.ShowClientsAction;
import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.ConsoleIO;
import k0r0tk0ff.PetClinic.IO.Validator;


import java.util.Scanner;

/**
 * Class for start PetClinic program
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 17.10.2016
 * @version 1.1
 */

public class Starter {


    public static void main(String[] arg){

        Data data = new Data();
        Validator validator = new Validator();

        //System.out.println(" Press any key ");
        MainMenu mainmenu = new MainMenu(data, validator);

        mainmenu.loadAction(new AddClientAction());
        mainmenu.loadAction(new ShowClientsAction());

        mainmenu.runMainMenu();

    }
}
