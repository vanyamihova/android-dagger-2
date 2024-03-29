package eu.vanyamihova.androiddagger2.car.engine;

import dagger.Binds;
import dagger.Module;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);

}
