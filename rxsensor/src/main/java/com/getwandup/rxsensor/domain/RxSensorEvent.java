package com.getwandup.rxsensor.domain;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.Arrays;

/**
 * Container for SensorEvent
 *
 * @author manolovn
 * @author TomeOkin
 */
public class RxSensorEvent {

    public float[] values;

    public Sensor sensor;

    public int accuracy;

    public long timestamp;

    public RxSensorEvent(float[] values, Sensor sensor, int accuracy, long timestamp) {
        this.values = values;
        this.sensor = sensor;
        this.accuracy = accuracy;
        this.timestamp = timestamp;
    }

    public static RxSensorEvent from(SensorEvent sensorEvent) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
