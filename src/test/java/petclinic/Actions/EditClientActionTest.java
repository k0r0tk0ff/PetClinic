package petclinic.Actions;

import org.junit.Test;
import petclinic.Client;
import petclinic.Data.Data;

import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.Assert.*;

/**
 * Created by root on 11/30/16.
 */
public class EditClientActionTest {
    @Test
    public void exe() throws Exception {
        Data data = new Data();
        boolean findClienWithNewName = false;
        Client client3 = new Client(
                0, "Sergey", new CopyOnWriteArrayList<>());
        data.clients.add(client3);

        for (int i = 0; i < data.clients.size(); i++) {
            if (data.clients.get(i).getClientName().equals("Sergey")) {
                  data.clients.get(i).setName("Vasya");
            }
        }

        assertTrue(data.clients.get(0).getClientName().equals("Vasya"));

    }

    @Test
    public void intro() throws Exception {

    }

    @Test
    public void key() throws Exception {

    }

}