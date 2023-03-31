package ru.job4j.condition;

public class DummyBot {
/*
Если пришла фраза "Hi, Bot.", бот отвечает: "Hi, SmartAss."
Если пришла фраза "Bye.", бот отвечает: "See you later."
Если пришла любая другая фраза,  бот отвечает: "I don't know, Please, ask another question."
* */
    public static String answer(String question) {
        String rsl = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            rsl = "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) {
            rsl = "See you later.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hi, Bot.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye.");
        System.out.println(rsl);
    }
}