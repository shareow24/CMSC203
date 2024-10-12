
import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        // Set up a scanner to capture user input
        Scanner inputDevice = new Scanner(System.in);

        // Control variable for looping
        boolean keepGoing = true;

        // Loop that allows the user to enter information for multiple movies
        while (keepGoing) {
            // Create a new instance of the Movie class
            Movie userMovie = new Movie();

            // Collect the movie's title from the user
            System.out.print("What's the title of the movie? ");
            userMovie.setTitle(inputDevice.nextLine());

            // Collect the movie's rating from the user
            System.out.print("Provide the rating of the movie (e.g., PG, G, R): ");
            userMovie.setRating(inputDevice.nextLine());

            // Ask how many tickets were sold for this movie
            System.out.print("How many tickets were sold? ");
            userMovie.setSoldTickets(inputDevice.nextInt());
            inputDevice.nextLine(); // Clear the newline character left by nextInt()

            // Display the movie's data using the toString() method
            System.out.println("\nMovie Details Entered:");
            System.out.println(userMovie);

            // Ask the user if they wish to input another movie
            System.out.print("Would you like to enter another movie? Type 'yes' to continue or 'no' to stop: ");
            String userChoice = inputDevice.nextLine().trim().toLowerCase();

            // Update loop condition based on user's decision
            keepGoing = userChoice.equals("yes");
        }

        // Close the input stream when done
        inputDevice.close();
        System.out.println("Movie entry completed.Have a good day.");
    }
}
