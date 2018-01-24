import java.io.File;
import java.util.Arrays;
import java.util.Comparator;//нужные импорты

public class Task12 {
    public static void main(String[] args) {//тельце
        File dir = new File("/Users/alexvasnesov/Documents/Информатика 1 семестр/Лекции Мельникова/Лекции МИФИ/Лекции по ЛВС");
//вводим любую директорию в которой есть именно файлы какие-либо
        File[] files = dir.listFiles();

        for (File file : files) {
            System.out.println(file);//выводим все файлы которые нашлись в данной директории
        }

        Arrays.sort(files, (o1, o2) -> {//сортируев массив из найденных файлов
            if (o1.isDirectory() && o2.isDirectory()) { //берем по два обьекта -- если они оба являются директориями то
                return o1.getName().compareTo(o2.getName());//сравниваем имя первого обьекта с именем второго обьекта и ставим по возрастанию
            } else if (o1.isDirectory() && !o2.isDirectory()){//если первый обьект директория а второй обьект обычный документ
                return -1;//то не сравниваем ибо у нас выводятся сначала директории а потом все остальные файлы
            } else if (!o1.isDirectory() && o2.isDirectory()) {//если первый обьект обычный документ а второй директория -- аналогично
                return 1;//не сравниваем а возвращаем 1
            } else {
                return o1.getName().compareTo(o2.getName());//если оба обьекты у нас обычные файлы то опять сравниваем имена
            }
        });

        System.out.println();//строчка для разделения

        for (File file : files) {
            System.out.println(file); //выводим наши отсортированные файлики
        }
    }
}