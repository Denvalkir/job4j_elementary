package ru.job4j.condition;

public class DummyBot {
    public static String answersBot(String text) {
        if (text.equals("Привет, Бот.")) {
            return "Привет, умник.";
        } else if (text.equals("Пока.")) {
            return "До скорой встречи.";
        } else {
            return "Это ставит меня в тупик. Задайте другой вопрос.";
        }
    }

    public static void main(String[] args) {
        System.out.println(DummyBot.answersBot("Привет, Бот."));
        System.out.println(DummyBot.answersBot("Пока."));
        System.out.println(DummyBot.answersBot("Привет, Ботик"));
    }
}
