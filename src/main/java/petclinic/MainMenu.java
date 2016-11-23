package petclinic;

import petclinic.Actions.*;
import petclinic.Data.Data;
import petclinic.IO.Checker;
import petclinic.IO.ConsoleIO;

    /**
    * Class describe a MainMenu
    * @author k0r0tk0ff
    * @author peterarsentev
    * @since 14.10.2016
    * @version 1.0
    */

public class MainMenu {

    private ConsoleIO consoleIO;
    private Data data;
    private Checker checker;

    public MainMenu(Data data, ConsoleIO consoleIO, Checker checker) {
        this.data = data;
        this.consoleIO = consoleIO;
        this.checker = checker;
    }

    // this methods rewrite with Petr Arsentev help
    //void showMainMenu(){
    //    System.out.print("\n Clinic home pets \n");
    //}

    //void showIntroFromActions(){
    //    this.data.actions.values().forEach(PetClinicAction::intro);
    //}

    void loadAction(final PetClinicAction action){
        this.data.actions.put(action.key(), action);
    }

    void runMainMenu(){

        //do{
        //    showMainMenu();
        //    showIntroFromActions();


        /**
            Iterator<HashMap.Entry<Integer, PetClinicAction>> entries = data.actions.entrySet().iterator();
            while (entries.hasNext()){
                HashMap.Entry<Integer, PetClinicAction> entry = entries.next();
                System.out.println("Key = " + entry.getKey() + ", Value = " +
                        entry.getValue());
                if (entry.getKey() == checker.getInt(consoleIO.input_read(" Enter an action : "))){
                    entry.getValue().exe(data);
                }
            }
        */

        // my version
        //    int input_key = checker.getInt(this.consoleIO);
        //    for (Map.Entry<Integer, PetClinicAction> entries : data.actions.entrySet()) {
        //        if (entries.getKey().equals(input_key)){
        //                      entries.getValue().exe(this.data, this.consoleIO);
        //           }
        //    }
        //} while(this.checker.compare("y", consoleIO));

        // version of Petr Arsentev

        do {
            for (Integer key : this.data.actions.keySet()) {
                System.out.println(
                    String.format("key = %d  action = %s", key, this.data.actions.get(key).intro())
                );
            }

            int entered_key = checker.getInt(this.consoleIO);

            for (Integer key : this.data.actions.keySet()) {
                if(entered_key == this.data.actions.get(key).key()){
                    this.data.actions.get(key).exe(this.data, this.consoleIO);}
            }
        } while(this.checker.compare("y", consoleIO));
    }
}
