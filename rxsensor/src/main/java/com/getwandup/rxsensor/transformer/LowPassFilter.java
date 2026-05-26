package com.getwandup.rxsensor.transformer;

import com.getwandup.rxsensor.domain.RxSensorEvent;
import rx.Observable;
import rx.Observable.Transformer;
import rx.functions.Func1;

/**
 * Low pass filter implemented using Transformer api
 *
 * @author manolovn
 * @author TomeOkin
 * @see <a href="https://www.built.io/blog/2013/05/applying-low-pass-filter-to-android-sensors-readings/">Applying
 * Low Pass Filter to Android Sensor’s Readings</a>
 */
public class LowPassFilter implements Transformer<RxSensorEvent, RxSensorEvent> {

    private final float factor;

    private float[] sensorValue;

    public LowPassFilter(float factor) {
        this.factor = factor;
    }

    @Override
    public Observable<RxSensorEvent> call(Observable<RxSensorEvent> source) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected float[] lowPass(float[] current, float[] last) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
