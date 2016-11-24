package petclinic.IO;

    /**.
    * Abstract model for input
    * @author k0r0tk0ff
    * @author peterarsentev
    * @since 14.10.2016
    * @version 1.0
    */

public interface Input {

        /**.
         * Interface for input from console
         * @author k0r0tk0ff
         * @author peterarsentev
         * @since 14.10.2016
         * @version 1.0
         * @return string variable from console
         * @param msg - Text on console, for understand
         *            what we are input.
         */
    String inputRead(String msg);
}
