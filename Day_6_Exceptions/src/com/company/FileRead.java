package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

public class FileRead {
    private String str = "";
    private char value = ' ';
    public FileRead(){

        try(FileInputStream fis = new FileInputStream("src/resourses/Blocked card.txt")) {

            int i;
                while ((i = fis.read()) != -1) {                          // Считывание битов из файла
                    if (i != 13) {                                        //
                        value = (char) i;                                 // перевод в чар
                        str = str + Character.toString(value);            // и добавление нового символа в строку
                        //System.out.print((char) i);
                    }
                }


        } catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
    public String getString(){
      return this.str;
    }

}
