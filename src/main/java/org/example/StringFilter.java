package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFilter {

    private String input;

    public StringFilter(String input) {
        this.input = input;
    }

    public List<String> mulFilter() {
        String regex = "mul\\(\\d+,\\d+\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> mulMatches = new ArrayList<>();
        while (matcher.find()) {
            mulMatches.add(matcher.group());
        }
        return mulMatches;
    }

    public List<Integer> pairMultiplyer(List<String> mulData) {
        List<Integer> mulList = new ArrayList<>();
        for (String mul : mulData) {
            String numbers = mul.substring(4, mul.length() -1); // TODO: Check if this works. Should remove 4: 'mul(' and -1 ')' leaving the 2 numbers
            String[] parts = numbers.split(",");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            mulList.add(x * y);
        }
        return mulList;
    }
}


