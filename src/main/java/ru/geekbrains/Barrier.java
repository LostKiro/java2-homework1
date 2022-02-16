package ru.geekbrains;

public abstract class Barrier {
    private String name;

    public Barrier(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Action actions);

    public String getName() {
        return name;
    }
}
