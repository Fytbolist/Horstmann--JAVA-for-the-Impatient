public class Task5 {

    public static void main(String[] args) {//основное тельце
        IntSequence constantSequence = IntSequence.constant(22);//говорим что наша ИнтСекуэнсконстант будет иметь вид только из числа 22
        for (int i = 0; i < 6; i++) { //циклим от 0 до 6
            System.out.println(constantSequence.next());//пишем нашу Интсекуэнс с значением
        }
    }
}
interface IntSequence { //интерфейс Интсекуэнс

    default boolean hasNext() {
        return true;
    } //объявляем булиновскую переменную hasnext, которая возвращает значение Тру

    int next();//объявляем интовую переменную Некст

    static IntSequence of(int... values) {  //у нас есть последовательность чисел инт
        return new IntSequence() { //типо "метод - нью метод" - тк нам надо будет отредактировать последовательность
            int index; //еще одна переменная плюс

            @Override
            public boolean hasNext() {
                return index < values.length;
            } //пока индекс будет меньше, чем сколько у нас должно быть значений

            @Override
            public int next() { //метод некст
                int value = values[index]; //значение переменной Вэлью - является индксом переменной
                index++; //берем следющую переменную
                return value; //возвращаем Вэлью - то есть индекс переенной
            }
        };
    }

    static IntSequence constant(int value) {
        return () -> value;
    } //лямбда выражение в котором мы возвращаем наше значение Вэлью
}