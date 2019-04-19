package eu.vanyamihova.androiddagger2;

import android.os.Bundle;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import eu.vanyamihova.androiddagger2.car.Car;
import eu.vanyamihova.androiddagger2.car.engine.DieselEngineModule;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();

        component.inject(this);

        car1.drive();
        car2.drive();
    }

}
