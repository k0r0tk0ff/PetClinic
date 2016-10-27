package k0r0tk0ff.PetClinic.IO;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

/**
 * Validator of input data from console input
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 15.10.2016
 * @version 1.2
 */
public class Checker{
    //private final IO io;
    private double return_double_value = 0.0;
    private int return_int_value = 0;
    private int success_input = 0;
    private boolean exit_compare;

    /**
     * Method return double value after parsing String input from keyboard
     *
     * @return return_double_value
     * @param  input_string (String variable from console)
     */
    public double getDouble(final String input_string){
        while (success_input == 0) {
            try{
                Scanner reader = new Scanner(System.in);
                return_double_value = Double.parseDouble(reader.next());
                success_input = 1;
            }catch (NumberFormatException error){
                System.out.println("\n Error input !!! Try again !!!");
            }
        }
        return return_double_value;
    }

    /**
     * Method return int value after parsing String input from keyboard
     *
     * @param  input_string (String variable from console)
     * @return return_int_value
     */
    public int getInt(final String input_string){
        while (success_input == 0) {
            try{
                Scanner reader = new Scanner(System.in);
                return_int_value = Integer.parseInt(reader.next());
                success_input = 1;
            }catch (NumberFormatException error){
                System.out.println("\n Error input !!! Try again !!!");
            }
        }
        return return_int_value;
    }

    /**
     * Method compare input String variable entered from keyboard with etalon value
     * before ask user question in message_to_out
     *
     * @param  etalon parameter
     * @return true or false
     */
    public boolean compare(final String message_to_out, final String etalon){
        IO io = new ConsoleIO(new Scanner(System.in));
        System.out.print(message_to_out);
        if (etalon.equals(io.input_read())) return true;
        else return false;
    }

    public String getString(String msg){
        IO io = new ConsoleIO(new Scanner(System.in));
        System.out.println(msg);
        return io.input_read();

    }
}
