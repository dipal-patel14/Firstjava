import java.util.Scanner;

public class Hello_World {


    public static void main(String[] args) {

//        int arr[] = new int[3];    using int (length is declare
//
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//
//        for (int j = 0; j < arr.length; j++)
//        System.out.println(arr[j]);


//        String S[] = new String[3];  //using "" sign we can initializing int in string in array we can use int this way
//
//        S[0] = "Dipal";
//        S[1] = "20";
//        S[2] = "tanvi";
//
//        for (int j = 0; j < S.length; j++)
//            System.out.println(S[j]);


        // int a[][] = new int[4][6]; //2 way declare pachi initailisation karvu pade
        int a[][] = {{1,2,3},{4,5,6}, {6,7,8}};
        //multiple Arrays or 2D Arrays 1 way badhu ekaj line ma aave

        int transpose[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = a[j][i];
            }
            }

                System.out.println(" Printing Matrinx without transpose:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++){
                    System.out.println(a[i][j] + " ");
                }
                System.out.println();
            }
        System.out.println(" Printing Matrinx with transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.println(transpose[i][j] + " ");
            }
            System.out.println();



            }
        }
    }















////        Scanner scanner = new Scanner(System.in);
////        System.out.println(" Enter your number");
////        int num = scanner.nextInt();
//          int num = 0;
//        switch (num) {
//            case 1:
//                System.out.println(" number is positive");
//                break;
//            case -1:
//                System.out.println(" number is Negative");
//                break;
//            case 0:
//             System.out.println(" number is Zero");
//                break;
//    }    }









