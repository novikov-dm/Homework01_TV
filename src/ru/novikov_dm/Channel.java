package ru.novikov_dm;

import java.util.ArrayList;
import java.util.Random;

public class Channel {
    private String title;
    private ArrayList<Program> programs;

    public Channel(String title) {
        this.title = title;
        this.programs = new ArrayList<>();
    }

    public void addProgram(Program program) {
        programs.add(program);
    }

    public Program getProgram() {
        return programs.get(new Random().nextInt(programs.size()));
    }
}
