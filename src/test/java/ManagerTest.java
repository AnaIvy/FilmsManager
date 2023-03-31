import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.java.mvn.FilmManager;

public class ManagerTest {
    @Test
    public void AddTest() {
        FilmManager manager = new FilmManager();
        manager.add("Вперед");
        manager.add("Джентельмены");
        manager.add("Бладшот");
        String[] expected = {"Вперед", "Джентельмены", "Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastTest() {
        FilmManager manager = new FilmManager();
        manager.add("Вперед");
        manager.add("Джентельмены");
        manager.add("Бладшот");
        manager.add("Начало");
        manager.add("Джентельмены удачи");
        manager.add("Интерстеллар");

        String[] expected = {"Интерстеллар", "Джентельмены удачи", "Начало", "Бладшот", "Джентельмены", "Вперед"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastWhenFilmsBellowLimit() {
        FilmManager manager = new FilmManager(5);
        manager.add("Вперед");
        manager.add("Джентельмены");
        manager.add("Бладшот");
        String[] expected = {"Бладшот", "Джентельмены", "Вперед"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastWhenFilmsLimit() {
        FilmManager manager = new FilmManager(5);
        manager.add("Вперед");
        manager.add("Джентельмены");
        manager.add("Бладшот");
        manager.add("Четыре комнаты");
        manager.add("Война миров Z");
        String[] expected = {"Война миров Z", "Четыре комнаты", "Бладшот", "Джентельмены", "Вперед"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastWhenFilmsUnderLimit() {
        FilmManager manager = new FilmManager(5);
        manager.add("Прибытие");
        manager.add("Красотка");
        manager.add("Вперед");
        manager.add("Джентельмены");
        manager.add("Бладшот");
        manager.add("Четыре комнаты");
        manager.add("Война миров Z");
        String[] expected = {"Война миров Z", "Четыре комнаты", "Бладшот", "Джентельмены", "Вперед"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}




