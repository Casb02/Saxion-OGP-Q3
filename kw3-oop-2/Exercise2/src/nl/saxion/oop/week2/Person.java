package nl.saxion.oop.week2;

public class Person {
    private String firstname;
    private String lastname;
    private String zipCode;
    private String phoneNumber;
    private int age;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age is negative.");
        } else if (age > 150) {
            throw new IllegalArgumentException("Age is too high.");
        }

        this.age = age;
    }

    public void setZipCode(String zipCode) {
        if (!vildateZip(zipCode)) throw new IllegalArgumentException("Invalid Zipcode.");
        this.zipCode = zipCode;
    }

    public void setPhonenumber(String phoneNumber) {
        if (!validateTel(phoneNumber)) throw new IllegalArgumentException("Invalid Phone number.");
        this.phoneNumber = phoneNumber;
    }


    //Helper methodes

    private boolean vildateZip(String zipCode) {
        if (zipCode.length() != 6) return false;
        for (int i = 0; i < 4; i++) {
            if (!Character.isDigit(zipCode.charAt(i))) return false;
        }
        for (int i = 4; i < 6; i++) {
            if (!Character.isLetter(zipCode.charAt(i))) return false;
        }
        return true;
    }

    private boolean validateTel(String telNumber) {
        if (telNumber.length() != 10) return false;
        for (int i = 0; i < 10; i++) {
            if (!Character.isDigit(telNumber.charAt(i))) return false;
            if (!(telNumber.charAt(0) == '0')) return false;
        }
        return true;
    }
    /**
     * This is the default generated toString from IntelliJ. It works for now!
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}