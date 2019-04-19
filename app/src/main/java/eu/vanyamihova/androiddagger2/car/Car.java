package eu.vanyamihova.androiddagger2.car;

import android.util.Log;

import javax.inject.Inject;

import eu.vanyamihova.androiddagger2.car.engine.Engine;
import eu.vanyamihova.androiddagger2.car.wheels.Wheels;

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
        engine.start();
        Log.d(TAG, "driving...");
    }
}
