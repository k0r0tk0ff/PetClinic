package petclinic.IO;

import java.io.Closeable;
import java.io.IOException;
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
    private String a = "a";

    public ConsoleIO(final Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String inputRead(String msg) {
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
