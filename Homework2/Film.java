package Homework2;

public class Film {
    private static int ID;
    private final int filmID;
    private final int year;
    private final int month;
    private final String genre;
    private final double rating;

    public Film(int year, int month, String genre, double rating) {
        filmID = ID++;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Film{" +
               "filmID=" + filmID +
               ", year=" + year +
               ", month=" + month +
               ", genre='" + genre + '\'' +
               ", rating=" + rating +
               "}\n";
    }

    public int getFilmID() {
        return filmID;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }
}
