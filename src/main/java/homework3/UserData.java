package homework3;

public class UserData {
    private String lastName;
    private String firstName;
    private String middleName;
    private String birthDate;
    private String phoneNumber;
    private String gender;

    public UserData(String lastName, String firstName, String middleName, String birthDate, String phoneNumber, String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String toString() {
        return "Данные пользователя{" +
                "Фамилия='" + lastName + '\'' +
                ", Имя='" + firstName + '\'' +
                ", Отчество='" + middleName + '\'' +
                ", Дата рождения='" + birthDate + '\'' +
                ", Номер телефона='" + phoneNumber + '\'' +
                ", Пол='" + gender + '\'' +
                '}';
    }
}

