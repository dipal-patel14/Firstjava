
//1) Application with try-catch block

public class Try_Catch_Block {
    public static void main(String[] args) {
        System.out.println("Ratan world");
        try {
            System.out.println(10/0);       //Arithmetic Exception
        }
         catch (ArithmeticException e) {
             System.out.println(10 / 2);
         }
        System.out.println("rest of the app ");

        // 2) catch block not matched

//        try {
//            System.out.println(10/0);       //Arithmetic Exception
//        }
//        catch (NumberFormatException a) {  // catch must be same Exception
//            System.out.println(10 / 2);
//        }
//        System.out.println("rest of the app ");

      //3) No exception in try then catch blocks not checked


        try {
            System.out.println("ratan");
        } catch (NumberFormatException a) {  // this line will ignore by jvm if try block is correct.
            System.out.println(10 / 2);
        }
        System.out.println("rest of the app ");


    //4) try without catch, finally or resource declarations is not valid
//
//        try {
//            System.out.println("ratan");
//        }                                    // only try block is not allowed
//
//
//        System.out.println("rest of the app ");

        //5) between try and catch block sop statement is not allowed

//        try {
//            System.out.println("ratan");
//        }  System.out.println("ratan.....");
//         catch (NumberFormatException k)   // this line will ignore by jvm if try block is correct.
//        { System.out.println(10 / 2);
//        }
//        System.out.println("rest of the app ");


        //6) Exception raised other than try is abnormal termination

//        try {
//            System.out.println(10/0);       //Arithmetic Exception
//        }
//        catch (ArithmeticException e) {
//            System.out.println(10 / 0);   //this exception is not valid
//        }
//        System.out.println("rest of the app ");

      //7) once exception is raised after remaining code in try block will not printed


        try {
            System.out.println(10/0);
            System.out.println("ratan");
        } catch (NumberFormatException a) {  // this line will ignore by jvm if try block is correct.
            System.out.println(10 / 2);
        }
        System.out.println("rest of the app ");

    }


}
