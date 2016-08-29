package com.luxnlex.eng2leet;

import java.util.HashMap;
import java.util.Map;

public class Translator {

    private Map<String, String> letters = new HashMap<String, String>();

    {
        letters.put("A", "4");
        letters.put("B", "8");
        letters.put("C", "(");
        letters.put("D", "d"); //|)
        letters.put("E", "3");
        letters.put("F", "f"); //|=
        letters.put("G", "9");
        letters.put("H", "#");
        letters.put("I", "!");
        letters.put("J", "j"); //_|
        letters.put("K", "k"); //|<
        letters.put("L", "1");
        letters.put("M", "m"); //(\/)
        letters.put("N", "n"); // (\)
        letters.put("O", "0");
        letters.put("P", "|>");
        letters.put("Q", "0,"); //(,)
        letters.put("R", "r"); //|?
        letters.put("S", "5");
        letters.put("T", "7");
        letters.put("U", "u"); //(_)
        letters.put("V", "\\/");
        letters.put("W", "w"); //(/\)
        letters.put("X", "><");
        letters.put("Y", "y"); //%
        letters.put("Z", "2");
    }


    public String toLeet(String text) {
        StringBuilder sb = new StringBuilder(text.length());
        for (int i = 0; i<text.length(); i++) {
            String l = text.substring(i, i+1);
            if (letters.containsKey(l)) {
                sb.append(letters.get(l));
            }
            else {
                sb.append(l);
            }
        }
        return sb.toString();
    }

}
