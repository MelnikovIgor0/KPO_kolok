package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("John");
        names.add("Sue");
        names.add("Tom");
        names.add("Kate");
        AlarmClock clock = new AlarmClock();
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < (int)(Math.random() * 3); ++j) {
                Human human = new Human(names.get((int)(Math.random() * 5.499)));
                human.subscribeAlarmClock(clock);
            }
            try {
                Thread.sleep(1000);
                System.out.println("DAY " + i);
                clock.notifyEverySubscriber();
            } catch (InterruptedException exception) {
                System.out.println("InterruptedException found!!!\n" + exception);
            }
        }
    }
}