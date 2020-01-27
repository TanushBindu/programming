package String_program;

import java.util.Scanner;

public class Count_each_vowels_count 
{
	public static void main(String[] args) 
	{
		int a =0  ,e = 0,o = 0;
		int count = 0;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		String str = sc.nextLine();
		char [] arr = str.toCharArray();
		int n = arr.length;
		for (int i = 0; i < n; i++) 
		{
			for (int j = i+1; j < n; j++) 
			{
				if (arr[i]=='a')
				{
					a++;
				}
				else if(arr[i]=='e')
				{
					e++;
				}
				else if(arr[i]=='o')
				{
					o++;
				}
			}
		}
		
	}
}
