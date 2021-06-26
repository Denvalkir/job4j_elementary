package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int cash = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i <= 4) {
                if (hours[i] <= 8) {
                    cash = cash + hours[i] * 10;
                } else {
                    cash = cash + 8 * 10 + ((hours[i] - 8) * 15);
                }
            } else {
                if (hours[i] <= 8) {
                    cash = cash + hours[i] * 20;
                } else {
                    cash = cash + 8 * 20 + ((hours[i] - 8) * 30);
                }
            }
        }
        return cash;
    }
}