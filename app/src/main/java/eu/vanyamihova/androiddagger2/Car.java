package eu.vanyamihova.androiddagger2;

import android.util.Log;

import javax.inject.Inject;

/**
 * Order of injection is:
 * - constructor
 * - fields
 * - methods
 *
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "driving...");
    }
}
