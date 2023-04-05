import java.util.Random;

public class ArrayNotes
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        String[] users = {"Anthony", "Steve", "Chandler", "Rob", "Mike", "Aaron", "Phil"};
        int[] ages = {42, 38, 27, 32, 21, 22, 47};

        System.out.println(users[0]);
        System.out.println(users[5]);
        System.out.println();

        for (int x = 0; x < users.length; x++)
        {
            System.out.printf("%-8s\t%3d\n", users[x], ages[x]);
        }

        int[] data = new int[100]; // creates an array of 100 ints index 0 - 99

        for (int x = 0; x < data.length; x++)
        {
            data[x] = rnd.nextInt(100) + 1;
            System.out.printf("%-4d\t", data[x]);
        }

        int sum = 0;
        double average = 0.0;

        for (int x = 0; x < data.length; x++)
        {
            sum = sum + data[x]; // sum += data[x]
        }

        average = (double)sum / data.length;

        System.out.println();
        System.out.printf("%-6d\t%5.2f", sum, average);
        System.out.println();

        int ageSum = 0;

        for (int x = 0; x < ages.length; x ++)
        {
            ageSum += ages[x];
        }
        System.out.println("Age total is " + ageSum);

        double ageAverage = 0.0;

        ageAverage = (double)ageSum / ages.length;

        System.out.println();
        System.out.printf("Average age: %5.2f", ageAverage);

        int target = 23;


    }
}
