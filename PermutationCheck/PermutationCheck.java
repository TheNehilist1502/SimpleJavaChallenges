
import java.util.Arrays;
import java.util.Scanner;

public class PermutationCheck{
	


	public static void main(String[] args){

		PermutationCheck permutationCheckInstance = new PermutationCheck();

		Scanner scanner = new Scanner(System.in);

		String string1= scanner.nextLine();
		String string2= scanner.nextLine();

		boolean solution1Result= permutationCheckInstance.permutationCheck(string1,string2);

		boolean solution2Result= permutationCheckInstance.permutationCheckInAscii(string1,string2);

		System.out.println("The result is: " + solution1Result);

		System.out.println("The ascii result: " + solution2Result);

	}


	// 1st Answer (Avg Answer)
	// Sorting the string after tackling them as an array of chars and then comparing

	public boolean permutationCheck(String string1, String string2){

		char[] char1 = string1.toCharArray();
        char[] char2 = string2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
	}

	//2nd Answer (More efficient)
	// get the summition of ASCII value of both strings and comparing the summition
	public boolean permutationCheckInAscii(String string1, String string2){

		        return string1.chars()
                .sum() == string2.chars().sum();
	} 
}