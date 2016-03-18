package com.coding.gorkanatests;

import java.util.List;

public class Strings {

    public static String concatenate(List<String> strings) {
        String result = "";

        for(String s : strings) {
            result += s;
            result += " ";
        }

        return result;
    }

}
