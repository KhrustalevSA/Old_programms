package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ListNames {
    ListNames() {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/resourses/ListNames.txt")));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/resourses/CopyListNames.txt"))) {

            scanner.useDelimiter(",");                  // При чтении файла убираются запятые
            String str = "";
            while(scanner.hasNext()){
                str = str + scanner.next();             // Запись слов в строку
            }
            String[] nameArr = str.split(" ");    // Добавление слов в массив. Каждое слово - элемент массива
            Arrays.sort(nameArr);                       // благодаря методу split
            str = "";
            for(String i:nameArr){                      // Добавление слов в строку разделяя их переносом указателя
                str = str + i + "\n";                   // на следующую строку
            }
            writer.write(str);

        } catch (IOException e) {

        }
    }
}
