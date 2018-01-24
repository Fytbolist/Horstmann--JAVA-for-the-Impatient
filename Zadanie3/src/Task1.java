//(Employee - Task1 захотелось мне так)/
interface Measurable {
    double getMeasure();
}

public class Task1 implements Measurable {

    @Override
    public String toString() {         //так мы задаем работника, которому добавляем имя и зарплату
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    private String name;
    private double salary;

    public Task1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    } //получить имя

    public void setName(String name) {
        this.name = name;
    } //задать имя

    public double getSalary() {
        return salary;
    } //получить зарплату

    public void setSalary(double salary) {
        this.salary = salary;
    } //задать зарплату

    @Override
    public double getMeasure() {
        return salary;
    } // выполняемый метод интерфейса

    public static double average(Measurable[] objects) { //метод который считает среднюю зарплату
        double result = 0;

        for (Measurable object : objects) { //для всех наших работников
            result += object.getMeasure(); //складываем зарплату
        }

        if (objects.length != 0) { //делим зарплату на количество обьектов
            result /= objects.length;
        }

        return result; //результат и будет наша зп средняя
    }


    public static void main(String[] args) {
        Task1[] employees = { //задаем наших работников и их зарплаты (Employee - Task1 захотелось мне так)
                new Task1("Vasya", 10),
                new Task1("Anya", 10),
                new Task1("Lena", 1000),
                new Task1("Andrey", 10),
                new Task1("Luyba", 10),
                new Task1("Alyosha", 10000)

        };

        System.out.println("Средняя зарплата: " + average(employees)); //выводим среднюю зарплату


    }
}