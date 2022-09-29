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
        public void setNewVolume9() {

            radio.setCurrentVolume(9);
            int expected = 9;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void setNewVolume10() {

            radio.setCurrentVolume(10);
            int expected = 10;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void setNewVolume11() {

            radio.setCurrentVolume(11);
            int expected = 0;
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
        public void setNewVolume50() {

            radio.setCurrentVolume(50);
            int expected = 0;
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
        public void decreaseZeroTest () {

            radio.setCurrentVolume(0);
            radio.decreaseVolume();
            int expected = 0;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void decreaseOneTest () {

            radio.setCurrentVolume(1);
            radio.decreaseVolume();
            int expected = 0;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void decreaseTwoTest () {

            radio.setCurrentVolume(2);
            radio.decreaseVolume();
            int expected = 1;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void decreaseNineTest () {

            radio.setCurrentVolume(9);
            radio.decreaseVolume();
            int expected = 8;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void decreaseTenTest () {

            radio.setCurrentVolume(10);
            radio.decreaseVolume();
            int expected = 9;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void increaseZeroTest(){

            radio.setCurrentVolume(0);
            radio.increaseVolume();
            int expected = 1;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void increaseOneTest(){

            radio.setCurrentVolume(1);
            radio.increaseVolume();
            int expected = 2;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void increaseTwoTest(){

            radio.setCurrentVolume(2);
            radio.increaseVolume();
            int expected = 3;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void increaseNineTest(){

            radio.setCurrentVolume(9);
            radio.increaseVolume();
            int expected = 10;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void increaseTenTest(){

            radio.setCurrentVolume(10);
            radio.increaseVolume();
            int expected = 10;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }

    }
