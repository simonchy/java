package homework;
import java.util.Scanner;    // Needed for the Scanner class

/**
 *    This program determine grade for a test score.
 */
public class Greading
{
    public static void main(String[] args)
    {
       int Score;
       char grade;
       Scanner s = new Scanner(System.in);
        System.out.print("Enter your score");
        Score= s.nextInt();


        if (Score>=90){
            grade = 'A';
        }

  else if(Score>=85){
      grade ='B';
        }
  else if(Score>80){
      grade = 'C';
        }
  else if(Score>= 75){
      grade ='D';
        }
        else

        {
      grade ='F';

    }
        System.out.println("your grade is  " + grade);
    }

}






