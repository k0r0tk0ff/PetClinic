package petclinic;

import petclinic.Actions.*;
import petclinic.Data.Data;
import petclinic.IO.Checker;
import petclinic.IO.ConsoleIO;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;


/**.
 * Emulate user activity.
 */
public class EmulateUsers {
    public static void main(String[] args) {


        ConsoleIO consoleIO = new ConsoleIO(new Scanner(System.in));
        Checker checker = new Checker();
        Data data = new Data();

        //MainMenu mainMenuForThread = new MainMenu(new Data(), new ConsoleIO(new Scanner(System.in)),
        //        new Checker());

        MainMenu mainMenuForThread = new MainMenu(data, consoleIO, checker);

        mainMenuForThread.loadAction(new AddClientAction());
        mainMenuForThread.loadAction(new ShowClientsAction());
        mainMenuForThread.loadAction(new DelClientAction());
        mainMenuForThread.loadAction(new AddPetAction());
        mainMenuForThread.loadAction(new ShowPetAction());
        mainMenuForThread.loadAction(new DelPetAction());
        mainMenuForThread.loadAction(new EditClientAction());
        mainMenuForThread.loadAction(new EditPetAction());
        mainMenuForThread.loadAction(new FindPetAction());
        mainMenuForThread.loadAction(new FindClientAction());


        //Thread thread1 = new Thread(new EmulateUserActivities(mainMenuForThread,"Petr","Murzik",1));
        //thread1.start();

        Thread thread2 = new Thread(new EmulateUserActivities(mainMenuForThread,"Vasya","Bayun",1));
        thread2.start();

        Thread thread3 = new Thread(new EmulateUserActivities(mainMenuForThread,"Kodya","Murka", 1));
        thread3.start();


        //data.clients.add(new Client(
        //        1, "11aaa", new CopyOnWriteArrayList<>()));

        System.out.println("\n Show the petclinic`s clients: \n");
        for (Client client : data.clients) {
            System.out.println(client.getClientName());
        }

        //Thread thread4 = new Thread(new EmulateUserActivities(mainMenuForThread,"Kodya","Murka",3));
        //thread4.start();
    }
}
