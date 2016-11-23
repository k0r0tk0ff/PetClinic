package petclinic;

import petclinic.Actions.*;
import petclinic.Data.Data;
import petclinic.IO.Checker;
import petclinic.IO.ConsoleIO;

import java.util.Scanner;

    /**
    * Class for start petclinic program
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
        mainmenu.loadAction(new EditPetAction());
        mainmenu.loadAction(new FindPetAction());
        mainmenu.loadAction(new FindClientAction());

        mainmenu.runMainMenu();
    }
}
