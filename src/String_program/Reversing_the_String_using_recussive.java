package String_program;

public class Reversing_the_String_using_recussive 
{
	static String add(String s1)
	{
		String s2 = "";
		if (s1.length()-1>=0)
		{
			s2 = s2+s1.charAt(s1.length()-1);
			add(s1.substring(s1.length()-1));
		}
		return s2;
	}
	public static void main(String[] args) 
	{
		String str = add("java");
		System.out.println(str);
	}
}
