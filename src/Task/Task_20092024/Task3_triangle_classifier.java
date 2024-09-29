package Task.Task_20092024;

public class Task3_triangle_classifier {
    public static void main(String[] args) {
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine
        // if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side3 ->
        int s1 = 21;
        int s2 = 25;
        int s3 = 25;
        if((s1 == s2) && (s1 ==s3))
        {
            System.out.println("the triangle is equilateral (all sides are equal");
        }
        else if ((s1 == s2) || (s1 == s3) || (s3 == s2))
         {
            System.out.println("isosceles (exactly two sides are equal");
        }
        else
        {
            System.out.println("scalene (no sides are equal)");
        }

    }
}
