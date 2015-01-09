package com.sample.codemash;


public class StringCalc {
    public static int add( String input ){

        String delims = "[,\\n]+";

        String[] stringArray = input.split(delims);

        int sum = 0;

        for(int i=0; i < stringArray.length; i++) {
            if(stringArray[i].equals(""))
                break;
            sum += Integer.valueOf(stringArray[i]);
        }

        return Integer.valueOf( sum );
    }
}
