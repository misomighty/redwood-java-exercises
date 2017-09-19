public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        // Create a do-while loop that will count by 2's starting with 0 and ending at 100.
        // Alter your loop to count backwards by 5's from 100 to -10.
        // Square a number (2) until 100,000
//        long j = 2;
//        do {
//            System.out.println(j);
//            j = j * j;
//
//
//        }while(j <= 100000);

        for(long j = 2; j < 100000; j*=j) {
            System.out.println(j);

        }
    }

}
