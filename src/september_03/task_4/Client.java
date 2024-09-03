package september_03.task_4;
import java.util.List;
import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private int age;
    private List<Phone> phones;

    public Client(String name, int age, List<Phone> phones) {
        this.id = UUID.randomUUID(); // Генерация уникального идентификатора
        this.name = name;
        this.age = age;
        this.phones = phones;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Phone> getPhones() {
        return phones;
    }
}
