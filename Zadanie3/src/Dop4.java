import java.io.Serializable;
import java.util.Objects;

public class Dop4 {

    static Comparator<Integer> compare1 = new Comparator<Integer>() {
       @Override
       public int compare(int c1, int c2) {
           if (c1 ==c2){return c1;}
           return c2;
       }
    };
    static Comparator<Integer> compare2 = new Comparator<Integer>() {
        @Override
        public int compare(int c1, int c2) {
            if (c1-1000>0){return c1;}
            return c2;
        }
    };
    public interface Comparator<T> {
        default Dop4.Comparator<Integer> thenComparing(Dop4.Comparator<Integer> other) {
            Objects.requireNonNull(other);
            return (Comparator<Integer> & Serializable) (c1, c2) -> {
               int res = compare(c1, c2);
                return(res!=0)   ? res : other.compare(c1, c2);
            };
        }

        int compare(int c1, int c2);

    }

    public static void main(String[] args) {

        int s1 = 1980;
        int s2 = 1890;
        int s3 = 1340;




       System.out.println(compare1.compare(s1,s2));
       System.out.println(compare2.compare(s1,s2));
System.out.println(compare2.thenComparing(compare1));
}}
