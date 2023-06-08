package dz_3;

// 20 * 8

//double many;

import java.util.Random;

import static dz_3.Main.random;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания
 */
public class Frelancer extends Employee {


    public Frelancer(String profession, String surname, String name, double salary, int age) {
        super(profession, surname, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        Random random = new Random();
        int h = random.nextInt(1, 9);
        int days = random.nextInt(5, 21);;
        double many = random.nextDouble(500, 2001);
        return h * many * days;
    }

//    @Override
//    public String toString() {
//        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (с учетом почасовой оплаты): %.2f (руб.)",
//                surname, name, calculateSalary());
//    }

    @Override
    public String toString() {
       return String.format("%s %s; Возраст %d лет; %s; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, age, profession, calculateSalary());
    }
}
