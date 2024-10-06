package Homework2;

public class CinemaApp {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        cinema.addFilm(new Film(1994, 2, "Triller", 9.3));
        cinema.addFilm(new Film(1972, 4, "Krimi", 9.2));
        cinema.addFilm(new Film(2004, 6, "Horror", 8.1));
        cinema.addFilm(new Film(1986, 9, "Triller", 6.6));
        cinema.addFilm(new Film(1958, 7, "Horror", 6.9));
        cinema.addFilm(new Film(2015, 10, "Comedy", 7.8));
        cinema.addFilm(new Film(1965, 5, "Horror", 8.7));
        cinema.addFilm(new Film(1971, 9, "Triller", 5.4));
        cinema.addFilm(new Film(1986, 2, "Comedy", 9.9));
        cinema.addFilm(new Film(1954, 9, "Triller", 9.5));

        cinema.addFilm(new Film(2022, 1, "Horror", 4.7));
        cinema.addFilm(new Film(2000, 4, "Comedy", 6.7));
        cinema.addFilm(new Film(2013, 7, "Triller", 5.5));
        cinema.addFilm(new Film(1994, 3, "Triller", 8.4));
        cinema.addFilm(new Film(2011, 8, "Horror", 5.6));
        cinema.addFilm(new Film(1977, 11, "Triller", 7.4));
        cinema.addFilm(new Film(2010, 10, "Comedy", 9.3));
        cinema.addFilm(new Film(1986, 2, "Triller", 10));
        cinema.addFilm(new Film(1994, 6, "Comedy", 9.2));
        cinema.addFilm(new Film(1973, 9, "Horror", 5.6));

        System.out.println(cinema.getFilms(1986));
        System.out.println();
        System.out.println(cinema.getFilms(1986, 2));
        System.out.println();
        System.out.println(cinema.getFilms("Triller"));
        System.out.println();
        System.out.println(cinema.getTop10Films());
    }
}
