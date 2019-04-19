package eu.vanyamihova.androiddagger2.car.engine;

import android.util.Log;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
public class DieselEngine implements Engine {

    private static final String TAG = "Car";

    // Data is coming in RunTime
    private int horsePower;

    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started. Horse power: " + horsePower);
    }
}
