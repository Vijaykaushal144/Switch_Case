import java.util.Scanner;

public class Display_Type_Of_website {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the website=");
        String extension=sc.nextLine();
        String ext=extension.substring(extension.lastIndexOf(".")+1);
        switch (ext){
            case "com":{
                System.out.println("It's commercial site. ");
                break;
            }
            case "org":{
                System.out.println("It's organisation site. ");
                break;
            }
            case "net":{
                System.out.println("It's network site. ");
                break;
            }
            case "gov":{
                System.out.println("It's government site. ");
                break;
            }
            default:
            {
                System.out.println("Pls enter valid extension of a site");
                break;
            }
        }

    }
}
