package petclinic;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

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

    private MainMenu privateMainMenuForThread;




    public EmulateUserActivities(MainMenu privateMainMenuForThread, final String clientName,
                                final String petNick, final int keyForAction) {
        this.keyForAction = keyForAction;
        this.petNick = petNick;
        this.clientName = clientName;
        this.privateMainMenuForThread = privateMainMenuForThread;
    }


   // @Override
   // public void run() {
   //     privateMainMenuForThread.getData().actions.get(keyForAction).
   //                 exe(privateMainMenuForThread.getData(), clientName, petNick);
   // }

    @Override
    public void run() {
        //privateMainMenuForThread.getData().actions.get(keyForAction).
        //        exe(privateMainMenuForThread.getData(), clientName, petNick);

        privateMainMenuForThread.getData().clients.add(new Client(keyForAction, clientName,
                new CopyOnWriteArrayList<String>()));

        System.out.println("\n For DeBuG ");
        System.out.println(keyForAction);
        System.out.println(clientName);
        System.out.println(petNick);


    //    privateMainMenuForThread.getData().clients.add(new Client(
    //            0, "aaa", new CopyOnWriteArrayList<>()));
    }
}
