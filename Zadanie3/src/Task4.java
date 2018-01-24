
public class Task4 {

    public static void main(String[] args) {//тельце
        IntSequence sequence = IntSequence.of(0, 22, 64, 91, 99);//Интсекуэнс БЕРЕТСЯ ИЗ ЗАДАНИЯ 5!!!! только уже не с 1 числом

        while (sequence.hasNext()) { //пока у нас есть чем заполнить
            System.out.println(sequence.next());//выводим по чиселке
        }
    }
}
