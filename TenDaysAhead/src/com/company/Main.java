package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String input = obj.nextLine();
        HashMap<String, Integer> weekDays = new HashMap<String, Integer>();

        weekDays.put("Monday", 1);
        weekDays.put("Tuesday", 2);
        weekDays.put("Wednesday", 3);
        weekDays.put("Thursday", 4);
        weekDays.put("Friday", 5);
        weekDays.put("Saturday", 6);
        weekDays.put("Sunday", 7);

        getWantedDay(input, weekDays);


    }

    public static void getWantedDay(String day, HashMap<String, Integer> workDays){

        System.out.println (getKey(workDays,(workDays.get(day) + 10) % 7));
    }

    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
