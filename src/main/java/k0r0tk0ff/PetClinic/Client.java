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
    int clientId;
    ArrayList<String> pets = new ArrayList<String>();

    public Client(String name){
        this.name = name;
    }


}
