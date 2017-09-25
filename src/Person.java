public class Person {

    private String name;

    public Person(String aName) {
        name = aName;
    }
    // Returns the person's name
    public String getName() {
        return this.name;
    }

    // Changes the property to the passed in value
    public void setName(String name) {
        this.name = name;
    }

    // Prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args){
        Person person = new Person("Jordan");
        System.out.println(person.getName());
        person.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName()); //John
        System.out.println(person2.getName()); //John
        person2.setName("Jane");
        System.out.println(person1.getName()); //John
        System.out.println(person2.getName()); //Jane


    }

}
