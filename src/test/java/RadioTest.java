import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    //Количество станций по умолчанию = 10
    //Граничные значения +
    @ParameterizedTest
    @CsvSource({
            "0,-1",
            "0,0",
            "1,1",
            "8,8",
            "9,9",
            "0,10"
    })
    public void threshouldValuesForStationNumberDefault(int expected, int thresholdValue) {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(thresholdValue);

        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Проверка функции переключение на следующую станцию +
    @ParameterizedTest
    @CsvSource({
            "0,9",
            "1,0"
    })
    public void shouldNextStationDefault(int expected, int inputValue) {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(inputValue);

        radio.nextStation();

        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    //Проверка функции переключение на предыдущую станцию +
    @ParameterizedTest
    @CsvSource({
            "9,0",
            "8,9"
    })
    public void shouldPrevStationDefault(int expected, int inputValue) {
        Radio radio = new Radio();
        radio.setNumberCurrentStation(inputValue);

        radio.prevStation();

        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    //Максимальная станция +
    @Test
    public void shouldMaxStationDefault() {
        Radio radio = new Radio();

        int expected = 9;
        int actual = radio.getMaxNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Минимальная станция +
    @Test
    public void shouldMinStationDefault() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.getMinNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Текущая станция +
    @Test
    public void shouldCurrentNumberStationDefault() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Количество станций = 0
    //Граничные значения +
    @ParameterizedTest
    @CsvSource({
            "0,-1",
            "0,0",
            "0,1",
    })
    public void threshouldValuesForStationNumberNull(int expected, int thresholdValue) {
        Radio radio = new Radio(0);
        radio.setNumberCurrentStation(thresholdValue);

        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Проверка функции переключение на следующую станцию +
    @Test
    public void shouldNextStationNull() {
        Radio radio = new Radio(0);
        radio.setNumberCurrentStation(0); //

        radio.nextStation();
        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Проверка функции переключение на предыдущую станцию +
    @Test
    public void shouldPrevStationNull() {
        Radio radio = new Radio(0);
        radio.setNumberCurrentStation(0); //

        radio.prevStation();
        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Максимальная станция +
    @Test
    public void shouldMaxStationNull() {
        Radio radio = new Radio(0);
        int expected = 0;
        int actual = radio.getMaxNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Минимальная станция +
    @Test
    public void shouldMinStationNull() {
        Radio radio = new Radio(0);
        int expected = 0;
        int actual = radio.getMinNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Текущая станция +
    @Test
    public void shouldCurrentNumberStationNull() {
        Radio radio = new Radio(0);
        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Количество станций = 1
    //Граничные значения +
    @ParameterizedTest
    @CsvSource({
            "0,0",
            "0,-1",
            "0,1"
    })
    public void threshouldValuesForStationNumberOne(int expected, int thresholdValue) {
        Radio radio = new Radio(1);
        radio.setNumberCurrentStation(thresholdValue);

        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Проверка функции переключение на следующую станцию +
    @Test
    public void shouldNextStationOne() {
        Radio radio = new Radio(1);
        radio.setNumberCurrentStation(0); //

        radio.nextStation();
        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    //Проверка функции переключение на предыдущую станцию +
    @Test
    public void shouldPrevStationOne() {
        Radio radio = new Radio(1);
        radio.setNumberCurrentStation(0); //

        radio.prevStation();
        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Максимальная станция +
    @Test
    public void shouldMaxStationOne() {
        Radio radio = new Radio(1);

        int expected = 0;
        int actual = radio.getMaxNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Минимальная станция +
    @Test
    public void shouldMinStationOne() {
        Radio radio = new Radio(1);

        int expected = 0;
        int actual = radio.getMinNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Текущая станция +
    @Test
    public void shouldCurrentNumberStationOne() {
        Radio radio = new Radio(1);
        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Количество станций = 2
    //Граничные значения +
    @ParameterizedTest
    @CsvSource({
            "0,-1",
            "0,0",
            "1,1",
            "0,2"
    })
    public void threshouldValuesForStationNumberTwo(int expected, int thresholdValue) {
        Radio radio = new Radio(2);
        radio.setNumberCurrentStation(thresholdValue);

        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Проверка функции переключение на следующую станцию +
    @ParameterizedTest
    @CsvSource({
            "0,1",
            "1,0"
    })
    public void shouldNextStationTwo(int expected, int inputValue) {
        Radio radio = new Radio(2);
        radio.setNumberCurrentStation(inputValue);

        radio.nextStation();

        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    //Проверка функции переключение на предыдущую станцию +
    @ParameterizedTest
    @CsvSource({
            "1,0",
            "0,1"
    })
    public void shouldPrevStationTwo(int expected, int inputValue) {
        Radio radio = new Radio(2);
        radio.setNumberCurrentStation(inputValue);

        radio.prevStation();

        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Максимальная станция +
    @Test
    public void shouldMaxStationTwo() {
        Radio radio = new Radio(2);

        int expected = 1;
        int actual = radio.getMaxNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Минимальная станция +
    @Test
    public void shouldMinStationTwo() {
        Radio radio = new Radio(2);

        int expected = 0;
        int actual = radio.getMinNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    //Текущая станция +
    @Test
    public void shouldCurrentNumberStationTwo() {
        Radio radio = new Radio(2);
        int expected = 0;
        int actual = radio.getNumberCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    //Граничные значения для громкости +
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

    //Проверка функции увеличения громкости +
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

    //Проверка функции уменьшения громкости +
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
