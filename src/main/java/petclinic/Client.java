package petclinic;

import java.util.concurrent.CopyOnWriteArrayList;

    /**.
    * Class describe a customer from petclinic
    * @author k0r0tk0ff
    * @author peterarsentev
    * @since 14.10.2016
    * @version 1.0
    */

public class Client {

        /**.
         * Name name of client.
         */
    private String name;

        /**.
         * Id for find in database
         */
    private int id;

        /**.
         * For return id
         */
    private int getPetIdReturn;

        /**.
         * For determinate, exist pet or not
         */
    private boolean existPetVariable = false;

        /**.
         * database of client
         */
    private CopyOnWriteArrayList<String> petArrayList =
                new CopyOnWriteArrayList<>();

        /**.
         * Default constructor
         * @param id id of client
         * @param name name of client
         * @param petArrayList client`s pets
         */
    public Client(final int id, final String name,
                  final CopyOnWriteArrayList<String> petArrayList) {
        this.id = id;
        this.name = name;
        this.petArrayList = petArrayList;
    }

        /**.
         *
         * @return int id of client
         */
    public final int getClientId() {
        return id;
    }

        /**.
         *
         * @param newName for rename
         */
    public final void setName(final String newName) {
        this.name = newName;
    }

        /**.
         *
         * @param  petNick string value from console
         * @param  newNick a new nick
         *
         */
    public final void editPetNick(final String petNick, final String newNick) {
    for (int j = 0; j < this.petArrayList.size(); j++) {
            if (petNick.equals(this.petArrayList.get(j))) {
                petArrayList.set(j, newNick);
            }
    }
    }

        /**.
         *
         * @param  petNickForExistPet string value from console
         * @return if exist, return true.
         */
    public final boolean existPet(final String petNickForExistPet) {
        for (String aPetArrayList : this.petArrayList) {
            if (petNickForExistPet.equals(aPetArrayList)) {
                existPetVariable = true;
            }
        }
        return existPetVariable;
    }

        /**.
         *
         * @param petNick - String nick of pet
         * @return int id of pet.
         */
    public final int getPetId(final String petNick) {
        for (int j = 0; j < this.petArrayList.size(); j++) {
            if (petNick.equals(this.petArrayList.get(j))) {
                getPetIdReturn = j;
            }
        }
        return getPetIdReturn;
    }

        /**.
         *
         * @return massive of pets.
         */
    public final CopyOnWriteArrayList<String> getPetArrayList() {
        return this.petArrayList;
    }


        /**.
         *
         * @return String name.
         */
    public final String getClientName() {
        return name;
    }

}
