package ru.job4j.condition;

public class DummyBot {
    public static String answersBot(String text) {
        String answer;
        
        if (text.equals("Привет, Бот.")) {
            answer = "Привет, умник.";
        } else if (text.equals("Пока.")) {
            answer = "До скорой встречи.";
        } else {
            answer = "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(DummyBot.answersBot("Привет, Бот."));
        System.out.println(DummyBot.answersBot("Пока."));
        System.out.println(DummyBot.answersBot("Привет, Ботик"));
    }
}
