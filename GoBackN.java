import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    System.out.println("Frame "+ i +" has been transmitted.");
			System.out.println("Hello World");
		}
		System.out.println("Please enter the last Acknowledgement received.");
		int k=sc.nextInt();
		for(int i=k;i<n;i++){
		    System.out.println("Frame "+ i +" has been transmitted.");
		}
	}
}
