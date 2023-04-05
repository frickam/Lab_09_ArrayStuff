import java.util.Random;
import java.util.Scanner;
public class LabArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        double average = 0.0;
        int sum = 0;
        int a = 0;
        int counter = 0;

        int number = SafeInput.getRangedInt(in,"Pick a whole number between 1 and 100",1,100);
        int number1 = 0;

        for (int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = rnd.nextInt(100) + 1;
            System.out.printf("%-3d\t|", dataPoints[x]);
            sum = sum + dataPoints[x];
            if (dataPoints[x] == number)
            {
                number1 ++;
            }
        }
        average = (double)sum / dataPoints.length;
        System.out.println();
        System.out.println("The average of the random array dataPoints is: " + average);
        System.out.println("Your magic number, " + number + ", showed up : " + number1 + " times.");
        System.out.println();
        do
        {
            dataPoints[a] = rnd.nextInt(100) + 1;
            System.out.printf("%-3d\t|", dataPoints[a]);
            counter ++;
        }
        while (dataPoints[a] != number);
        System.out.println();
        System.out.println("Your magic number, " + number + ", was found at array position number " + counter);
    }
}
