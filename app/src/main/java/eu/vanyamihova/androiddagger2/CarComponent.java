package eu.vanyamihova.androiddagger2;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import eu.vanyamihova.androiddagger2.car.Car;
import eu.vanyamihova.androiddagger2.car.engine.PetrolEngineModule;

/**
 * The Car Injector
 *
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car provideCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();
    }

}
