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
        int h = random.nextInt(1, 5);//Работают часов в день
        int days = 20;//Количество рабочих дней
        double many = random.nextDouble(500, 1000);//Ставка за 1 час
        return h * many * days;//Зарплата за 20 дней при почасовой оплате
    }

//    @Override
//    public String toString() {
//        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (с учетом почасовой оплаты): %.2f (руб.)",
//                surname, name, calculateSalary());
//    }

    @Override
    public String toString() {
       return String.format("%s %s; Возраст %d лет; %s; Заработная плата (Почасовая в месяц): %.2f (руб.)",
                surname, name, age, profession, calculateSalary());
    }
}
