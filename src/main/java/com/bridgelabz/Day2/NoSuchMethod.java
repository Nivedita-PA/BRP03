package com.bridgelabz.Day2;

public class NoSuchMethod {

    public static void main(String[] args) {
        System.out.println("Calling response: " + getResponse());
    }

    private static String getResponse() {
        return SayingHello.getHello();
    }
}
