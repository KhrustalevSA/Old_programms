package com.company;

import java.io.*;

public class Playing implements Serializable {
    PaladinUtherTheLightbringer utherTheLightbringer = new PaladinUtherTheLightbringer();
    Playing() {


        utherTheLightbringer.lvlUp();
        utherTheLightbringer.lvlUp();
        utherTheLightbringer.getItem();
        utherTheLightbringer.getItem();
        utherTheLightbringer.getItem();
        utherTheLightbringer.getItem();
        utherTheLightbringer.getItem();
    }
    public void saveGame(){
        try (FileOutputStream writer = new FileOutputStream("src/resourses/UtherTheLightBringer.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(writer)) {
            objectOutputStream.writeObject(utherTheLightbringer);
        } catch (IOException exception) {
            System.out.println("Error");
        }
    }




}
