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
        int h = random.nextInt(1, 8);
        int days = random.nextInt(5, 20);;
        double many = random.nextDouble(500, 2000);
        return h * many * days;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (с учетом почасовой оплаты): %.2f (руб.)",
                surname, name, calculateSalary());
    }
}
