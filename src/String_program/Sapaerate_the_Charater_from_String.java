package String_program;

public class Sapaerate_the_Charater_from_String
{
	public static void main(String[] args) 
	{
		String s1 = "tanub.0509@gmail.com";
		char [] ch = s1.toCharArray();
		String alpha = "";
		String num = "";
		String sp = "";
		for (int i = 0; i < ch.length; i++) 
		{
			if (Character.isAlphabetic(ch[i]))
			{
				alpha = alpha+ch[i];
			}
			else if (Character.isDigit(ch[i]))
			{
				num = num + ch[i];
			}
			else
			{
				sp = sp+ch[i];
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(sp);
		
	}
}
