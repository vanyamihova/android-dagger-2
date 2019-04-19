package eu.vanyamihova.androiddagger2.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
public class Remote {

    public static final String TAG = "Remote";

    @Inject
    public Remote() {
    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }

}
