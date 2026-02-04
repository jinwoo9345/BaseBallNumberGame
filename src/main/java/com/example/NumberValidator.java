package com.example;

import java.util.HashSet;
import java.util.Set;

public class NumberValidator {
    public boolean validate(String number) {
        Set<Character> numSet = new HashSet<Character>();
        if (number.length() != 4) {
            return false;
        }

       for(Character ch : number.toCharArray()){
           if(!numSet.add(ch)){
               return false;
           }
       }

       return true;
    }
}
