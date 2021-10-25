package com.company.presupuesto.repo;

import java.io.*;
import java.util.stream.Collectors;

public class FileRepository implements InterfaceReposotory {

    private  static final String FILE_PATH= "db.txt";

    @Override
    public boolean save(String text) {
        try {
            FileWriter fileWriter = new FileWriter(this.FILE_PATH, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(text + "\n");
            writer.close();
            return true;
        }catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void read() {
        try {
            FileReader fileReader = new FileReader(this.FILE_PATH);
            BufferedReader reader = new BufferedReader(fileReader);
            for (String linea : reader.lines().collect(Collectors.toList())){
                System.out.println(linea);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
