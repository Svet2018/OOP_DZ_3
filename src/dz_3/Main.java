package dz_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import static dz_3.Employee.genEmployee;

public class Main {

    /*
    Доработать приложение, которое мы разрабатывали на уроке.
    Мы должны поработать с сортировкой объектов, освоить работу с интерфейсами Comparator, Comparable.
    Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
    Переработать метод generateEmployee, метод должен создавать случайного сотрудника
    (Worker, Freelancer или любого другого). Метод должен быть один!
    Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту?
    Тогда добавьте соответствующее состояние на уровне ваших классов).
    Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.
    */



        static Random random = new Random();

        /**
         * TODO: Переработать метод generateEmployee в рамках домашнего задания,
         *  метод должен генерировать рабочих (Employee) разных типов.
         * @return
         */
//        static Worker generateEmployee(){
//            String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
//            String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
//            int salary = random.nextInt(20000, 80000);
//            int age = random.nextInt(18, 25);
//            return new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
//        }




        /**
         * TODO: Придумать новые состояния для наших сотрудников
         *   Придумать несколько Comparator'ов для сортировки сотрудников
         *   по фамилии + имени или по возрасту + уровню зп.
         * @param args
         */
        public static void main(String[] args) {



            Employee[] employees = new Employee[10];
            for (int i = 0; i < employees.length; i++)
            {
                //employees[i] = generateEmployee();
                employees[i] = genEmployee();
            }

            for (Employee employee: employees) {
                System.out.println(employee);
            }

            System.out.println("________");

            Arrays.sort(employees);

            for (Employee employee: employees) {
                System.out.println(employee);
            }



        }



}