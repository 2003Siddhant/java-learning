// import java.util.*;

public class String2 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("siddhant");

        s.append(" sakhare is great man");
        System.out.println(s);

        StringBuilder a = new StringBuilder(25);
        a.append(423);
        a.append(789);
        a.append(523);

        System.out.println(a.toString());
    }
}
// stringbuilder and stringbuffer are mutable in comparison to string also they
// are stored inside heap.
// also builder are fastest in comparison to buffer