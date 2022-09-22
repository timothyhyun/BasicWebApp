package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("plus")) {
            String[] words = query.split(" ");
            return String.valueOf(Integer.parseInt(words[words.length-1]) + Integer.parseInt(words[words.length-3]));
        }
        return "as;lfkjas;lk";

    }
}
