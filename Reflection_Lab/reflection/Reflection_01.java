package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection_01 {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        Class<Reflection> clazz = Reflection.class;

        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getSuperclass().getSimpleName());

        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }

        // Constructor<Reflection> ctor = clazz.getDeclaredConstructor();
        Constructor<Reflection> ctor = clazz.getDeclaredConstructor(String.class, String.class, String.class);
        
        ctor.setAccessible(true);
        Reflection reflection = ctor.newInstance("Denis", "WebAddress", "Email");
        System.out.println(reflection.toString());

    }
}