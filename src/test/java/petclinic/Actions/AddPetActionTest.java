package petclinic.Actions;

import org.junit.Test;

import petclinic.Client;
import petclinic.Data.Data;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**.
 * Test for AddPetAction.
 */
public class AddPetActionTest {

    /**
    @Test
    public void exe() throws Exception {
        Data data = new Data();
        Client client = new Client(
                0, "name", new CopyOnWriteArrayList<>());
        data.clients.add(client);
        data.clients.get(0).getPetArrayList().add("Tobik");
        assertTrue(data.clients.get(0).existPet("Tobik"));

    }

    @Test
    public void intro() throws Exception {
        String intro = "Add a new pet";
        assertThat("Add a new pet", equalTo(intro));
    }

    @Test
    public void key() throws Exception {
        int key = 4;
        assertEquals(4, key);
    }
    */
}