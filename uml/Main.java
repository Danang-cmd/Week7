public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Doggy", 3, "Golden Retriever");
        Animal myAnimal = new Animal("Generic Animal", 5);

        System.out.println(myDog);
        myDog.makeSound();

        System.out.println(myAnimal);
        myAnimal.makeSound();
    }
}