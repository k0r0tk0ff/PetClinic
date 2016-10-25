package k0r0tk0ff.PetClinic;

import k0r0tk0ff.PetClinic.Actions.*;
import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.ConsoleIO;
import k0r0tk0ff.PetClinic.IO.Validator;

import java.util.Scanner;


/**
 * Class describe a MainMenu
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */

public class MainMenu {

    public Data data;
    public Validator validator;
    int entry_key;

    //int success_exit = 0;

    public MainMenu(Data data, Validator validator) {
         this.data = data;
         this.validator = validator;
     }

    void showMainMenu(){
        System.out.print("\n Clinic home pets \n");
    }

    void showIntroFromActions(){
        data.actions.values().forEach(PetClinicAction::intro);
    }

    void loadAction(final PetClinicAction action){
        this.data.actions.put(action.key(), action);
    }

    void runMainMenu(){

        do{
            showMainMenu();
            showIntroFromActions();

            Validator val2 = new Validator();

            //Iterator<HashMap.Entry<Integer, PetClinicAction>> entries = data.actions.entrySet().iterator();
            //while (entries.hasNext()){
            //    HashMap.Entry<Integer, PetClinicAction> entry = entries.next();
            //    //System.out.println("Key = " + entry.getKey() + ", Value = " +
            //    //        entry.getValue());
            //    if (entry.getKey() == validator.getInt(validator.getString(" Enter an action : "))){
            //        entry.getValue().exe(data, validator);
            //    }
            //}

            entry_key = val2.getInt(val2.getString(" Press the key: "));
            this.data.actions.get(entry_key).exe(this.data);

            System.out.println(" Input is "+ entry_key);

        } while(validator.compare("\n Work farther ? (y)\n", "y"));
    }
}
