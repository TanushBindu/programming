package String_program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Count_the_specific_word_after_writing_into_file
{
	public static void main(String[] args) throws IOException 
	{
		int the = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		File f = new File("D://Tanush_file.txt");
		FileWriter fr = new FileWriter(f);
		BufferedWriter fbr = new BufferedWriter(fr);
		fbr.write(str);
		System.out.println("-------wrote--------");
		FileReader fr1 = new FileReader(f);
		BufferedReader fbr1 = new BufferedReader(fr1);
		char [] ch = new char[(int)f.length()];
		fbr1.read(ch);
		String s1 = new String(ch);
		String [] arr = s1.split(" ");
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i].equals("the"))
			{
				the++;
			}
		}
	}
}
