package Homework2;

import java.util.*;

public class Cinema {
    private Map<Integer, Set<Film>> films;

    public Cinema() {
        films = new TreeMap<>();
    }

    public void addFilm(Film film) {
        if (!films.containsKey(film.getYear())) {
            Set<Film> filmsSet = new LinkedHashSet<>();
            filmsSet.add(film);
            films.put(film.getYear(), filmsSet);
            return;
        }
        films.get(film.getYear()).add(film);
    }

    public Set<Film> getFilms(int year) {
        return films.get(year);
    }

    public Set<Film> getFilms(int year, int month) {
        Set<Film> result = new HashSet<>();
        for (Film film : getFilms(year)) {
            if (film.getMonth() == month) {
                result.add(film);
            }
        }
        return result;
    }

    public Set<Film> getFilms(String genre) {
        Set<Film> result = new HashSet<>();
        for (Map.Entry<Integer, Set<Film>> integerSetEntry : films.entrySet()) {
            for (Film film : integerSetEntry.getValue()) {
                if (film.getGenre().equals(genre)) {
                    result.add(film);
                }
            }
        }
        return result;
    }

    public LinkedHashSet<Film> getTop10Films() {
        Set<Film> allRatings = new TreeSet<>(new FilmComparator());
        for (Map.Entry<Integer, Set<Film>> integerSetEntry : films.entrySet()) {
            allRatings.addAll(integerSetEntry.getValue());
        }
        LinkedHashSet<Film> result = new LinkedHashSet<>();
        int counter = 1;
        for (Film film : allRatings) {
            result.add(film);
            counter++;
            if (counter == 10) {
                break;
            }
        }
        return result;
    }

    private static class FilmComparator implements Comparator<Film> {

        @Override
        public int compare(Film o1, Film o2) {
            return Double.compare(o2.getRating(), o1.getRating());
        }
    }

}
