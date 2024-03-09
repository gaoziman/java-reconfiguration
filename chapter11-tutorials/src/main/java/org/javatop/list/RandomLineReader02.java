package org.javatop.list;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class RandomLineReader02 {

    public static void main(String[] args) {
        String filePath = "D:\\test\\code\\1.txt"; // 替换为你的文件路径

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            if (!lines.isEmpty()) {
                String randomLine = getRandomLine(lines);
                System.out.println("随机行: " + randomLine);
            } else {
                System.out.println("文件为空或不存在");
            }
        } catch (IOException e) {
            System.out.println("读取文件时出错: " + e.getMessage());
        }
    }

    private static String getRandomLine(List<String> lines) {
        Random random = new Random();
        return lines.get(random.nextInt(lines.size()));
    }
}
