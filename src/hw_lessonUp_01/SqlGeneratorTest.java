package hw_lessonUp_01;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("SqlGenerator is works ...")
@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
class SqlGeneratorTest {
    private SqlGenerator generator;

    @BeforeEach
    public void setUp() {
        generator = new SqlGenerator();
    }

    @DisplayName("generateTable()...")
    @Nested
    public class GenerateTableStaff {
      @Test
        void return_create_correct_sql_request_from_staff_table() {
            String expected = "CREATE TABLE Staff\n" +
                    "(\n" +
                    "id INT PRIMARY KEY NOT NULL,\n" +
                    "name VARCHAR(255) NOT NULL,\n" +
                    "email VARCHAR(255) UNIQUE NOT NULL\n" +
                    ");";

            String actual = generator.generateTable(Staff.class);

            assertEquals(expected, actual);


        }
    }

    @DisplayName("generateTable()...")
    @Nested
    public class GenerateTableApartment {
        @Test
        void return_create_correct_sql_request_from_apartment_table() {
            String expected = "CREATE TABLE Apartment\n" +
                    "(\n" +
                    "KadastNumber INT PRIMARY KEY UNIQUE NOT NULL,\n" +
                    "city VARCHAR(255) NOT NULL,\n" +
                    "address VARCHAR(255) NOT NULL,\n" +
                    "purpose VARCHAR(255)\n" +
                    ");";

            String actual = generator.generateTable(Apartment.class);

            assertEquals(expected, actual);

        }
    }


}