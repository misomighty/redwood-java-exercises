import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        // Fizz Buzz
//        int i = 0;
//
//        do {
//            if(!(i % 3 == 0) && !(i % 5 == 0)) {
//                System.out.println(i);
//            } else {
//                if(i % 3 == 0) {
//                    System.out.print("Fizz");
//                }
//                if(i % 5 == 0) {
//                    System.out.print("Buzz");
//                }
//            }
//            System.out.println();
//            i++;
//        } while(i <= 100);

        // Powers Table
        System.out.println("Enter an integer: ");
        Scanner scan = new Scanner(System.in);
        int userNum = scan.nextInt();
////
//
//
//        // titles
        System.out.printf("number | squared | cubed\n");
//        // header border
        System.out.printf("%-7s", "------ | ");
        System.out.printf(" %-7s", "------- |");
        System.out.printf(" %-6s", "----- ");
        System.out.println();
//        // table
        for(int i = 1; i <= userNum; i++) {
            System.out.printf("%7s|", i);
            System.out.printf(" %-8s|", i*i);
            System.out.printf(" %-5s", i*i*i);
            System.out.println();
        }

        // grades
//        System.out.println("What's your grade percent: ?");
//        int userGrade = scan.nextInt();
//
//
//            if(userGrade >= 88) {
//                if(userGrade >= 95) {
//
//                    System.out.println("A+");
//                }
//                else if(userGrade >= 92) {
//
//                    System.out.println("A");
//                } else {
//
//                    System.out.println("A-");
//                }
//            }
//            else if(userGrade >= 80) {
//                if(userGrade >= 85) {
//                    System.out.println("B+");
//                }
//                else if(userGrade >= 83) {
//                    System.out.println("B");
//                } else {
//
//                    System.out.println("B-");
//                }
//            }
//            else if(userGrade >= 67) {
//                if(userGrade >= 76) {
//                    System.out.println("C+");
//                }
//                else if(userGrade >= 70) {
//                    System.out.println("C");
//                }
//                else {
//                    System.out.println("C-");
//                }
//            }
//            else if(userGrade >= 60) {
//                if(userGrade >= 64) {
//                    System.out.println("D+");
//                }
//               else if(userGrade >= 62) {
//                    System.out.println("D");
//                }
//                else {
//                    System.out.println("D-");
//                }
//            }
//        else if(userGrade >= 60) {
//            System.out.println("F");
//        }else {
//                System.out.println("Error");
//        }



    }


}
