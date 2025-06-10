import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    //Граничные значения для ввода номера станции
    @ParameterizedTest
    @CsvSource({
            "0,-1",
            "0,0",
            "1,1",
            "8,8",
            "9,9",
            "0,10"
    })
    public void threshouldValuesForStationNumber(int expected, int thresholdValue) {
        Radio radio = new Radio();

        radio.setNumberCurrentStation(thresholdValue);

        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Проверка функции переключение на следующую станцию
    @ParameterizedTest
    @CsvSource({
            "0,9",
            "1,0"
    })
    public void shouldNextStation(int expected, int inputValue) {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(inputValue);

        radio.nextStation();

        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    //Проверка функции переключение на предыдущую станцию
    @ParameterizedTest
    @CsvSource({
            "9,0",
            "8,9"
    })
    public void shouldPrevStation(int expected, int inputValue) {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(inputValue);

        radio.prevStation();

        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    //Граничные значения для громкости
    @ParameterizedTest
    @CsvSource({
            "0,-1",
            "0,0",
            "1,1",
            "99,99",
            "100,100",
            "0,101"
    })
    public void threshouldValuesForVolume(int expected, int thresholdValue) {
        Radio radio = new Radio();

        radio.setCurrentVolume(thresholdValue);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //Проверка функции увеличения громкости
    @ParameterizedTest
    @CsvSource({
            "100,100",
            "1,0"
    })
    public void shouldIncreaseVolume(int expected, int inputValue) {
        Radio radio = new Radio();
        radio.setCurrentVolume(inputValue);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    //Проверка функции уменьшения громкости
    @ParameterizedTest
    @CsvSource({
            "0,0",
            "99,100"
    })
    public void shouldDecreaseVolume(int expected, int inputValue) {
        Radio radio = new Radio();
        radio.setCurrentVolume(inputValue);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }


}
