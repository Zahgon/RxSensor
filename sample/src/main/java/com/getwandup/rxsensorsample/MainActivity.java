package com.getwandup.rxsensorsample;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.getwandup.rxsensor.RxSensor;
import com.getwandup.rxsensor.domain.RxSensorEvent;
import com.getwandup.rxsensor.transformer.LowPassFilter;
import rx.Subscriber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
