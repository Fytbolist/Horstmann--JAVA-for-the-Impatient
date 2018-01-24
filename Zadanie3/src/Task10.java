import java.io.File;
import java.io.FileFilter;//нужные импорты

public class Task10 {

    public static void main(String[] args) {//тельце
        File dir = new File("/Users/alexvasnesov/Documents/Информатика 1 семестр");//вставить свой путь к любой папке в которой что то есть

        for (File d : dir.listFiles((f) -> f.isDirectory())) {     //используем лямбда выражения
            System.out.println(d);//вывод
        }

        System.out.println();//для разделения

        for (File d : dir.listFiles(File::isDirectory)) {       //используем выражение метода
            System.out.println(d);//вывод
        }

        System.out.println();//для разделения

        for (File d : dir.listFiles(new FileFilter() { //используя анонимный класс
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            } //если правильное название пути то
        })) {                                                                       // возвращает все директории
            System.out.println(d);//вывод
        }
    }

}