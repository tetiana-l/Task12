package Task12;

public class Validator {
    public static void checkIfSalaryPositiveNumber(double salary) throws TooSmallSalaryException {
        if (salary < 0) {
            throw new TooSmallSalaryException("Incorrect salary ", salary);
        }
    }

    public static void checkIfNameIsInCorrectFormat(String name, String surname) throws ImpossibleNameException {
        if (!(name.matches("[a-zA-Z]+") && surname.matches("[a-zA-Z]+"))) {
            throw new ImpossibleNameException("Incorrect name or surname", name, surname);
        }
    }
}
