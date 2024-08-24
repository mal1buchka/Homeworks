package august_24;

public class TheterTest {
    public static void main(String[] args) {
        Theater<Integer, Person> theater = new Theater<>(16);

        theater.addPerson(1, new Client("Alice"));
        theater.addPerson(1, new Staff("Bob"));
        theater.addPerson(1, new Critic("Charlie"));

        /*theater.addPerson(1, new Critic("Charlie2"));
        theater.addPerson(1, new Critic("Charlie3"));
        theater.addPerson(1, new Critic("Charlie4"));
        theater.addPerson(1, new Critic("Charlie5"));
        theater.addPerson(1, new Critic("Charlie6"));
        theater.addPerson(1, new Critic("Charlie7"));
        theater.addPerson(1, new Critic("Charlie8"));
        theater.addPerson(1, new Critic("Charlie9"));
        theater.addPerson(1, new Critic("Charlie10"));*/



        theater.checkTickets();

        theater.removePerson(1, 1);
        System.out.println("\n");

        theater.checkTickets();

    }
}
