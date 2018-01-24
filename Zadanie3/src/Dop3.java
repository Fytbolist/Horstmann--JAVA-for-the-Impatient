/*import java.io.Serializable;
import java.util.*;

import static java.util.Comparator.*;

public class Dop3{

    static Comparator<Object> compare1 = new Comparator<Object>() {
        public int compare(Object o1, Object o2) {

            if(o1.hashCode() < o2.hashCode()) {
                return -1;
            } else if(o1.hashCode() > o2.hashCode()) {
                return 1;
            } else {
                return 0;
            }
        }
    };
    static Comparator<ArrayList> compare2 = new Comparator<ArrayList>() {
        public int compare(Object o3, Object o4) {

            if(o3.hashCode() < o4.hashCode()) {
                return -1;
            } else if(o3.hashCode() > o4.hashCode()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public interface Comparator<T> extends java.util.Comparator<T> {
        default Comparator<Object> thenComparing(Comparator<Object> other) {
            Objects.requireNonNull(other);
            return (Comparator<Object> & Serializable) (c1, c2) -> {
                int res = compare(c1, c2);
                return (res != 0) ? res : other.compare(c1, c2);
            };
        }

        int compare(Object c1, Object c2);
    }


    public static void main(String[] args) {

        ArrayList<Object> students1 = new ArrayList<Object>();
        ArrayList<Object> students2 = new ArrayList<Object>();

        students1.add(new Object());
        students1.add(new Object());
        students1.add(new Object());
        students2.add(new Object());
        students2.add(new Object());
        students2.add(new Object());
        System.out.println(students1);
        System.out.println(students2);
        System.out.println("Luchshii massiv iz nix");
        Arrays.sort(students1,compare2);


    }
}*/