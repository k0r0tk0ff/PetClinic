package petclinic;

import petclinic.Data.Data;
import petclinic.IO.Checker;
import petclinic.IO.ConsoleIO;

import java.util.Scanner;


/**.
 * Emulate user activity.
 */
public class EmulateUsers {
    public void main(String[] args) {

        Data data = new Data();
        ConsoleIO consoleIO = new ConsoleIO(new Scanner(System.in));
        Checker checker = new Checker();

        MainMenu mainMenuForThread = new MainMenu(data, consoleIO, checker);


        Thread thread1 = new Thread(new EmulateUserActivities(mainMenuForThread,"Petr","Murzik",1));
        thread1.start();

        Thread thread2 = new Thread(new EmulateUserActivities(mainMenuForThread,"Vasya","Bayun",1));
        thread2.start();

        Thread thread3 = new Thread(new EmulateUserActivities(mainMenuForThread,"Kodya","Murka",1));
        thread3.start();
    }
}
