public class Driver 
{
	public static void main(String[] args)
	{
		String s = "super";
		Driver.displayString(s);
		Driver.displayWithSpaces(s);
	}

	static void displayString(String s)
	{
		for(int i = 0; i < s.length(); i= i + 1)
		{
			System.out.println(s.charAt(i));
		}
	}
	static void displayWithSpaces(String s)
	{
		String answer = "";
		for(int i = s.length()-1; i >=0; i= i - 1)
		{
			answer = answer + s.charAt(i) + " ";
		}
		System.out.println(answer);
	}
}
