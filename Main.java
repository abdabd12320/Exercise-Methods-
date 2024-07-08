import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter input(1): ");
		int input1 = in.nextInt();
		System.out.print("Enter input(2): ");
		int input2 = in.nextInt();
		System.out.print("Enter input(3): ");
		int input3 = in.nextInt();
		System.out.println("The smallest is: " + smallest(input1,input2,input3));
		
		System.out.println("--------------------------");
		
		System.out.print("Enter number: ");
		int number = in.nextInt();
		
		System.out.println("The number is: " + check(number));
		
		System.out.println("--------------------------");
		
		System.out.println("1. A password must have at least eight characters.");
		System.out.println("2. A password consists of only letters and digits.");
		System.out.println("3. A password must contain at least two digits.");
		System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
		in.nextLine();
		String pass = in.nextLine();
		
		 if (password(pass)) {
            System.out.println("Password is valid: " + pass);
        } else {
            System.out.println("Password is Not valid: " + pass);
        }
	}
	public static boolean password(String pass)
	{
	    int count1 = 0;
	    int count2 = 0;
	    char c;
	    if (pass.length() < 8)
	    {
	    return false;
	    }
	    
	    for(int i=0;i < pass.length();i++)
	    {
	        c = pass.charAt(i);
	        if(c >= '0' && c <= '9')
	        {
	            count1++;
	        }
	        else if(c >= 'a' && c <= 'z')
	        {
	            count2++;
	        }
	        else return false;
	    }
	    return (count1 >= 2 && count2 >= 2);
	}
	public static String check(int number)
	{
	    if(number > 0)
	    {
	        return "positive";
	    }
	    else if(number < 0)
	    {
	        return "negative";
	    }
	    else return "zero";
	}
	public static int smallest(int input1,int input2,int input3)
	{
	    if(input1 < input2 && input1 < input3)
	    {
	        return input1;
	    }
	    else if(input2 < input3)
	    {
	        return input2;
	    }
	    else return input3;
	}
}