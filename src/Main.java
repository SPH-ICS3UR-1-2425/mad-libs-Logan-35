import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Logan Savard
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to my Mad Libs!");
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("Give me a Number From 0-99"); 
		int num1 = in.nextInt();
		System.out.println("Give me an Animal");
		in.nextLine();
		String Animal = in.nextLine();
		System.out.println("Give me a Disease");
		String disease = in.nextLine();
		System.out.println("Give me a City");
		String Place = in.nextLine();
		System.out.println("Give me a Celebrity");
		String Celeb = in.nextLine();
		System.out.println("Give me a Noun");
		String Noun = in.nextLine();
		System.out.println("Give me a adjective");
		String adj = in.nextLine();
		System.out.println("Give me a liquid");
		String Liquid = in.nextLine(); 
		System.out.println("Give me a Day of the Week");
		String Day = in.nextLine();
		System.out.println("Give me a number");
		int num2 = in.nextInt();
		System.out.println("My name is " + name + " and I am Number " + num1 + " on the " + Place + " " + Animal + "s, my team is the best basketball team in " + Place + ". At our last game on " + Day + ", " + Celeb +" ran onto the court covered in " + Liquid + " holding "); 
		System.out.println(" a " + adj + " " + Noun + " which eventully led to " + num2 + " people getting " + disease + ". The End.");
		

	}
  }
