package String_program;

public class Alternamet_String_reversing_1 
{
	public static void main(String[] args) 
	{
		String str = "";
		String s1 = "the java is programming";
		String [] arr  = s1.split(" ");
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) 
		{
			String s2 = arr[i];
			if (i%2==0)
			{
				for (int j = s2.length()-1; j >=0 ; j--) 
				{
					str = str + s2.charAt(j);
				}
			}
			else
			{
				str = str + " "+arr[i]+" ";
			}
		}
		System.out.println(str);
	}
}