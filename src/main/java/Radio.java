public class Radio {

    //Станция
    private int numberCurrentStation;

    //Громкость
    private int currentVolume;

    //Получить значение номер станции
    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    //Получить значение громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    //Устанавливает пределы количества станций
    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation < 0) {
            return;
        }
        if (newNumberCurrentStation > 9) {
            return;
        }
        numberCurrentStation = newNumberCurrentStation;
    }

    //Устанавливает пределы громкости
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    //Функцию переключения на следующую станцию
    public void nextStation() {
        if (numberCurrentStation < 9) {
            numberCurrentStation = numberCurrentStation + 1;
        } else {
            numberCurrentStation = 0;
        }
    }

    //Функция переключения на предыдущую станцию
    public void prevStation() {
        if (numberCurrentStation > 0) {
            numberCurrentStation = numberCurrentStation - 1;
        } else {
            numberCurrentStation = 9;
        }
    }

    //Функция увеличение громкости
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    //Функция уменьшение громкости
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}