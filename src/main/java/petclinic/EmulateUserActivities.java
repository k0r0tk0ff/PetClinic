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
public class EmulateUserActivities implements Runnable {

    /**.
     * Declare variables - data pool.
     */

    private final int keyForAction;
    private final String clientName;
    private final String petNick;

    MainMenu mainMenuForThread;




    public EmulateUserActivities(MainMenu mainMenuForThread, String clientName,
                                String petNick, int keyForAction) {
        this.keyForAction = keyForAction;
        this.petNick = petNick;
        this.clientName = clientName;
        this.mainMenuForThread = mainMenuForThread;
    }


    @Override
    public void run() {
        mainMenuForThread.getData().actions.get(keyForAction).
                exe(this.mainMenuForThread.getData(), clientName, petNick);
    }
}
