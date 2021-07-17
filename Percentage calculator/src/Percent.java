import java.util.Scanner;

public class Percent {

	public static void main(String[] args) {
		float sumOfMarks = 0;
		float result;
		float[] marks = new float[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the outof marks for each subject:\n");
		int outOfMarks = sc.nextInt();
		System.out.println("Enter the no of subjects:\n");
		int noOfSub = sc.nextInt();
		int totalMarks = (outOfMarks) * (noOfSub);
		for (int i = 0; i < noOfSub; i++) {
			System.out.println("Enter the marks for subject " + (i + 1) + " outof " + outOfMarks);
			marks[i] = sc.nextFloat();
			sumOfMarks = sumOfMarks + marks[i];
		}
		result = (sumOfMarks * 100) / totalMarks;
		System.out.println("Your Percentage is: " + result + "%");

	}

}
