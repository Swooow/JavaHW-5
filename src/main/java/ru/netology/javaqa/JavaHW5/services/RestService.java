package ru.netology.javaqa.JavaHW5.services;

//  Необходимые переменные:
//  int balance - текущий счет
//  int income - доход
//  int expense - вынужденные траты
//  int threshold - баланс, ниже которого обязательно нужно работать
//  int relax - количество дней отдыха
public class RestService {
    public int calcRest(int income, int expenses, int threshold) {

        int balance = 0;
        int relax = 0;

        for (int i = 0; i < 12; i++) {
            if (balance < threshold) {
                balance = balance + income - expenses;
            } else {
                balance = (balance - expenses)/3;
                relax++;
            };
        }
        return relax;
    }
}
