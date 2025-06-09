public class Radio {

    //Станция
    public int numberCurrentStation;

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

    //Переключает на следующую станцию
    public void NextStation() {
        if (numberCurrentStation < 9) {
            numberCurrentStation = numberCurrentStation + 1;
        } else numberCurrentStation = 0;
    }

    //Переключает на предыдущую станцию
    public void PrevStation() {
        if (numberCurrentStation > 0) {
            numberCurrentStation = numberCurrentStation - 1;
        } else numberCurrentStation = 9;
    }


    //Громкость
    public int currentVolume;

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

    //Увеличение громкости
    public void IncreaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    //Уменьшение громкости
    public void DecreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}