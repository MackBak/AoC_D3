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
}


