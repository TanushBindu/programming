package String_program;

public class Remove_dulpicate_charater 
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		char [] ch = s1.toCharArray();
		int n = ch.length;
		for (int i = 0; i < n; i++) 
		{
			for (int j = i+1; j < n; j++) 
			{
				if (ch[i]==ch[j])
				{
					ch[j]=0;
				}
			}
		}
		for (int i = 0; i < n; i++) 
		{
			System.out.print(ch[i]);
		}
	}
}
