package ru.novikov_dm;

public class Controller {
    private TV tv;

    public Controller(TV tv) {
        this.tv = tv;
    }

    public Program on(int n) {
        return tv.getChannel(n).getProgram();
    }
}
