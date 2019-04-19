package eu.vanyamihova.androiddagger2;

import dagger.Component;

/**
 * The Car Injector
 *
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
@Component
public interface CarComponent {

    Car provideCar();

    void inject(MainActivity mainActivity);

}
