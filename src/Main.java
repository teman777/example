import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        List<String> l = new ArrayList<>();
        l.add("123");
        l.add("321");
        Man m = new Man("Artem", 23, l);
        Man s = (Man) Utils.deepCopy(m);*/
        Woman woman = new Woman(20, 45.6F);
        Woman woman2 = (Woman) Utils.deepCopyLazy(woman);
    }
}
