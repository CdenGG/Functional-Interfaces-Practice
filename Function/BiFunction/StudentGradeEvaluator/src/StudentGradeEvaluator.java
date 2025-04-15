import java.util.Scanner;
import java.util.function.BiFunction;

public class StudentGradeEvaluator {

    public static void main(String[] args) {


        BiFunction<String, Integer, String> evaluateGrade = (String name, Integer score) -> {

            if (score > 100) {
                return "Error: Grade is above 100";
            }

            if (score < 0) {
                return "Error: Grade is below 0";
            }

            String letterGrade = "";

            if (score >= 90) {
                letterGrade = "A";
            } else if (score >= 80) {
                letterGrade = "B";
            } else if (score >= 70) {
                letterGrade = "C";
            } else {
                letterGrade = "F";
            }
            return String.format(name + ": Grade = " + score + "," + " Letter = " + letterGrade);
        };

        Scanner input = new Scanner(System.in);

        String name = "Cayden";
        int grade = 100;
        String results = "";


        StudentGradeEvaluator studentGradeEvaluator = new StudentGradeEvaluator();

        while(true) {
            System.out.println("QUIT to Exit");
            System.out.println("Name?");
            name = input.next();

            if(name.equals("QUIT")) {
                break;
            }

            System.out.println("Grade?");
            grade = input.nextInt();


            results = studentGradeEvaluator.evaluate(name, grade);
            System.out.println(results);
        }



    }


    public String evaluate(String name, int score) {
        if (score > 100) {
            return "Error: Grade is above 100";
        }

        if (score < 0) {
            return "Error: Grade is below 0";
        }

        String letterGrade = "";

        if (score >= 90) {
            letterGrade = "A";
        } else if (score >= 80) {
            letterGrade = "B";
        } else if (score >= 70) {
            letterGrade = "C";
        } else {
            letterGrade = "F";
        }
        return String.format(name + ": Grade = " + score + "," + " Letter = " + letterGrade);

    }
}