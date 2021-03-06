import com.sun.jdi.InterfaceType;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Utils {

    public static Object copyVars(Object obj) throws Exception {
        Object result = null;

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        Class<?>[] classes = new Class[fields.length];
        for(int i = 0; i < fields.length; i++){
            classes[i] = fields[i].getType();
        }
        Constructor<?> constructor = clazz.getDeclaredConstructor(classes);

        Object[] vars = new Object[fields.length];
        for(int i = 0; i < fields.length; i++){
            Object val = null;
            fields[i].setAccessible(true);
            if(checkClassName(fields[i].getClass().getName())){
                val = fields[i].get(obj);
            } else {
                val = copyVars(fields[i].get(obj));
            }
            vars[i] = val;
        }
        result = constructor.newInstance(vars);

        return result;
    }

    private static boolean checkClassName(String clazz){

        if(clazz.startsWith("java.lang.") || clazz.startsWith("int") || clazz.startsWith("float") || clazz.startsWith("long") || clazz.startsWith("char") || clazz.startsWith("double") || clazz.startsWith("byte") || clazz.startsWith("short")){
            return true;
        }
        return false;
    }




}


