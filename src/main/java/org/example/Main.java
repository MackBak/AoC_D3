package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "src\\main\\resources\\input.txt";
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(content);

        StringFilter stringFilter = new StringFilter(content);
        List<String> results = stringFilter.mulFilter();

        System.out.println("### RESULTS ###:\n" + results);


    }
}
