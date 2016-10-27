package k0r0tk0ff.PetClinic.IO;

import java.io.Closeable;
import java.io.IOException;
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
public class ConsoleIO implements IO, Closeable {

    private Scanner scanner;
    private String a;

    public ConsoleIO(final Scanner scanner) {
        this.scanner = scanner;
    }

   // public String getString(String msg){
   //     System.out.println(msg);
   //     return input_read();
   // }

    @Override
    public String print(String string){
        return string;
    }

    @Override
    public String input_read(String msg) {
        System.out.println(msg);
        a = scanner.next();
        return a;
    }


    /**
     * Closes this stream and releases any system resources associated
     * with it. If the stream is already closed then invoking this
     * method has no effect.
     * <p>
     * <p> As noted in {@link AutoCloseable#close()}, cases where the
     * close may fail require careful attention. It is strongly advised
     * to relinquish the underlying resources and to internally
     * <em>mark</em> the {@code Closeable} as closed, prior to throwing
     * the {@code IOException}.
     *
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void close() throws IOException {

    }

}
