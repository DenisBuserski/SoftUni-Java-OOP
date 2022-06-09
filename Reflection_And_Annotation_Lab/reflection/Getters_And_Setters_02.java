package reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Getters_And_Setters_02 {
    public static void main(String[] args) {

        Class clazz = Reflection.class;

        Method[] declaredMethods = clazz.getDeclaredMethods();

//        Arrays.stream(declaredMethods)
//                .filter(m -> m.getName().contains("set") || m.getName().contains("get"))
//                .sorted(Comparator.comparing(Method::getName))
//                .forEach(Getters_And_Setters_02::printMethod);

        List<Method> methodList = new ArrayList<>();
        for (Method method : declaredMethods) {
            if (method.getName().contains("set") || method.getName().contains("get")) {
                methodList.add(method);
            }
        }
        methodList.sort(Comparator.comparing(Method::getName));
        for (Method method : methodList) {
            printMethod(method);
        }

    }

    public static void printMethod(Method method) {
        String out = method.getName().contains("set") ?
                String.format("%s and will set field of %s", method.getName(), formatType(method.getParameterTypes()[0])) :
                String.format("%s will return %s", method.getName(), formatType(method.getReturnType()));
        System.out.println(out);
    }

    public static String formatType(Class<?> type) {
        return type == int.class ? "class " + type : type.toString();
    }
}