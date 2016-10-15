package k0r0tk0ff.PetClinic;

import k0r0tk0ff.PetClinic.MainMenu;

/**
 * Class for start PetClinic program
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */

public class Starter {


    public static void main(String[] arg){
        MainMenu mainmenu = new MainMenu();

        mainmenu.showMainMenu();
        mainmenu.showIntroFromActions();
    }
}
