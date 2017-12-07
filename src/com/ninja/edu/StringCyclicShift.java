package com.ninja.edu;

public class StringCyclicShift {

    private static String string = "ELEPHANT";
    private static char[] array;
    private static int value = 3;
    private static StringCyclicShift obj = new StringCyclicShift();
    private static char ch;

    public static void main(String[] args) {
        array = string.toCharArray();
        obj.shift(array[0], value);
        for (char i : array) {
            System.out.println(i);
        }
    }

    public void shift(char c, int to) {

        ch = array[to];
        array[to] = c;

        if (to == 0) {
            return;
        }

        to += value;
        if (to >= array.length) {
            to -= array.length;
        }

        obj.shift(ch, to);
    }
}



