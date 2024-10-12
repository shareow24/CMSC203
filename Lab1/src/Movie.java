
public class Movie {

    private String title;
    private String rating;
    private int soldTickets;

    /**
     * Default constructor, initializes the movie with default values.
     */
    public Movie() {
        title = "Untitled";
        rating = "Not Rated";
        soldTickets = 0;
    }

    /**
     * Constructor that makes a copy of an existing Movie object.
     * @param original The original Movie object to copy from.
     */
    public Movie(Movie original) {
        this.title = original.title;
        this.rating = original.rating;
        this.soldTickets = original.soldTickets;
    }

    /**
     * Constructor that allows setting all properties during object creation.
     * @param title The title of the film.
     * @param rating The content rating of the film.
     * @param soldTickets The number of tickets sold.
     */
    public Movie(String title, String rating, int soldTickets) {
        this.title = title;
        this.rating = rating;
        this.soldTickets = soldTickets;
    }

    /**
     * Retrieves the title of the film.
     * @return The title as a string.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Changes the title of the film.
     * @param title The new title to set.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the content rating of the film.
     * @return The rating as a string.
     */
    public String getRating() {
        return rating;
    }

    /**
     * Updates the rating of the film.
     * @param rating The new rating value.
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * Gets the total number of tickets that have been sold.
     * @return The number of tickets sold as an integer.
     */
    public int getSoldTickets() {
        return soldTickets;
    }

    /**
     * Updates the number of tickets sold.
     * @param soldTickets The number to set for tickets sold.
     */
    public void setSoldTickets(int soldTickets) {
        this.soldTickets = soldTickets;
    }

    /**
     * Generates a text summary of the movie details.
     * @return A formatted string containing the movie's details.
     */
    @Override
    public String toString() {
        return "Film: " + title + " | Rating: " + rating + " | Tickets: " + soldTickets;
    }
}
