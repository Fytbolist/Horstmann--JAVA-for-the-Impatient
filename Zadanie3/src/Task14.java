import java.util.Arrays;
import java.util.Comparator;


public class Task14 {

    public static void main(String[] args) { //наша основная функция
        Task1[] employees = new Task1[] {    //задаем наших работников и их зарплату
                new Task1("Vasya", 23),
                new Task1("Anya", 54),
                new Task1("Lena", 88),
                new Task1("Andrey", 12),
                new Task1("Luyba", 12),
                new Task1("Ksuha", 88)
        };



        Arrays.sort(employees, Comparator.comparing(Task1::getSalary) // сортируем наш массив сначала по зарплате
                .thenComparing(Comparator.comparing(Task1::getName))); // а затем по имени , то есть если зп будет одинаковая
//то он отсортируем по имени
        for (Task1 e : employees) {
            System.out.println(e);  //выводим наш отсортированный массивчик
        }
        System.out.println();//добавляем пустую строку чтобы разделить наш следующий массив


        Arrays.sort(employees, Comparator.comparing(Task1::getSalary) //так же сортируем наш массив, только в конце добавляем реверсед чтобы отсортировался в обратном порядке
                .thenComparing(Comparator.comparing(Task1::getName)).reversed());
        for (Task1 r : employees) {
            System.out.println(r);//выводим наш массивчик отсортированный в обратном порядке
        }
}}