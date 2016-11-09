package k0r0tk0ff.PetClinic;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

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
    int getPetIdReturn;
    boolean existPetVariable = false;
    CopyOnWriteArrayList<String> petArrayList;

    public Client(int id, final String name, CopyOnWriteArrayList<String> petArrayList){
        this.id = id;
        this.name = name;
        this.petArrayList = petArrayList;
    }

    public int getClientId (){
        return id;
    }

    public boolean existPet(final String petNick) {
        for (int j = 0; j < this.petArrayList.size(); j++) {
            if (petNick.equals(this.petArrayList.get(j))) {
                existPetVariable = true;
            }
        }
        return existPetVariable;
    }
    public int getPetId (final String petNick){
        for(int j = 0; j < this.petArrayList.size(); j++){
            if(petNick.equals(this.petArrayList.get(j))){
                getPetIdReturn = j;
            }
        }
        return getPetIdReturn;
    }

    public CopyOnWriteArrayList<String> getPetArrayList(){
        return this.petArrayList;
    }



    public String getClientName(){
        return name;
    }

}
