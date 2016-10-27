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

    /**
     * Method return double value after parsing String input from keyboard
     *
     * @return return_double_value
     * @param  input_string (String variable from console)
     */
    public double getDouble(final String input_string){

        /**
         * Initializate local field in methods body,
         * for replacement values between method`s call
         * @param  input_string (String variable from console)
         * @return return_double_value
         */
        int success_input = 0;
        double return_double_value = 0.0;

        while (success_input == 0) {
            try{
                return_double_value = Double.parseDouble(input_string);
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
    public int getInt(String input_string){

        /**
         * Initializate local field in methods body,
         * for replacement values between method`s call
         * @param  input_string (String variable from console)
         * @return return_int_value
         */
        int success_input = 0;
        int return_int_value = 0;

        while (success_input == 0) {
            try{
                return_int_value = Integer.parseInt(input_string);
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
    public boolean compare(final String etalon, final ConsoleIO consoleIO){

        if (etalon.equals(consoleIO.input_read("Try again? (y)"))) return true;
        else return false;
    }
}
