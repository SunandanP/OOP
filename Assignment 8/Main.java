import java.util.Scanner;
public class Main {
	public static void main(String [] args) {
		Container container = new Container();
		runApp(container);
		
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void runApp(Container c) {
		int input = -1;
		int ch;
		String s;
		while(input != 0) {
			System.out.println("1. Add");
			System.out.println("2. Remove");
			System.out.println("3. Display");
			System.out.println("4. Check");
			input = sc.nextInt();
			switch(input) {
			case 0:
				break;
			case 1:
				System.out.println("Add a String?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				ch = sc.nextInt();
				if(ch == 1) {
					c.add(true);
				}else {
					c.add(false);
				}
				break;
			case 2:
				System.out.println("Is it a String?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				ch = sc.nextInt();
				if(ch == 1) {
					System.out.println("Enter the String : ");
					s = sc.next();
					c.remove(s);
				}else {
					System.out.println("Enter the Number : ");
					ch = sc.nextInt();
					c.remove(ch);
				}
				break;
			case 3:
				c.display();
				break;
			case 4:
				c.classifyEvenOdd();
				c.classifyPrime();
				c.checkPallindrome();
				break;
			}
		}
	}
	
}
