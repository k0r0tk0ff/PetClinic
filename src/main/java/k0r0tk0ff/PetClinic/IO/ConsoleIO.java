package k0r0tk0ff.PetClinic.IO;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Interface for console input from keyboard
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */
public class ConsoleIO implements IO {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String print(String string){
        return string;
    }

    @Override
    public String input() {
        return this.scanner.next();
    }
}
