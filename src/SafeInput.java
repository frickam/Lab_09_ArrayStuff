import java.util.Scanner;

public class SafeInput {

    /**
     * Gets an int from the user with no constraints
     * @param pipe Scanner to use for input
     * @param prompt Prompt for the user to know what to input
     * @return a valid int with no constraints
     */
    public static int getInt(Scanner pipe, String prompt) {
        boolean done = false;
        int retValue = 0;
        String trash = "";


        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retValue = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid int not: " + trash);
            }
        }
        while (!done);

        return retValue;
    }

    /**
     * Gets an int from the user within the specified range of low to high
     * @param pipe Scanner to use for input
     * @param prompt Prompt for the user to know what to input
     * @param low the low value for the range
     * @param high the high value for the range
     * @return a valid int with no constraints
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        int retValue = 0;
        String trash = "";


        do
        {
            System.out.print("\n" + prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                retValue = pipe.nextInt();
                pipe.nextLine();
                if (retValue >= low && retValue <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value in the range [" + low + " - " + high + "] not : " + retValue);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid int not: " + trash);
            }
        }
        while (!done);

        return retValue;
    }




    /**
     * Gets double from the user with no constraints
     * @param pipe Scanner to use for input
     * @param prompt Prompt for the user to know what to input
     * @return a valid double with no constraints
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false;
        double retValue = 0.0;
        String trash = "";


        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retValue = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid int not: " + trash);
            }
        }
        while (!done);

        return retValue;
    }



    /**
     * Gets a double from the user within the specified range of low to high
     * @param pipe Scanner to use for input
     * @param prompt Prompt for the user to know what to input
     * @param low the low value for the range
     * @param high the high value for the range
     * @return a valid double with no constraints
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false;
        double retValue = 0;
        String trash = "";


        do
        {
            System.out.print("\n" + prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextDouble())
            {
                retValue = pipe.nextDouble();
                pipe.nextLine();
                if (retValue >= low && retValue <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value in the range [" + low + " - " + high + "] not : " + retValue);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double not: " + trash);
            }
        }
        while (!done);

        return retValue;
    }





}

