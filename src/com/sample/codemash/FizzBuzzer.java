package com.sample.codemash;


public class FizzBuzzer {
    //private static final String DIVISIBLE_BY_THREE_RESPONSE = "Fizz";
    //private static final String DIVISIBLE_BY_FIVE_RESPONSE = "Buzz";
    //private static final String DIVISIBLE_BY_THREE_AND_FIVE_RESPONSE = "FizzBuzz";
//
    //private Map(<int>, <String>) divisorToResponse = ;
    //
    //public FizzBuzzer( Map(<int>,<String>) ){

    //}

    public static String fizzBuzz( Integer num ){

        String response = "";

        if( num % 3 == 0 ) response = response.concat("Fizz");
        if( num % 5 == 0 ) response = response.concat("Buzz");

        if( response.equals(""))
            response = response.concat( num.toString() );

        return response;
    }
}
