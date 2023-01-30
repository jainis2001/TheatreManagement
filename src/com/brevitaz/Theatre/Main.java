package com.brevitaz.Theatre;

public class Main {
    static TheatreManagement theatre;
    public static void main(String[] args) {
        theatre = new TheatreManagement();
        char[][] room = theatre.createRoom();
        new Menu().menu(room);
    }

}
