import java.util.Scanner;
public class Input{
	public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                int a,b,sum=0;
                System.out.println("Enter the value of a: ");
                a=sc.nextInt(); 
                System.out.println("Enter the value of b: ");
                b=sc.nextInt(); 
                sum=a+b;
                System.out.println("Addition:"+sum); 
	}
}