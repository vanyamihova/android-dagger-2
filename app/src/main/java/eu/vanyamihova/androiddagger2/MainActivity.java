package eu.vanyamihova.androiddagger2;

import android.os.Bundle;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;
import eu.vanyamihova.androiddagger2.application.AndroidDagger2Application;
import eu.vanyamihova.androiddagger2.car.Car;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = DaggerActivityComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .appComponent(((AndroidDagger2Application) getApplication()).getAppComponent())
                .build();

        component.inject(this);

        car1.drive();
        car2.drive();
    }

}
