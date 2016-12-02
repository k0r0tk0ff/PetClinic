package petclinic;

import petclinic.Actions.AddClientAction;
import petclinic.Actions.PetClinicAction;
import petclinic.Data.Data;

import javax.swing.*;

/**.
 * Emulate user activity.
 */
public class EmulateUsers {
    public void main(String[] args) {
        new EmulateUserActivites().startActivities();
    }

    public void startActivities(){
        Data data = new Data();
        new EmulateUserActivites(
                this.build(
                        data,
                        new String[] {"1", "Petr", "y"},
                        new AddClientAction()
                )
        ).start();
    }

    public MainMenu build(Data data, String[] answers, Action ... actions) {
        MainMenu mainMenu = new MainMenu(

                new StubInput(answers)
        );
        for (this.data.actions:){

        } (this.data.actions : actions) {
            mainMenu.loadAction(action);
        }
    }
}
