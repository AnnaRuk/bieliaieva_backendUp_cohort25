package hw_lessonUp_01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class SqlGenerator {

    public String generateTable(Class<?> tableClass) {
            StringBuilder sqlTable = new StringBuilder("CREATE TABLE " + tableClass.getSimpleName() + "\n" + "(" + "\n");
            Field[] fields = tableClass.getDeclaredFields();
            for (Field field : fields
            ) {

                PrimaryKey primaryKey = field.getDeclaredAnnotation(PrimaryKey.class);
                Varchar varchar = field.getDeclaredAnnotation(Varchar.class);
                NotNull notNull = field.getDeclaredAnnotation(NotNull.class);
                Unique unique = field.getDeclaredAnnotation(Unique.class);

                if (primaryKey != null) {
                    sqlTable.append(field.getName()).append(" INT PRIMARY KEY");
                }

                if (varchar != null) {
                    sqlTable.append(",\n").append(field.getName()).append(" VARCHAR(255)");
                }

                if (unique != null) {
                    sqlTable.append(" UNIQUE");
                }

                if (notNull != null) {
                    sqlTable.append(" NOT NULL");
                }
            }

            return sqlTable.append("\n").append(");").toString();

        }

    }





//    CREATE TABLE Staff
//        (
//                id INT PRIMARY KEY,
//                name VARCHAR(255) NOT NULL,
//    email VARCHAR(255) UNIQUE NOT NULL
//);







