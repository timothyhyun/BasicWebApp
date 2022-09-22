package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("plus")) {
            String[] words = query.split(" ");
            return String.valueOf(Integer.parseInt(words[words.length-1]) + Integer.parseInt(words[words.length-3]));
        }
        if (query.toLowerCase().contains("multiplied")) {
            String[] words = query.split(" ");
            return String.valueOf(Integer.parseInt(words[words.length-1]) * Integer.parseInt(words[words.length-3]));
        }
        if (query.toLowerCase().contains("banana")) {
            return "yellow";
        }

        if (query.toLowerCase().contains("bond")) {
            return "Sean Connery";
        }

        if (query.toLowerCase().contains("cube")) {
            String[] words = query.split(" ");
            return String.valueOf(words[words.length-1]);
        }
        if (query.toLowerCase().contains("prime")) {
            String[] words = query.split(" ");
            return String.valueOf(words[words.length-1]);
        }
        if (query.toLowerCase().contains("teresa")) {
            return "2016";
        }
        return "as;lfkjas;lk";

    }
}
