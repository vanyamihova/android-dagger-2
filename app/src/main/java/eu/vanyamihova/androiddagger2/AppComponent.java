package eu.vanyamihova.androiddagger2;

import javax.inject.Singleton;

import dagger.Component;
import eu.vanyamihova.androiddagger2.car.Driver;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    Driver getDriver();

}
