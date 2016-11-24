package petclinic.IO;

    /**.
    * Validator of input data from console input
    * @author k0r0tk0ff
    * @author peterarsentev
    * @since 15.10.2016
    * @version 1.2
    */

public class Checker {

    /**.
     * Method return double value after parsing String input from keyboard
     *
     * @return return_double_value
     * @param  inputString (String variable from console)
     */
    public final double getDouble(final String inputString) {

        /**
         * Declare if for exit from cycle
         */
        int successInput = 0;

        /**
         * Declare default value for variable
         */
        double returnDoubleValue = 0.0;

        while (successInput == 0) {
            try {
                returnDoubleValue = Double.parseDouble(inputString);
                successInput = 1;
            } catch (NumberFormatException error) {
                System.out.println("\n Error input !!! Try again !!!");
            }
        }
        return returnDoubleValue;
    }

    /**.
     * Method return int value after parsing String input from keyboard
     * @param  consoleIO input from console
     * @return returnIntValue.
     *
     */
    public final int getInt(final ConsoleIO consoleIO) {

        /**
         * Declare if for exit from cycle
         */
        int successInput = 0;

        /**
         * Declare default mean for variable
         */
        int returnIntValue = 0;

        while (successInput == 0) {
            try {
                String inputString = consoleIO.inputRead(" Enter an action : ");
                returnIntValue = Integer.parseInt(inputString);
                successInput = 1;
            } catch (NumberFormatException error) {
                System.out.println("\n Error input !!! Try again !!!");
            }
        }
        return returnIntValue;
    }

    /**.
     * Method compare input String variable entered
     * from keyboard with etalon value
     * before ask user question in message_to_out
     *
     * @param  consoleIO input from console
     * @param  etalon EtAlOn for compare
     * @return true or false.
     */
    public final boolean compare(final String etalon,
                                 final ConsoleIO consoleIO) {
        return etalon.equals(consoleIO.inputRead("\n Work further? (y)"));
    }
}
