package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            // append true - файл НЕ будет перезаписываться
            FileWriter writer = new FileWriter("D:\\12345.csv", true);
            String str;
            System.out.println("Введите текст или 'stop' для заверения");
            do {
                str = buffRead.readLine();
                writer.write(str);
                writer.append(";");
                writer.flush();
            }
            while (!str.equals("stop"));
        }
        catch(IOException e){
            System.out.println(e.getMessage());

        }


    }
}
