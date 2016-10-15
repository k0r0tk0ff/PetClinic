package k0r0tk0ff.PetClinic.IO;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;


/**
 * Interface for console input from keyboard
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 15.10.2016
 * @version 1.1
 */
public class ConsoleIO implements IO {
    private Scanner scanner = new Scanner(System.in);

    public ConsoleIO(final Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String print(String string){
        return string;
    }

    @Override
    public String input_read() {
        return this.scanner.next();
    }


}
