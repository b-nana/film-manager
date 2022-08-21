import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {


    @Test
    public void shouldAdd() {
        FilmManager manager = new FilmManager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");

        String[] expected = {"film1", "film2", "film3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast10InReverse() {
        FilmManager manager = new FilmManager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");
        manager.add("film11");

        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2"};
        String[] actual = manager.findLast10();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test

    public void shouldFindLastNInReverse() {
        FilmManager manager = new FilmManager();
        int count = 5;
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");
        manager.add("film11");

        String[] expected = {"film11", "film10", "film9", "film8", "film7"};
        String[] actual = manager.findLastN(count);

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test

    public void findLast10IfLessThan10() {

        FilmManager manager = new FilmManager();
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");

        String[] expected = {"film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast10();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void findLastNIfLessThanN() {

        FilmManager manager = new FilmManager();
        int count = 5;
        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");

        String[] expected = {"film4", "film3", "film2", "film1"};
        String[] actual = manager.findLastN(count);

        Assertions.assertArrayEquals(expected, actual);

    }
}

