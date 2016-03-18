package com.coding.gorkanatests;

public class FizzBuzz {

    /**
     * Write a program that prints the numbers from 1 to X.
     *
     * For multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz".
     *
     * For numbers which are multiples of both three and five print "FizzBuzz".
     *
     * e.g. "12Fizz4Buzz.."
     */
    public String toString(int to){
        StringBuilder string = new StringBuilder();

        for(int i = 1; i <= to; i++ ) {
            boolean fizzOrBuzz = false;
            if( i % 3 == 0){
                string.append("Fizz");
                fizzOrBuzz = true;
            }

            if( i % 5 == 0){
                string.append("Buzz");
                fizzOrBuzz = true;
            }

            if(!fizzOrBuzz){
                string.append(i);
            }

            string.append("\n");
        }

        return string.toString();
    }

//    public static void main(String[] args){
//          GOT A TEST TO RUN THIS
//        System.out.println(new FizzBuzz().toString(20));
//
//    }
}
