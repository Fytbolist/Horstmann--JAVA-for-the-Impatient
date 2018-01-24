import java.io.File;
import java.io.FilenameFilter;//нужные библиотеки
public class Task11 {

    public static void main(String[] args) {//тельце
        File dir = new File("/Users/alexvasnesov/Documents/Информатика 1 семестр/Лекции Мельникова/Лекции МИФИ/Лекции по ЛВС");
// задаем директорию любую свою где есть документы
        for (String file : dir.list((directory, name) -> name.endsWith(".pdf"))) { // наше лямбда выражение
            System.out.println(file); //выводим все файлы в заданном формате
        }
    }
}