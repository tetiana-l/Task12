package Task12;

public class ImpossibleNameException extends Exception {

    private final String name;
    private final String surname;

    public ImpossibleNameException(String errorMessage, String name, String surname) {
        super(errorMessage);
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
