package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1.5, 1.5);
            System.out.println("Done");
        } catch (Exception e) {
            System.out.println("Wrong data. Try different parameters. Error: "+ e);
        }finally{
            System.out.println("System has finished all calculation");
        }
    }

}
