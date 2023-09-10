package example01;

public class PasswordValidator {

    public String defaultMessage = "bed password";
    private int minLength; // po umolchaniyu  = 0 tak kak pustoy konstruktor i net settera

    public PasswordValidator(String defaultMassage, int minLength) {
        this.defaultMessage = defaultMassage;
        this.minLength = minLength;
    }

    public PasswordValidator(int minLength) {
        this.minLength = minLength;
    }
    public PasswordValidator() {

    }

    public boolean validate(String password){
        if (password.length()<minLength){
            System.out.println(defaultMessage);
            return false;
        }
        return true;
    }
}
