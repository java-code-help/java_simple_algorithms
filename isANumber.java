package com.company;

public class IsANumber {
    static boolean isNumeric(String arg){
        boolean isChar = true;
        for (Character c:arg.toCharArray()){
            if (!Character.isDigit(c))
                isChar = false;
        }
        return isChar;
    }
}
