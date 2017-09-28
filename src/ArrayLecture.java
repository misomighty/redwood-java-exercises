import util.Input;
public class ArrayLecture {
    public static void main(String[] args) {
        Person[] people;
        people = new Person[4]; //the length, which is 1 greater than the highest index

        // We can fill an array as follows but it's a bit redundant..
        people[0] = new Person("Fernando");
        people[1] = new Person("Zach");

        // We can use the array initializer too
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        Input input = new Input();
        System.out.print("How big is your array: ");
        int sizeOfArr = input.getInt();

        String[] foods = new String[sizeOfArr];
        System.out.println("Size of array is " + foods.length + " elements.");

        for(int i = 0; i < sizeOfArr; i++) {
            foods[i] = input.getString("What are you eating for lunch?");
        }

        // Enhanced for loop
        for(String food : foods) {
            System.out.println("You are eating " + food + " for lunch.");
        }
    }
}
