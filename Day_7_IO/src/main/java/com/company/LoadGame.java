package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadGame {
    LoadGame(){
        try (FileInputStream reader = new FileInputStream("src/resourses/UtherTheLightBringer.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(reader)) {
             PaladinUtherTheLightbringer pal = (PaladinUtherTheLightbringer) objectInputStream.readObject();

            System.out.println(pal);

        } catch (IOException exception) {
            System.out.println("Error");
        } catch (ClassNotFoundException exception){
            System.out.println("Error ClassNotFoundException");
        }
    }
}
