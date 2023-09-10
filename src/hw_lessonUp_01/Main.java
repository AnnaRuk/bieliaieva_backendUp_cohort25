package hw_lessonUp_01;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

        SqlGenerator generator = new SqlGenerator();

        String staff2 = generator.generateTable(Staff.class);
        System.out.println(staff2);
        System.out.println("**********************");
        String apartment = generator.generateTable(Apartment.class);
        System.out.println(apartment);
    }
}
