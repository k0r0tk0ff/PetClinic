package petclinic.Actions;

import petclinic.Data.Data;
import petclinic.IO.ConsoleIO;

/**.
 * Interface describe an action with client and his pets
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */

public interface PetClinicAction {
    /**.
     * intro - information about action
     * @return - information about action
     *
     */
    String intro();

    /**.
     * exe - information main method of action
     *
     * @param data - our database from concurenthashmap
     * @param consoleIO - console input
     */
    void exe(Data data, ConsoleIO consoleIO);

    /**.
     * key - for bind to keyboard
     * @return - int key
     */
    int key();
}
