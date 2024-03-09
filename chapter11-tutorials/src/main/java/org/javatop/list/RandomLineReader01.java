package org.javatop.list;

import java.io.*;
import java.nio.file.*;
import java.util.Random;

public class RandomLineReader01 {
    public static void main(String[] args) {
        Path filePath = Paths.get("D:\\test\\code\\1.txt");
        try {
            System.out.println(getRandomLine(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getRandomLine(Path filePath) throws IOException {
        String selectedLine = null;
        Random random = new Random();
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            for (int i = 1; (line = reader.readLine()) != null; i++) {
                if (random.nextInt(i) == 0) { // 水库采样算法
                    selectedLine = line;
                }
            }
        }
        
        return selectedLine;
    }
}