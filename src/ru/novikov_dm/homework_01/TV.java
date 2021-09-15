package ru.novikov_dm.homework_01;

import java.util.ArrayList;

public class TV {
    private String model;
    private ArrayList<Channel> channels;

    public TV(String model) {
        this.model = model;
        this.channels = new ArrayList<>();
    }

    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    public Channel getChannel(int n) {
        return channels.get(n - 1);
    }
}
