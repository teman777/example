import com.sun.jdi.InterfaceType;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Utils {



    public static Object deepCopyLazy(Object obj){
        HashMap<String, Object> values = new HashMap<String, Object>();
        Class<?> clazz = obj.getClass();
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field: fields){
            field.setAccessible(true);
            try {
                values.put(field.getName(), field.get(obj));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        Constructor<?> buildableConstructor = null;
        for(Constructor<?> constructor: constructors){
            if(constructor.getParameters().length == 0){
                buildableConstructor = constructor;
                break;
            }
        }
        Object result = null;
        try {
            result = buildableConstructor.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        for(Field field: fields){
            field.setAccessible(true);
            Object value = values.get(field.getName());
            try {
                field.set(result, value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }


        return obj;
    }

}
