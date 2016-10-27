package k0r0tk0ff.PetClinic;

import k0r0tk0ff.PetClinic.Actions.AddClientAction;
import k0r0tk0ff.PetClinic.Actions.DelClientAction;
import k0r0tk0ff.PetClinic.Actions.ShowClientsAction;
import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.Checker;
import k0r0tk0ff.PetClinic.IO.ConsoleIO;



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
        ConsoleIO consoleIO = new ConsoleIO(new Scanner(System.in));
        Checker checker = new Checker();

        MainMenu mainmenu = new MainMenu(data, consoleIO, checker);


        mainmenu.loadAction(new AddClientAction());
        mainmenu.loadAction(new ShowClientsAction());
        mainmenu.loadAction(new DelClientAction());

        mainmenu.runMainMenu();
    }
}
