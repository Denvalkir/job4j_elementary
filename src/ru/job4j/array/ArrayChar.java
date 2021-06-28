package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;

        for (int i = 0; i < pref.length; i++) {
            result = word[i] == pref[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ArrayChar.startsWith(new char[]{'J', 'a', 'v', 'a'}, new char[] {'J', 'J'}));
    }
}