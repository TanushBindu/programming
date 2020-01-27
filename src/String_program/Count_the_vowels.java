package String_program;

import java.util.Scanner;

public class Count_the_vowels 
{
	public static void main(String[] args) 
	{
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
				if (arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
				{
					count++;
					flag = true;
				}
			}
		}
		String s1 = (flag==true)?"it is present":"it is not present";
		System.out.println(s1);
	}
}
