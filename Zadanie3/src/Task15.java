import java.util.Random;//нужный импорт

class Task15 {
    public static void main(String[] args) {//тельце
        IntSequence seq = Nyzhnoe.randomInts(4, 9);//наша последовательность будет от 4 до 9
        for (int i = 0; i < 6; i++) { //всего выведем 6 элементов
            System.out.println(seq.next());//выводим последовательность по одному, в очередь, сукины дети!
        }
    }}

class Nyzhnoe {
    private static Random generator = new Random();//как в учебнике, переписываем
    private static class RandomSequence implements IntSequence { //имплементим РандомСекуенс, который дан в учебнике
        private int low;//лбьявляем переменные
        private int high;
        public RandomSequence(int low, int high) { //дано в уучебнике
            this.low = low; //присваиваем значения переменным определенные
            this.high = high;
        }
        @Override
        public int next() {
            return low + generator.nextInt(high - low + 1);
        }//из учебника переписываем
    }

    public static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }
}// вставляем в РандомСекуенс значения Лоу и Хай

//нам надо было выполнить то что из учебника (строчки 9 - 21) как вложенный класс


