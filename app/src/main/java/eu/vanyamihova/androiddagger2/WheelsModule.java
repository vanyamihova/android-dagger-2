package eu.vanyamihova.androiddagger2;

import dagger.Module;
import dagger.Provides;
import eu.vanyamihova.androiddagger2.car.wheels.Rims;
import eu.vanyamihova.androiddagger2.car.wheels.Tires;
import eu.vanyamihova.androiddagger2.car.wheels.Wheels;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }

}
