package org.example;

public final class Human {
    private String name;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Human(String name) {
        setName(name);
    }

    public void subscribeAlarmClock(AlarmClock clock) {
        clock.subscribe(() -> System.out.println("Notified human " + getName()));
    }
}
