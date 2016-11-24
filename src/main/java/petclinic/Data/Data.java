package petclinic.Data;

import petclinic.Client;

import petclinic.Actions.*;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

    /**.
    * Interface for console input from keyboard
    * @author k0r0tk0ff
    * @author peterarsentev
    * @since 15.10.2016
    * @version 1.0
    */

public class Data implements IDataModel {

        /**.
         * Database of client
         */
    public CopyOnWriteArrayList<Client> clients =
                new CopyOnWriteArrayList<>();

        /**.
         * Database of objects with methods
         */
    public ConcurrentHashMap<Integer, PetClinicAction> actions =
                new ConcurrentHashMap<>();
}
