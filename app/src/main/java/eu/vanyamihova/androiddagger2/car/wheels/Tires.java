package eu.vanyamihova.androiddagger2.car.wheels;

import android.util.Log;

/**
 * IMPORTANT!
 * We don't own this class so we can't annotate it with @Inject
 *
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
public class Tires {

    public static final String TAG = "Car";

    public void inflate() {
        Log.d(TAG, "inflate: Tires inflated");
    }
}
