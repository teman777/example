import com.sun.jdi.InterfaceType;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static Object deepCopy(Object obj){
        Class<?> clazz = obj.getClass();
        List<String> l = new ArrayList<>();
        Object res = null;
        try {
            res = clazz.getDeclaredConstructor(String.class, int.class, List.class).newInstance("1", 2, l);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Field[] fields = clazz.getDeclaredFields();
        for(Field field: fields){

        }







        return obj;

    }

}
