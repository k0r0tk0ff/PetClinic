package petclinic.Actions;

import org.junit.Test;
import petclinic.Client;
import petclinic.Data.Data;

import java.util.concurrent.CopyOnWriteArrayList;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * DelPetAction Test
 */
public class DelPetActionTest {
    @Test
    public void exe() throws Exception {
        Data data = new Data();
        Client client2 = new Client(
                0, "Ashot", new CopyOnWriteArrayList<>());
        data.clients.add(client2);
        data.clients.get(0).getPetArrayList().add("Bobik");
        data.clients.get(0).getPetArrayList().remove("Bobik");
        assertFalse(data.clients.get(0).existPet("Bobik"));

    }

    @Test
    public void intro() throws Exception {
        String intro = "Del a pet";
        assertThat("Del a pet", equalTo(intro));
    }

    @Test
    public void key() throws Exception {
        int key = 7;
        assertEquals(7, key);
    }
}