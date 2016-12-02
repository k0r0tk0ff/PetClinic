package petclinic;

import petclinic.Actions.PetClinicAction;

import petclinic.Data.Data;
import petclinic.IO.Checker;
import petclinic.IO.ConsoleIO;

import java.util.Scanner;

    /**.
    * Class describe a MainMenu
    * @author k0r0tk0ff
    * @author peterarsentev
    * @since 14.10.2016
    * @version 1.0
    */

public class MainMenu {

    /**.
     * Declare main variables:
     * ConsoleIO consoleIO - input/output from console
     */
    private ConsoleIO consoleIO = new ConsoleIO(new Scanner(System.in));

    /**.
    * Declare main variables:
    * Data data - data storage.
    */
    private Data data = new Data();

    /**.
    * Declare main variables:
    * Checker checker - validator for input.
    */
    private Checker checker = new Checker();

    /**.
    * Declare constructor.
    * @param data - storage
    * @param consoleIO - work with console
    * @param checker - validator.
    */
    public MainMenu(final Data data, final ConsoleIO consoleIO,
                    final Checker checker) {
        this.data = data;
        this.consoleIO = consoleIO;
        this.checker = checker;
    }

    /**.
    * Declare method for create an object,
    * for further work.
    * @param action - method for action.
    */
    public final void loadAction(final PetClinicAction action) {
        this.data.actions.put(action.key(), action);
    }

        /**.
         * Declare method of getData  - for work tests.
         */
    public Data getData() {
        return this.data;
    }

        /**.
         * Declare main method of project.
         */
    public ConsoleIO getConsoleIo() {
        return this.consoleIO;
    }

        /**.
         * Declare main method of project.
         */
    final void runMainMenu() {

        /**
            Iterator<HashMap.Entry<Integer, PetClinicAction>> entries = data.
         actions.entrySet().iterator();
            while (entries.hasNext()){
                HashMap.Entry<Integer, PetClinicAction> entry =
         entries.next();
                System.out.println("Key = " + entry.getKey() + ", Value = " +
                        entry.getValue());
                if (entry.getKey() == checker.getInt(consoleIO.inputRead(
         " Enter an action : "))){
                    entry.getValue().exe(data);
                }
            }
        */

        do {
            for (Integer key : this.data.actions.keySet()) {
                System.out.println(
                    String.format("key = %d  action = %s",
                            key, this.data.actions.get(key).intro())
                );
            }

            int enteredKey = checker.getInt(this.consoleIO);

            for (Integer key : this.data.actions.keySet()) {
                if (enteredKey == this.data.actions.get(key).key()) {
                    this.data.actions.get(key).
                            exe(this.data, this.consoleIO);
                }
            }
        } while (this.checker.compare("y", consoleIO));
    }
}
