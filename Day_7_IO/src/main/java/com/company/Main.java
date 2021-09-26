package com.company;

import java.io.*;

public class Main implements Serializable {

    public static void main(String[] args) {
        Borodino BorodinoCopy = new Borodino(); // Копирование бородино

        ListNames ListNamesCopy = new ListNames();

        Playing game = new Playing();
        game.saveGame();
        LoadGame loadGame = new LoadGame();
    }
}
