import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Utils {

    public static Object deepCopy(Object obj){
        Class a = null;
        try {
            a = Class.forName(obj.getClass().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Object obj2 = null;




        return obj2;

    }

}
