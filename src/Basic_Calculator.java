import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu-");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("Enter two number=");

        int num1=sc.nextInt();
        int num2=sc.nextInt();
        sc.nextLine();//used for take enter key
        System.out.println("Enter the option in word=");
        String option =sc.nextLine();
        option=option.toUpperCase();
        switch (option){
            case "ADD":
            {       int num3=num1+num2;
                System.out.println("Addition is "+num3);
                break;
            }
            case "SUB":
            {


                    System.out.println("Subtraction is "+(num1-num2));
                    break;
            }
            case "MUL":
            {       int num3=num1*num2;
                System.out.println("Multiplication is"+num3);
                break;
            }
            case "DIV":{
                System.out.println("Division is "+(num1/num2));
                break;}
            default:
            {
                System.out.println("Invalid option");
                break;
            }
        }
    }
}
