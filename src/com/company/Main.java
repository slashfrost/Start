package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String>lines=readLineByLine();
        String[] numbers_str;
        Integer count = 0;
        Integer sum = 0;
        String str=lines.toString();
        String str1 = str.replaceAll("\\D+", "");
        System.out.println(str);
        System.out.println(str1);
        numbers_str = str1.split("");
        for (int i = 0; i < numbers_str.length; i++) {
            count = Integer.parseInt(numbers_str[i]);
            sum = sum + count;
        }
        System.out.println("Ответ: "+sum);
    }
    private static List<String> readLineByLine() throws IOException {
        List<String> lines = new ArrayList<>();
        Path path = Paths.get("//home//sasha//IdeaProjects//Start//src//com//company//Input");
        try (Stream<String> lineStream = Files.lines(path)) {

            lines = lineStream.collect(Collectors.toList());

        } catch (IOException e) {
          e.printStackTrace();
        }
        return lines;
    }
}

