package com.Leo.io.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Leo
 * @version 1.0
 * @date 2023-10-14 20:58
 * @description : 使用Java写一个方法遍历文件夹中的图片，如果图片名称是以 "【 " 开头，"】" 结尾,
                  则删除以 "【" 开头，"】" 结尾的内容
 */
public class ImageFileRenamer {

    public static void main(String[] args) {
        // 替换为你的文件夹路径
        Path pathToDirectory = Paths.get("G:\\toNewLeoJavaer\\★ 路飞学城 新版 Python全栈开发\\第01模块：Python基础（V2.0版）\\模块1\\day08 阶段总结和考试\\笔记\\assets");
        try {
            Files.walkFileTree(pathToDirectory, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (isImageFile(file)) {
                        renameFileIfNecessary(file);
                    }
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) {
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isImageFile(Path file) {
        // 这里只列出了几种常见的图片文件扩展名，你可以根据需要添加更多
        String[] imageExtensions = {".jpg", ".jpeg", ".png", ".bmp", ".gif"};
        String fileName = file.getFileName().toString().toLowerCase();
        for (String ext : imageExtensions) {
            if (fileName.endsWith(ext)) {
                return true;
            }
        }
        return false;
    }

    private static void renameFileIfNecessary(Path file) {
        String originalName = file.getFileName().toString();
        Pattern pattern = Pattern.compile("【.*?】");
        Matcher matcher = pattern.matcher(originalName);
        if (matcher.find()) {
            String newName = matcher.replaceAll("");
            try {
                Files.move(file, file.resolveSibling(newName));
                System.out.println("Renamed: " + originalName + " -> " + newName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
