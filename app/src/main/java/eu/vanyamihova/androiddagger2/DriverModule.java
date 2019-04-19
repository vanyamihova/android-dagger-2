package eu.vanyamihova.androiddagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import eu.vanyamihova.androiddagger2.car.Driver;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
@Module
public abstract class DriverModule {

    @Provides
    @Singleton
    static Driver provideDriver() {
        return new Driver();
    }

}
