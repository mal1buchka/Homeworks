package september_03.task_4;

public class Phone {
    private String number;
    private PhoneType type;

    public Phone(String number, PhoneType type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public PhoneType getType() {
        return type;
    }

    // Перечисление типов телефонов
    public enum PhoneType {
        Mobile,
        Stacionar
    }
}
