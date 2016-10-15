package k0r0tk0ff.PetClinic;

import k0r0tk0ff.PetClinic.IO.ConsoleIO;
import k0r0tk0ff.PetClinic.IO.IO;
import k0r0tk0ff.PetClinic.IO.Validator;
import k0r0tk0ff.PetClinic.MainMenu;

import java.util.Scanner;

/**
 * Class for start PetClinic program
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */

public class Starter {


    public static void main(String[] arg){
        MainMenu mainmenu = new MainMenu(
                new Validator(
                        new ConsoleIO(
                                new Scanner(System.in)
                        )
                )
        );

        //MainMenu mainmenu = new MainMenu();

        //mainmenu.showMainMenu();
        //mainmenu.showIntroFromActions();

        mainmenu.runMainMenu();

        //mainmenu.runMainMenu(
        //    new Validator(
        //        new ConsoleIO(
        //            new Scanner(System.in)
        //        )
        //    )
        //);
    }
}
