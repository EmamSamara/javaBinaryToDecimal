import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner input=new Scanner(System.in); 
        int dec=0;
        int i=0;
       
         System.out.println("Enter the binary number you want to convert :"); 
         int num=input.nextInt();
         while(num!=0) { 
         int reminder=num%10;
         dec= dec + (int) (reminder*Math.pow(2,i)); 
         i++; 
         num=num/10;
         }
         System.out.println("the decimal value is : "+dec);
        input.close();
        }
    } 
        
        