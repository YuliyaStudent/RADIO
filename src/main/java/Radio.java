public class Radio {
    private int currentNumber;
    private int currentVolume;
    private int maxNumber;


    public Radio() {
        maxNumber = 9;
    }

    public Radio(int numbersCount) {
        maxNumber = numbersCount - 1;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < 0) {
            return;
        }
        if (currentNumber > maxNumber) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentNumber < maxNumber) {
            currentNumber++;
            return;
        }
        currentNumber = 0;
    }

    public void prev() {
        if (currentNumber > 0) {
            currentNumber--;
            return;
        }
        currentNumber = maxNumber;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume --;
            return;
        }
        currentVolume = 0;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
            return;
        }
        currentVolume = 100;
    }

}
