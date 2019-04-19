package eu.vanyamihova.androiddagger2.application;

import android.app.Application;

import eu.vanyamihova.androiddagger2.AppComponent;
import eu.vanyamihova.androiddagger2.DaggerAppComponent;

/**
 * @author Vanya Mihova <vanya.mihova89@gmail.com>
 * @since 19.04.2019
 */
public class AndroidDagger2Application extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
