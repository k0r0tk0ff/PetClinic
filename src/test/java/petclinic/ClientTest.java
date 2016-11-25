package petclinic;

import org.junit.Test;

import java.util.concurrent.CopyOnWriteArrayList;

import static org.junit.Assert.*;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import org.hamcrest.*;

/**
 * Created by root on 11/25/16.
 */
public class ClientTest {
    @Test
    public void getClientId() throws Exception {
        Client testClient1 = new Client(1, "Vasya", new CopyOnWriteArrayList<>());
        assertEquals(1, (testClient1.getClientId()));
    }

    @Test
    public void setName() throws Exception {
        Client testClient2 = new Client(2, "Vasya", new CopyOnWriteArrayList<>());
        testClient2.setName("Petr");
        assertThat("Petr", equalTo(testClient2.getClientName()));
    }

    @Test
    public void editPetNick() throws Exception {
        Client testClient3 = new Client(3, "Iogann", new CopyOnWriteArrayList<>());
        testClient3.getPetArrayList().add("Murka");
        testClient3.editPetNick("Murka", "Bagira");
        assertTrue(testClient3.existPet("Bagira"));
    }

    @Test
    public void getPetId() throws Exception {
        Client testClient4 = new Client(4, "Iogann", new CopyOnWriteArrayList<>());
        testClient4.getPetArrayList().add("Murka");
        assertEquals(0, testClient4.getPetId("Murka"));
    }
}