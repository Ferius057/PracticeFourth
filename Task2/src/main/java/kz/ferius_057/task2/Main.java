package kz.ferius_057.task2;

import com.google.common.io.Files;
import lombok.val;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;

/**
 * @author Ferius_057 (Charles_Grozny)
 * @date ⭐ 04.10.2023 | 22:29 ⭐
 */
public class Main {
    public static void main(String[] args) throws IOException {
        val fileName = "article.txt";
        val linesToRead = 234;

        readLast(linesToRead, Paths.get(fileName).toFile());
    }

    public static void readLast(int lines, File file) throws IOException {
        if (lines <= 0) {
            System.out.println("Кол-во строк должно быть положительным цельным числом");
            return;
        }

        val listLines = Files.readLines(file, Charset.defaultCharset());
        val totalLines = listLines.size();

        if (totalLines <= lines) {
            System.out.println("В файле меньше строк чем нужно прочесть");
        } else {
            System.out.printf("Последние строки из файла в кол-ве %s строк: %n", lines);
            for (int i = totalLines - lines; i < totalLines; i++) {
                System.out.println(listLines.get(i));
            }
        }
    }
}