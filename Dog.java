public class Dog {
   
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "Golden Retriever");
        Dog dog2 = new Dog("Rocky", "Bulldog");

        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");
        System.out.println();

        System.out.println("Set the new Breed of dog1 and new name of dog2:");
        dog1.setBreed("Labrador Retriever");
        dog2.setName("tomy");

        System.out.println(dog1.getName() + " is now a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");
    }
}