package Week1.Day2;

public class StudentGrading {
    public static void main(String[] args) {

        int[] grades = {8, 9, 5, 4, 8 };

        int totalSum = 0;
        for (int grade : grades) {
           totalSum += grade;
        }

        double averageGrade = (double) totalSum / grades.length;

        System.out.println("Average grade" + averageGrade);

    }
}
