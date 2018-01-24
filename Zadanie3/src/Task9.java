class Greeter2 implements Runnable {//обьявляем класс Гритер 2 спецом для этого задания

    private int n; //обьявляем переменные нужные
    private String target;


    public Greeter2(int n, String target) {//говорим чтобы передавались нашим переменным определенные значения
        this.n = n;
        this.target = target;
    }






    @Override
    public void run() { //делаем метод ран как в 8 задании чтобы выводилось Хелло и таргет н раз
        for (int i = 0; i < n; i++) {
            System.out.println("Hello " + target);
        }
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
public class Task9 {

    public static void main(String[] args) {//основное тельце
        Greeter2 g1 = new Greeter2(10, "Мир");//задаем параметры
        Greeter2 g2 = new Greeter2(10, "Цветочки");
        Greeter2.runTogether(g1, g2);//выводим сначала по методу 1
        Greeter2.runInOrder(g1, g2);//выводим по методу 2

    }
}