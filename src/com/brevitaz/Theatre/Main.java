package com.brevitaz.Theatre;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();
        theatre.createRoom();
        new Menu().menu(theatre);
    }

}
