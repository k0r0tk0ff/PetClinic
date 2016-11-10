package k0r0tk0ff.PetClinic;

import k0r0tk0ff.PetClinic.Actions.*;
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
        mainmenu.loadAction(new AddPetAction());
        mainmenu.loadAction(new ShowPetAction());
        mainmenu.loadAction(new DelPetAction());
        mainmenu.loadAction(new EditClientAction());


        mainmenu.runMainMenu();
    }
}
