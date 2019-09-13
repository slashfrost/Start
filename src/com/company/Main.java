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
        List<String> lines = readLineByLine();
        String[] numbers_str;
        String str = lines.toString();
        String str1 = str.replaceAll("\\D+", "");
        System.out.println(str);
        numbers_str = str1.split("");
        Operation op = (count, sum) -> {
            for (int i = 0; i < numbers_str.length; i++) {
                count = Integer.parseInt(numbers_str[i]);
                sum = sum + count;
            }
            return sum;

        };
        System.out.println(op.calculate(0, 0));
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

    interface Operation {
        public int calculate(int sum, int count);
    }
}

