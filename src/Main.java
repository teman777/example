import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("123");
        l.add("456");

        Man w = new Man("Alex", 25, l);
        Man c = null;
        try {
            c = (Man) Utils.copyVars(w);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();

    }
}
