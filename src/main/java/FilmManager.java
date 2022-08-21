public class FilmManager {
    private String[] films = new String[0];

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

    public String[] findLast10() {
        String[] all = findAll();
        int count;
        if (all.length >= 10) {
            count = 10;
        } else {
            count = all.length;
        }
        String[] reversed = new String[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }

    public String[] findLastN(int count) {
        String[] all = findAll();
        int newLength;
        if (count <= all.length) {
            newLength = count;
        } else {
            newLength = all.length;
        }
        String[] reversed = new String[newLength];
        for (int i = 0; i < newLength; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }
}


