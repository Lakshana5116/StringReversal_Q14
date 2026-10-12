package com.lab;

public class StringReversal {

    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {
        StringReversal obj = new StringReversal();
        System.out.println("Reversed string = " + obj.reverse("hello"));
    }
}