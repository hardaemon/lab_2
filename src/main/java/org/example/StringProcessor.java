package org.example;

public class StringProcessor {
    public String CopyString(String s, int N) throws IllegalArgumentException {
        String out = "";
        if (N < 0) {
            throw new IllegalArgumentException("Exception");
        }
        else if (N == 0);
        else {
            for (int i = 0; i < N; i++) {
                out = out.concat(s);
            }
        }
        return out;
    }

    public int NumberOfOccurrences(String s1, String s2) throws IllegalArgumentException {
        if (s2.equals("") || s2 == null) {
            throw new IllegalArgumentException("Exception");
        }
        return s1.split(s2,-1).length-1;
    }

    public String Replacement(String s3) {
        s3 = s3.replace("1","один");
        s3 = s3.replace("2","два");
        s3 = s3.replace("3","три");
        return s3;
    }
    public String Removal(StringBuilder s4) {
        for (int i = 1; i < s4.length(); i++) {
            s4 = s4.deleteCharAt(i);
        }
        return s4.toString();
    }
}