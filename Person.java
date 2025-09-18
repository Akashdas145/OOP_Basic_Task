public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        // Create initial Person objects
        Person person1 = new Person("Akash", 21);
        Person person2 = new Person("Sourav", 23);

        // Print initial data
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
        System.out.println();

        // Update name and age
        System.out.println("Set new age and name:");
        person1.setAge(24); // updating age only
        person2.setName("Tanjim"); // updating name only

        // Print updated data
        System.out.println(person1.getName() + " is now " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is now " + person2.getAge() + " years old.");
    }
}
