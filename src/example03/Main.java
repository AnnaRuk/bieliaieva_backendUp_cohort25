package example03;

public class Main {
    public static void main(String[] args) {

            ObjectCreator creator = new ObjectCreator();
            Bill bill = creator.create(Bill.class);
            Document document = creator.create(Document.class);

            System.out.println(bill);
            System.out.println(document);
        }
    }

