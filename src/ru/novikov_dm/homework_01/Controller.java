package ru.novikov_dm.homework_01;

public class Controller {
    private TV tv;

    public Controller(TV tv) {
        this.tv = tv;
    }

    public Program on(int n) {
        return tv.getChannel(n).getProgram();
    }
}
