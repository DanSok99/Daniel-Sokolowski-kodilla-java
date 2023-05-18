package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String beautiful = poemBeautifier.beautify("Hello", (text -> text.toUpperCase()));
        System.out.println(beautiful);
        String beautiful2 = poemBeautifier.beautify("Hello", (text -> "ABC"+ text +"ABC"));
        System.out.println(beautiful2);
        String beautiful3 = poemBeautifier.beautify("Hello", (text -> text.replace("e","O")));
        System.out.println(beautiful3);
        String beautiful4 = poemBeautifier.beautify("Hello", (text -> text.length()+"*"+text+"*"+text.length()));
        System.out.println(beautiful4);

    }
}