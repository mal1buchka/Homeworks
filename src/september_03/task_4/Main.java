package september_03.task_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class Main {
    public static void main(String[] args) {
        List<Client> clients = Arrays.asList(
                new Client("Alice", 30, List.of(new Phone("+996500700701", Phone.PhoneType.Mobile))),
                new Client("Bob", 55, List.of(new Phone("+996500700702", Phone.PhoneType.Stacionar))),
                new Client("Charlie", 42, Arrays.asList(new Phone("+996500700703", Phone.PhoneType.Mobile), new Phone("456-7890", Phone.PhoneType.Stacionar))),
                new Client("David", 60, List.of(new Phone("+996500700704", Phone.PhoneType.Stacionar))),
                new Client("Eva", 50, List.of(new Phone("+996500700705", Phone.PhoneType.Mobile)))
        );
        Optional<Client> oldestClientWithLandline = clients.stream()
                .filter(client -> client.getPhones().stream()
                        .anyMatch(phone -> phone.getType() == Phone.PhoneType.Stacionar))
                .max(Comparator.comparingInt(Client::getAge));

        if (oldestClientWithLandline.isPresent()) {
            Client client = oldestClientWithLandline.get();
            System.out.println("Самый возрастной клиент: " + client.getName() + ", возраст: " + client.getAge());
        } else {
            System.out.println("Клиентов не найдено.");
        }
    }
}
