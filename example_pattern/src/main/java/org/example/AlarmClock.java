package org.example;

import java.util.ArrayList;
import java.util.List;

public final class AlarmClock {
    private List<Delegate> subscribers;

    public AlarmClock() {
        subscribers = new ArrayList<>();
    }

    public void notifyEverySubscriber() {
        for (Delegate delegate : subscribers) {
            delegate.execute();
        }
    }

    public void subscribe(Delegate subscriber) {
        subscribers.add(subscriber);
    }
}
