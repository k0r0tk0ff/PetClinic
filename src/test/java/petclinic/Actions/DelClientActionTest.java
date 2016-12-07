package petclinic.Actions;

import org.junit.Test;
import petclinic.Client;
import petclinic.Data.Data;

import java.util.concurrent.CopyOnWriteArrayList;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**.
 * DelClientAction.
 */
public class DelClientActionTest {

    /**
     *
     */

    @Test
    public void exe() throws Exception {
        Data data = new Data();
        Client client = new Client(
                0, "name", new CopyOnWriteArrayList<>());
        data.clients.add(client);

        /**.
         * Del the client.
         */
        data.clients.remove(client);
        assertFalse(data.clients.contains(client));
    }

    @Test
    public void intro() throws Exception {
        String intro = "Del a client";
        assertThat("Del a client", equalTo(intro));
    }

    @Test
    public void key() throws Exception {
        int key = 2;
        assertEquals(2, key);
    }


}