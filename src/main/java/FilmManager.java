public class FilmManager {

    private String[] films = new String[0];
    private int filmLimit;

    public FilmManager() {
        filmLimit = 10;
    }

    public FilmManager(int filmLimit) {

        this.filmLimit = filmLimit;

    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];

        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {

        return films;
    }

    public String[] findLast() {
        String[] all = findAll();
        int count;
        if (all.length >= filmLimit) {
            count = filmLimit;
        } else {
            count = all.length;
        }
        String[] reversed = new String[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

}


