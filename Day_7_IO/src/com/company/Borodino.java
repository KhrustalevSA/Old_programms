package com.company;

import java.io.*;
import java.util.Scanner;

public class Borodino {
    Borodino(){
        try(BufferedReader reader = new BufferedReader(new FileReader("src/resourses/Borodino.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/resourses/CopyBrorodino.txt"))){
            String str = "";
            while ((str = reader.readLine()) != null){
                str = str.trim();
                while(str.contains("  ")){
                    str = str.replaceAll("  ", " ");    // цикл уменьшает длинну пробела до одного
                }
                writer.write(str + "\n");
            }
        } catch (IOException e){
            System.out.printf("FIle nit found exception");
        }
    }
}
