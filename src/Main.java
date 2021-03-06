import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        Woman w = new Woman(10, 45f,"Suka", 12);
        Woman c = null;
        try {
            c = (Woman) Utils.copyVars(w);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();

    }
}
