package com.serverless;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResponderModel {

    private final String teamName = "devco";

    public String answer(String question) {
        if ("".equals(question)){
            return teamName;
        }

        Matcher sumMatcher = Pattern.compile(".*what is (\\d+) plus (\\d+)").matcher(question);
        Matcher largeMatcher2 = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+)").matcher(question);
        Matcher largeMatcher4 = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+), (\\d+), (\\d+)").matcher(question);

        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }
        if (largeMatcher2.matches()) {
            return String.valueOf(Math.max(Integer.parseInt(largeMatcher2.group(1)), Integer.parseInt(largeMatcher2.group(2))));
        }
        if (largeMatcher4.matches()) {

            List<Integer> numeros = Arrays.asList(Integer.parseInt(largeMatcher4.group(1)),
                    Integer.parseInt(largeMatcher4.group(2)),
                    Integer.parseInt(largeMatcher4.group(3)),
                    Integer.parseInt(largeMatcher4.group(4)));

            Integer mayor = numeros.get(0);
            for (int x = 1; x < numeros.size(); x++) {
                int numeroActual = numeros.get(x);
                if (numeroActual > mayor) {
                    mayor = numeroActual;
                }
            }

            return String.valueOf(mayor);
        }

        return teamName;
    }

}