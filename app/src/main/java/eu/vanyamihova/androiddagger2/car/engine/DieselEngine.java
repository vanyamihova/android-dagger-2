package eu.vanyamihova.androiddagger2.car.engine;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
public class DieselEngine implements Engine {

    private static final String TAG = "Car";

    @Inject
    public DieselEngine() {
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started");
    }
}
