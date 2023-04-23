package org.example.lab7.compulsory;

public class Token {
    private final int number;

    public Token(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Token{" +
                "number=" + number +
                '}';
    }
}