package petclinic.Actions;

import org.junit.Test;
import petclinic.Client;
import petclinic.Data.Data;
import petclinic.IO.Checker;
import petclinic.IO.ConsoleIO;
import petclinic.MainMenu;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Test for AddClientAction
 */
public class AddClientActionTest {

    /**

    @Test
    public void exe() throws Exception {

            //arrange
        MainMenu mainMenuForTest = new MainMenu(new Data(),
                new ConsoleIO(new Scanner(System.in)), new Checker());
        mainMenuForTest.loadAction(new AddClientAction());

            //act
        mainMenuForTest.getData().actions.get(1).exe(mainMenuForTest.getData(),
                mainMenuForTest.getConsoleIo());

        int aaa = 0;
        final String nameForFound = "aaa";
        for (int i = 0; i < mainMenuForTest.getData().clients.size(); i++) {
            if (mainMenuForTest.getData().clients.get(i).getClientName().
                    equals(nameForFound)) {
                aaa = 1;
            }
        }

           //assert
        assertEquals(1, aaa);
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

    */
}