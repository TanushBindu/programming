package String_program;

public class Palindrum_without_if_condition 
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "";
		for (int i = s1.length()-1; i >=0 ; i--) 
		{
			s2 = s2 + s1.charAt(i);
		}
		String s3 = (s1.equals(s2)) ? "it is palindrum" : "it is not palindrum";
		System.out.println(s3);
	}
}
