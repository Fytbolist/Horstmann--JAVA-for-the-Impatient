import java.io.File;

abstract class Greeter3 implements Runnable {//обьявляем класс Гритер 2 спецом для этого задания

    private int n; //обьявляем переменные нужные
    private String target;


    public Greeter3(int n, String target) {//говорим чтобы передавались нашим переменным определенные значения
        this.n = n;
        this.target = target;
    }

/*
    @Override
    public void run() { //делаем метод ран как в 8 задании чтобы выводилось Хелло и таргет н раз
        for (int i = 0; i < n; i++) {
            System.out.println("Hello " + target);
        }
    }*/

   public static Runnable compose(int n, String target) {

        Runnable r = () ->
        {
            for (int i = 0; i < n; i++)
                System.out.println("Hello" + target);
        };

        return r;
    }



    public static void runTogether(Runnable... tasks) {//делаем метод который запускает каждое задание в своем потоке
        for (Runnable r : tasks) {
            Thread t = new Thread(r);
            t.start();
        }
    }

    public static void runInOrder(Runnable... tasks) {//второй метод запускает задания в одном потоке и заканчивается только тогда когда последний поток прошел
        for (Runnable r : tasks) {
            r.run();
        }
    }
}

public class Taskdop {

    public static void main(String[] args) {
        Greeter3.runTogether(Greeter3.compose(5,"FFF"), Greeter3.compose(6,"GGG"));//выводим сначала по методу 1
        Greeter3.runInOrder(Greeter3.compose(5,"FFF"), Greeter3.compose(6,"GGG"));
    }
}