package k0r0tk0ff.PetClinic.Data;

import k0r0tk0ff.PetClinic.Client;

import k0r0tk0ff.PetClinic.Actions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Interface for console input from keyboard
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 15.10.2016
 * @version 1.0
 */

public class Data implements I_DataModel {

    public CopyOnWriteArrayList<Client> clients = new CopyOnWriteArrayList<>();

    public ConcurrentHashMap<Integer, PetClinicAction> actions = new ConcurrentHashMap<>();
}
