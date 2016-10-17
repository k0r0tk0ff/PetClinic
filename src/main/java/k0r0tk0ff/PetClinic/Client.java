package k0r0tk0ff.PetClinic;

import java.util.ArrayList;

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

    public Client(int id, final String name, ArrayList<String> arrayList){
        this.id = id;
        this.name = name;
        this.arrayList = arrayList;
    }

    int getClientId (){
        return this.id;
    }

    String getClientName(){
        return this.name;
    }

}
