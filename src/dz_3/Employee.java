package dz_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static dz_3.Main.random;

public abstract class Employee implements Comparable<Employee> {

    protected String profession;
    protected String name;
    protected String surname;
    protected double salary; // Ставка заработной платы

    protected int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;}

    public double getSalary() {
        return salary;
    }

    public Employee() {}

    public Employee(String profession, String surname, String name, double salary, int age) {
        this.profession = profession;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    static Employee genEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        String[] profession = new String[]{"Фрилансер", "Рабочий"};


        int age = random.nextInt(18, 66);
        int salary = random.nextInt(20000, 80001);
        int range = random.nextInt(1,3);
        if (range == 1) {
            Employee e = new Frelancer(profession[0],
                    names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary, age);
            return e;

        } else {
            Employee e = new Worker(profession[1],
                    names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary, age);
            return e;
        }
    }


       // @Override
       // public double calculateSalary () {
       //     return 0;
      //  }
//


        @Override
        public String toString () {
            return "Профессия: " + profession +
                    "; Фамилия - " + surname +
                    "; Имя - " + name +
                    "; Заработная плата - " + salary +
                    "; Возраст - " + age;
        }

        /**
         * Расчет среднемесячной заработной платы
         * @return
         */
       public abstract double calculateSalary ();

        @Override
        public int compareTo (Employee o){
            int res = name.compareTo(o.name);
            if (res == 0) {
                return Double.compare(calculateSalary(), o.calculateSalary());
            }
            return res;
        }

}

