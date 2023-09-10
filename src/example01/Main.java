package example01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        System.out.println(validator.validate("hello"));
        Class<?> aClass = PasswordValidator.class;

        printBaseInfo(Integer.class);
        printBaseInfo(PasswordValidator.class);
        System.out.println("********* FIELDS **********");
        printAllFields(PasswordValidator.class);
    }

    public static void printBaseInfo(Class<?> aClass){
        System.out.println("***"+aClass);
        System.out.println("TypeName = " + aClass.getTypeName());
        System.out.println("SimpleName = " + aClass.getSimpleName());
        System.out.println("PackageName = " + aClass.getPackageName());

    }

    public static void printAllFields(Class<?> aClass){
        //Field[] fields = aClass.getFields();  only publick
        Field[] fields = aClass.getDeclaredFields();
        for (Field field: fields
             ) {
            System.out.println( field.getModifiers() + "/"
            +field.getType() + "/"
                    + field.getName());
        }
        System.out.println("******* METHODS ******");
        Method[] metods = aClass.getDeclaredMethods();
        for (Method metod: metods
             ) {
            System.out.println(metod.getReturnType());

        }

    }
}