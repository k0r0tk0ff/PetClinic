package k0r0tk0ff.PetClinic.IO;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;
import org.hamcrest.*;

/**
 *
 * Copyright (c)
 * Free to any use.
 *
 * @author_for_template		peterarsentev
 * @author_tester           k0r0tk0ff
 * @date		15/10/2016
 * @version		1.1
 *
 * Test methods from IO package
 *
 */

public class ValidatorTest {
    @Test
    public void getDouble() throws Exception {

    }

    @Test
    public void getInt() throws Exception {

    }

    @Test
    public void compare() throws Exception {
        /**
         * Checking compare operation
         * (for tests)
         * public Calculator(double first, double second)
         */
        private final IO io;
        Validator validator = new Validator(IO io);

        assertThat(true, equalTo(validator.compare("y")));
    }
}