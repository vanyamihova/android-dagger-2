package eu.vanyamihova.androiddagger2;

import android.os.Bundle;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import eu.vanyamihova.androiddagger2.car.Car;
import eu.vanyamihova.androiddagger2.car.engine.DieselEngineModule;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();

        component.inject(this);

        car.drive();
    }

}
