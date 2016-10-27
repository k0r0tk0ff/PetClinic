package k0r0tk0ff.PetClinic;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Class describe a customer from petclinic
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */

public class Client {
    String name;
    int id;
    ArrayList<String> arrayList;

    public Client(final String name, ArrayList<String> arrayList){
        this.name = name;
        this.arrayList = arrayList;
    }

    public int getClientId (ConcurrentHashMap<Integer, Client> clients){

        clients.keySet()
        for (Map.Entry<Integer, Client> entry: ConcurrentHashMap.entrySet())
            System.out.println(entry.getKey() + " = " + entry.getValue());



        return id;
    }

    public String getClientName(){
        return name;
    }

}
