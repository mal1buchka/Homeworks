package august_17.task_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat(),
                new Dog(),
                new Cow(),
                new Dog(),
                new Cat()
        };
        Dog[] dogs = getDog(animals);

        System.out.println(Arrays.toString(dogs));
    }
    public static Dog[] getDog(Animal[] animals){
        int lengthOfDog = 0;
        for(Animal animal : animals){
            if(animal instanceof Dog){
                lengthOfDog++;
            }
        }
        Dog[] dogs = new Dog[lengthOfDog];
        for(Animal animal : animals){
            if(animal instanceof Dog){
                dogs[lengthOfDog-1] = (Dog)animal;
                lengthOfDog--;
            }
        }
        return dogs;
    }
}
