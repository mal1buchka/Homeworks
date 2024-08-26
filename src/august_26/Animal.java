package august_26;

public class Animal {
    void makeSound(){
        System.out.println("Some sound");
    }

    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            void makeSound(){
                System.out.println("Meow");
            }
        };
        animal.makeSound();
    }
}
