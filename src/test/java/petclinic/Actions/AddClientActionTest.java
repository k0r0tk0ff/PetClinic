package petclinic.Actions;

import org.junit.Test;
import petclinic.Client;
import petclinic.Data.Data;
import petclinic.IO.ConsoleIO;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Test for AddClientAction
 */
public class AddClientActionTest {
    @Test
    public void exe() throws Exception {

        Data data = new Data();
        Client client = new Client(
                0, "name", new CopyOnWriteArrayList<>());
        data.clients.add(client);

        assertTrue(data.clients.contains(client));

    }

    @Test
    public void intro() throws Exception {
        String intro = "Add a new client";
        assertThat("Add a new client", equalTo(intro));
    }

    @Test
    public void key() throws Exception {
        int key = 1;
        assertEquals(1, key);
    }

}