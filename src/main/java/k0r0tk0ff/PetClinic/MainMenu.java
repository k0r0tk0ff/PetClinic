package k0r0tk0ff.PetClinic;

import k0r0tk0ff.PetClinic.Actions.*;
import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.*;
import k0r0tk0ff.PetClinic.IO.Validator;

import java.util.Map;
import java.util.Scanner;

/**
 * Class describe a MainMenu
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */

public class MainMenu {

    public Validator validator;
    public Data data;
    //int success_exit = 0;

    public MainMenu(Validator validator, Data data) {
        this.validator = validator;
        this.data = data;
     }

    void showMainMenu(){
        System.out.print("\n Clinic home pets \n");
    }

    void showIntroFromActions(){
        data.actions.values().forEach(PetClinicAction::intro);
    }

    void loadAction(final PetClinicAction action){
        data.actions.put(action.key(), action);
    }

    void runMainMenu(){

        do{
            showMainMenu();
            showIntroFromActions();

            for (Map.Entry<Integer, PetClinicAction> entry : data.actions.entrySet()) {
                if(entry.getKey() ==
                        validator.getInt(validator.getString(" Enter the action: "))
                  )
                {entry.getValue().exe(data, validator);}
            }

            ///**
            // * Do add client
            // */
            //for (PetClinicAction action: data.actions.values()) {
            //    action.exe(data, validator);
            //}



        } while(validator.compare("\n Work farther ? (y)\n", "y"));
    }
}
