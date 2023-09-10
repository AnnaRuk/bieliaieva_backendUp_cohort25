package hw_lessonUp_01;


import java.util.Objects;
import java.util.Random;

public class Staff {

    @PrimaryKey
    @NotNull
    private long id;
    Random random = new Random();

    @Varchar(maxLength = 255)
    @NotNull
    private String name;

    @Varchar(maxLength = 255)
    @NotNull
    @Unique
    private String email;

public Staff(){}

   Staff(String name, String email) {
        this.id = random.nextLong();
        this.name = name;
        this.email = email;
    }

   Staff(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return id == staff.id && Objects.equals(random, staff.random) && Objects.equals(name, staff.name) && Objects.equals(email, staff.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, random, name, email);
    }
}



