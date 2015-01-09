package com.sample.codemash;

/**
 * Created by jake on 1/7/15.
 */
public class Customer {
    public String firstName;
    public String lastName;


    public Customer(String firstName, String lastName ){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return firstName + " " + lastName;
    }

}
