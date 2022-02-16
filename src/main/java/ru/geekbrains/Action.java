package ru.geekbrains;

public interface Action {
    void run();

    void jump();

    int getRunDistance();

    int getJumpHeight();
}
