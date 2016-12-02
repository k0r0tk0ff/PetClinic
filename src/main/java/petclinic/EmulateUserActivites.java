package petclinic;

import java.util.Scanner;

import petclinic.Actions.*;
import petclinic.Data.Data;
import petclinic.IO.Checker;
import petclinic.IO.ConsoleIO;
import petclinic.MainMenu;

/**.
 * Class for multithread user activities.
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */
public class EmulateUserActivites extends Thread {

    /**.
     * Declare variables - data pool.
     */
    private final MainMenu multiThreadMainMenu;

    public EmulateUserActivites(MainMenu multiThreadMainMenu) {
        this.multiThreadMainMenu = multiThreadMainMenu ;
    }


    @Override
    public void run() {
        multiThreadMainMenu.runMainMenu();
    }
}
