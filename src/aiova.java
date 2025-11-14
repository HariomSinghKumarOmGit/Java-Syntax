import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


public class aiova {
    public static void main(String[] args) {

        // non - primitive type
        // concatenate
/*
        String name1 ="Ajay";
        String name2 ="Aarav";
        String name3 = name1 + " and " + name2;
        System.out.println(name1.charAt(3));
        String name5 = name1.replace('A', 'V');
        System.out.println(name5);
        System.out.println(name3.substring(5, 11)); */


        // Arrays
        /*
        int age= 30;
        int[] marks = new int[3];
            marks[0]=110;
            marks[1]=12;
            marks[2]=30;

        System.out.println(marks.length);

        // short array
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
*/
//        1d array
/*
        int[] marks = {98, 27, 30};

        // 2d array
        int [][] finalmarks = {{89, 98, 69}, {97, 73, 25}};
        System.out.println(finalmarks[0][2]);

 */
        // casting
        // capacity of holding values like double has more capacity compare to int
/*
        // constant
        int age = 30;
        age = 31;
        age = 32;

        final float Pi = 3.14f;

//        PI = 1.23f;

 */
        /*

        // operators
        int a= 1;
        int b= 2;
        int diff = a-b;
        System.out.println(diff);
        // modulo --> used to find the reminder in div

         */
/*
        // for input
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your Name: ");
        String name = sc.next();
        System.out.println(name);

 */

        //comparison Operator
        // a ==b
        // a! = b not equal
        // a>b
        // a>=b
        // Conditional statement  if else
        /*
        boolean isSunUp = false;
        if(isSunUp == true){
            System.out.println("day");
        }else{
            System.out.println("night");
        }

         */
        /*

        // if else

        Scanner sc = new Scanner(System.in);
        System.out.println("Write you'r age : ");
        int age = sc.nextInt();

        if(age == 18) {
            System.out.println("Congo For u'r First vote");
        }else if(age > 18) {
            System.out.println("Cant vote");
        } else{
            System.out.println("You can't vote dear");
        }


         */
        /*
        //logical operator
        // conditional
        int a= 60;
        int b = 70;
        if(a>50 && b>50) {
            System.out.println("whats up");
        }else {
            System.out.println("ReTry");
        }
// logical or
        if (a> 50 || b>50) {
            System.out.println("You Got it");
        } else {
            System.out.println("Run Away");
        }

        // not operator
        boolean isAdult = true;
        if(isAdult ==  true) {
            System.out.println("is Adult");
        } else {
            System.out.println("Not Adult");
        }


         */
        // conditional statement
        // pen = 10 , notebook = 40
        /*

        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();
        if(cash < 10) {
            System.out.println("cannot by anything");
        }else if(cash > 10 && cash < 40){
            System.out.println("You can only buy pen");
        }else if (cash >= 40 && cash < 50) {
            System.out.println("Either 4pen or Notebook");
        }else if(cash >= 50) {
            System.out.println("So much money, get both");
        }

        // switch
        int day = 1;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Wed - Sun");
        }

         */
        /*
        // loops

        for(int i=100; i>= 1; i--){
            System.out.println(i);
        }

         */
/*
        //while loop
        int j = 100;
        while(j >= 1){
            System.out.println(j);
            j = j-1;
        }

 */
        /*
        // Do while
        int k = 100;
        do{
            System.out.println(k);
            k = k-1;
        }while(k>0);


         */
        /*
        int num = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("input a no : ");
            num = sc.nextInt();
            System.out.println("Here is your no :" + num );

        }while(num > 50);

        System.out.println("The END");

         */
        /*
        // Break && Continue
        int i=0;
        while (true){
            if(i==3){
                i=i+1;
                continue;
            }
            System.out.println(i);
            i++;
            if(i>5){
                break;
            }
        }

         */
        /*
        // Exception Handling try -catch
        int[] marks = {97, 98, 34};
        try{

        System.out.println(marks[5]);
        } catch (Exception exception) {
            // do something after catching
        }
        System.out.println("Aarav" );

         */





















    }
}
