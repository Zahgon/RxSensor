package com.getwandup.rxsensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.getwandup.rxsensor.domain.RxSensorEvent;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;

/**
 * RxSensor
 *
 * @author manolovn
 */
public class RxSensor {

    private final SensorManager sensorManager;

    public RxSensor(Context context) {
        sensorManager = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);
    }

    public Observable<RxSensorEvent> observe(final int sensorType, final int samplingPeriodUs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
