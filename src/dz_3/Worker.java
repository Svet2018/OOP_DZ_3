package dz_3;

import java.util.List;

import static dz_3.Main.random;

public class Worker extends Employee {

    public Worker(String profession, String surname, String name, double salary, int age) {
        super(profession, surname, name, salary, age);
    }


    @Override
    public double calculateSalary() {
        double salary = random.nextInt(20000, 80001);
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Возраст %d лет; %s; Среднемесячная заработная плата (Фиксированная месячная оплата): %.2f (руб.)",
                surname, name, age, profession, calculateSalary());
    }

  //  @Override
//    public String toString() {
//        return String.format("%s %s; Возраст %d; %s; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
//                surname, name, age, profession, calculateSalary());
//    }
}
