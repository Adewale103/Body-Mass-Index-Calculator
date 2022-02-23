//To calculate BMI in pounds or kilogram
import java.util.Scanner;
public class BMICalculator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your weight in kilogram ");
	double weight = input.nextDouble();	

	System.out.print("Enter your height in metres ");
	double height = input.nextDouble();

	double bmi = weight/(height*height);

	if (bmi < 18.5) {System.out.printf("Your BMI is %f and you are underweight",bmi);}
	if ((bmi >= 18.5) && (bmi < 24.9)) {System.out.printf("Your BMI is %f and your weight is normal",bmi);}
	if ((bmi >= 25.0) && (bmi < 29.9)) {System.out.printf("Your BMI is %f and your status is pre-obesity",bmi);}
	if ((bmi >= 30.0) && (bmi < 34.9)) {System.out.printf("Your BMI is %f and your status is obesity class 1",bmi);}
	if ((bmi >= 35.0) && (bmi < 39.9)) {System.out.printf("Your BMI is %f and your status is obesity class 2",bmi);}
	if (bmi > 40) {System.out.printf("Your BMI is %f and your status is obesity class 3",bmi);}
}
}


	
 