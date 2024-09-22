package sept.ex_20092024;

public class Task2_score_ternary {
    public static void main(String[] args) {
          // Input → int score = 85
          // String grade →
         //  score >= 90 → A
         //  score >= 80 → B
        //  score >= 70 → C
        int score = 65;
        String grade = (score >= 90) ? "A":(score >= 80) ? "B":(score >= 70) ? "c":"D";
        System.out.println(grade);
    }
}
