package dz_3;

import java.util.List;

public class Worker extends Employee {

    public Worker(String profession, String surname, String name, double salary, int age) {
        super(profession, surname, name, salary, age);
    }


    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
                surname, name, calculateSalary());
    }

  //  @Override
//    public String toString() {
//        return String.format("%s %s; Возраст %d; %s; Среднемесячная заработная плата (фиксированная месячная оплата): %.2f (руб.)",
//                surname, name, age, profession, calculateSalary());
//    }
}
