public class Radio {

    //Инициализаторы
    //Станция
    private int numberOfStation;
    private int maxNumberCurrentStation;
    private int minNumberCurrentStation = 0;
    private int numberCurrentStation = minNumberCurrentStation;

    //Громкость
    private int maxCurrentVolume = 100;
    private int minCurrentVolume = 0;
    private int currentVolume = minCurrentVolume;

    //Конструкторы
    //Установка кол-ва станции
    public Radio(int numberOfStation) {
        this.numberOfStation = numberOfStation;
        setMaxNumberCurrentStation(numberOfStation);

    }

    //Количество станций по умолчанию 10
    public Radio() {
        this(10);
    }

    //Методы
    //Возращает значение номера текущей станции станции
    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    //Возвращает номер максимальной станции
    public int getMaxNumberCurrentStation() {
        return maxNumberCurrentStation;
    }

    //Возвращает номер минимальной станции
    public int getMinNumberCurrentStation() {
        return minNumberCurrentStation;
    }

    //Получить значение громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    //Устанавливает максимальное значение станции для количества станций больше 0
    public void setMaxNumberCurrentStation(int NumberOfStation) {
        if (NumberOfStation > 0) {
            this.maxNumberCurrentStation = NumberOfStation - 1;
        } else {
            this.maxNumberCurrentStation = 0;
        }
    }

    //Устанавливает пределы количества станций
    public void setNumberCurrentStation(int newNumberCurrentStation) {
        if (newNumberCurrentStation < minNumberCurrentStation) {
            return;
        }
        if (newNumberCurrentStation > maxNumberCurrentStation) {
            return;
        }
        numberCurrentStation = newNumberCurrentStation;
    }

    //Устанавливает пределы громкости
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minCurrentVolume) {
            return;
        }
        if (newCurrentVolume > maxCurrentVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    //Функцию переключения на следующую станцию
    public void nextStation() {
        if (numberCurrentStation < maxNumberCurrentStation) {
            numberCurrentStation = numberCurrentStation + 1;
        } else {
            numberCurrentStation = minNumberCurrentStation;
        }
    }

    //Функция переключения на предыдущую станцию
    public void prevStation() {
        if (numberCurrentStation > minNumberCurrentStation) {
            numberCurrentStation = numberCurrentStation - 1;
        } else {
            numberCurrentStation = maxNumberCurrentStation;
        }
    }

    //Функция увеличение громкости
    public void increaseVolume() {
        if (currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    //Функция уменьшение громкости
    public void decreaseVolume() {
        if (currentVolume > minCurrentVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}