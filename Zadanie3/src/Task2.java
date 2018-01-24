public class Task2 {

public static Measurable largest(Measurable[] objects) { //метод который выводит у кого самая большая зп
        if (objects.length == 0) { //если нет обьектов то выводим просто 0
        return null;
        }

        Measurable result = objects[0];

        for (Measurable object : objects) { //для всех обьектов (перебираем все объекты начиная с нулевого, потом Васян, потом Аня и тд)
        if (object.getMeasure() > result.getMeasure()) {
        result = object; //(для первого прохождения говорим, что результат это Васян)
        }
        }
        return result; //возвращаем обьект
        }


public static void main(String[] args) { //основное тельце
        Task1[] employees = { //задаем наших работников и их зарплаты
        new Task1("Vasya", 10),
        new Task1("Anya", 900),
        new Task1("Lena", 20000),
        new Task1("Andrey", 100),
        new Task1("Luyba", 12),
        new Task1("Alyosha", 1000000)

        };
        Measurable richemp = largest(employees); //вычисляем кто тут босс

        if (richemp != null) {
        System.out.println("Самый богатый сотрудник: " + ((Task1)richemp).getName()); //если таковой есть то записываем его
        }
        }}