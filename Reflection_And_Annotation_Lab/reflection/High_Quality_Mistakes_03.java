package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class High_Quality_Mistakes_03 {
    public static void main(String[] args) {

        Class clazz = Reflection.class;

        Field[] declaredFields = clazz.getDeclaredFields();
        Arrays.stream(declaredFields)
                .sorted(Comparator.comparing(Field::getName))
                .forEach(f -> {
                    if (!Modifier.isPrivate(f.getModifiers())) {
                        System.out.println(f.getName() + " must be private!");
                    }
                });

        Method[] declaredMethods = clazz.getDeclaredMethods();

        Arrays.stream(declaredMethods)
                .filter(m -> m.getName().contains("set") || m.getName().contains("get"))
                .sorted(Comparator.comparing(Method::getName))
                .forEach(High_Quality_Mistakes_03::printMethod);
    }

    public static void printMethod(Method method) {
        String out;
        if (method.getName().contains("set") && !Modifier.isPrivate(method.getModifiers())) {
            out = String.format("%s have to be private!", method.getName());
        } else if (method.getName().contains("get") && !Modifier.isPublic(method.getModifiers())) {
            out = String.format("%s have to be public!", method.getName());
        } else {
            return;
        }
        System.out.println(out);
    }

}