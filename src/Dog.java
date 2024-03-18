public class Dog {

    String breed;
    boolean hasOwner;
    int age;
    String color;

    public Dog(String dogBreed, boolean dogOwned, int dogYears, String dogColor) {
        System.out.println("Constructor invoked!");

        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
        color = dogColor;
    }

    public static void main(String[] args) {

        System.out.println("Main method started!");
        System.out.println();

        Dog fido = new Dog("poodle", false, 4, "red");
        Dog nunzio = new Dog("shiba inu", true, 12, "brown");

        boolean isFidoOlder = fido.age > nunzio.age;
        int totalDogYears = nunzio.age + fido.age;

        System.out.println("Two dogs are created: a " + fido.breed + " and a " + nunzio.breed);
        System.out.println("The total age of the dogs is: " + totalDogYears);
        System.out.println("The first dog " + fido.breed + " has an owner: " + fido.hasOwner);
        System.out.println("The second dog " + nunzio.breed + " has an owner: " + nunzio.hasOwner);
        System.out.println();
        System.out.println("Main method finished");
    }
}
