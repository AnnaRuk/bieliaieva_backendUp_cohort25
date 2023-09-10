package hw_lessonUp_01;

import java.util.Objects;
import java.util.Queue;

public class Apartment {

    @PrimaryKey
    @NotNull
    @Unique
    private int KadastNumber;

    @Varchar(maxLength = 255)
    @NotNull
    private String city;

    @Varchar(maxLength = 255)
    @NotNull
    private String address;

    @Varchar(maxLength = 255)
    private String purpose;

    Apartment(int kadastNumber, String city, String address, String purpose) {
        KadastNumber = kadastNumber;
        this.city = city;
        this.address = address;
        this.purpose = purpose;
    }

    public Apartment(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return KadastNumber == apartment.KadastNumber && Objects.equals(city, apartment.city) && Objects.equals(address, apartment.address) && Objects.equals(purpose, apartment.purpose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(KadastNumber, city, address, purpose);
    }
}
