import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void setNewNumberTest0() {

        radio.setCurrentNumber(0);
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewNumber1() {
        radio.setCurrentNumber(1);
        int expected = 1;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewNumberMinusOne() {
        radio.setCurrentNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewNumber8() {
        radio.setCurrentNumber(8);
        int expected = 8;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewNumber9() {
        radio.setCurrentNumber(9);
        int expected = 9;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewNumber10() {
        radio.setCurrentNumber(10);
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewNumberMinus5() {
        radio.setCurrentNumber(-5);
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewNumber50() {
        radio.setCurrentNumber(50);
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
// modified old tests of set volume
    @Test
    public void setNewVolumeMinusOne() {

        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewVolumeZero() {

        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewVolume1() {

        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewVolume99() {

        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNewVolume100() {

        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setNewVolumeMinus5() {

        radio.setCurrentVolume(-5);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNewVolumeMore100() {

        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
//stop modify
    @Test
    public void setNewVolume50() {

        radio.setCurrentVolume(50);
        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberTest9() {

        radio.setCurrentNumber(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberTest8() {

        radio.setCurrentNumber(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberTestZero() {

        radio.setCurrentNumber(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberTest1() {

        radio.setCurrentNumber(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberTest5() {

        radio.setCurrentNumber(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberZero() {

        radio.setCurrentNumber(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberOne() {

        radio.setCurrentNumber(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberTwo() {

        radio.setCurrentNumber(2);
        radio.prev();
        int expected = 1;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberNine() {

        radio.setCurrentNumber(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void decreaseZeroTest() {

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseOneTest() {

        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseTwoTest() {

        radio.setCurrentVolume(2);
        radio.decreaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    //модифицированные тесты на уровень звука
    @Test
    public void decreaseNineTest() {

        radio.setCurrentVolume(99);
        radio.decreaseVolume();
        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseTenTest() {

        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseZeroTest() {

        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increase1Test() {

        radio.setCurrentVolume(2);
        radio.increaseVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseNineNineTest() {

        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseMaxTest() {

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //далее новые тесты на количество радиостанций
    @Test
    public void setNumber() {
        Radio radio = new Radio(30);
        radio.setCurrentNumber(18);
        int expected = 18;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void setNumber2() {
        Radio radio = new Radio(100);
        radio.setCurrentNumber(56);
        int expected = 56;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNumber3() {
        Radio radio = new Radio(100);
        radio.setCurrentNumber(101);
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNumber4() {
        Radio radio = new Radio(100);
        radio.setCurrentNumber(100);
        int expected = 0;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNumber5() {
        Radio radio = new Radio(100);
        radio.setCurrentNumber(99);
        int expected = 99;
        int actual = radio.getCurrentNumber();
        Assertions.assertEquals(expected, actual);
    }

}

