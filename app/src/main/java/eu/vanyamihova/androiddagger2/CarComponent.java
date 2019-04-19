package eu.vanyamihova.androiddagger2;

import dagger.Component;
import eu.vanyamihova.androiddagger2.car.Car;
import eu.vanyamihova.androiddagger2.car.engine.DieselEngineModule;

/**
 * The Car Injector
 *
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car provideCar();

    void inject(MainActivity mainActivity);

}
