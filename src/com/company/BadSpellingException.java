package com.company;

public class BadSpellingException extends Exception {

    public BadSpellingException(String message){
        super(message);
    }

    public static void main(String[] args) {
        String word1 = "hapy";
        String word2 = "happy";

        try{
            if(!word1.equalsIgnoreCase(word2)){
                throw new BadSpellingException(word1);
            }
            System.out.println(word1);
        }catch (BadSpellingException e){
            System.out.println(e);
        }
    }
}
