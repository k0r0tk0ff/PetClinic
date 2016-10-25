package k0r0tk0ff.PetClinic.Actions;

import k0r0tk0ff.PetClinic.Data.Data;
import k0r0tk0ff.PetClinic.IO.Validator;

/**
 * Interface describe an action with client and his pets
 * @author k0r0tk0ff
 * @author peterarsentev
 * @since 14.10.2016
 * @version 1.0
 */

public interface PetClinicAction {
    public void intro();
    public void exe(Data data);
    public int key();
}
