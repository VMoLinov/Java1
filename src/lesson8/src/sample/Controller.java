package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Random;

public class Controller {

    Random rand = new Random();
    int count = 0;
    int randomNumber;
    int guessCount;
    int number;

    @FXML
    private Label header;

    @FXML
    private Label content;

    @FXML
    private TextField numberInputField;

    @FXML
    private Button button;

    @FXML
    private Button closeButton;

    @FXML
    void pressButton() {
        switch (count) {
            case 0 -> generateNumber();
            default -> compareNumbers();
        }
    }

    @FXML
    void close() {
        System.exit(0);
    }

    private void generateNumber() {
        String message = numberInputField.getText();
        numberInputField.clear();
        if (!message.isBlank()) {
            try {
                number = Integer.parseInt(message);
                if (number > 0) {
                    guessCount = setGuessCount(number);
                    randomNumber = rand.nextInt(number + 1);
                    header.setText("Загадано число от 0 до " + number);
                    content.setText("Попробуйте угадать это число! Осталось " + guessCount + " попыток");
                    count++; //Менять размер текста можно только с помощью setStyle?
                } else error();
                } catch (NumberFormatException e) {
                error();
            }
        }
    }

    private int setGuessCount(int x) {
        if (x < 100) return 3;
        else if (x < 1000) return 20;
        else return 50;
    }

    private void error() {
        var alert = new Alert(Alert.AlertType.ERROR, "Введите положительное число!");
        alert.setTitle("Ошибка ввода!");
        alert.show();
    }

    private void compareNumbers() {
        String message = numberInputField.getText();
        numberInputField.clear();
        if (!message.isBlank()) {
            try {
                number = Integer.parseInt(message);
                if (number > 0) {
                    if (--guessCount > 0) checkNumber();
                    else endGame();
                } else error();
            } catch (NumberFormatException e) {
                error();
            }
        }
    }

    private void checkNumber() {
        if (number > randomNumber) {
            content.setText("Загаданное число меньше " + number + "! Осталось " + guessCount + " попыток");
        } else if (number < randomNumber) {
            content.setText("Загаданное число больше " + number + "! Осталось " + guessCount + " попыток");
        } else endGame();
    }

    private void endGame() {
        if (number == randomNumber) content.setText("Вы выиграли! Спасибо за игру!");
        else content.setText("Вы проиграли!");
        button.setDisable(true);
        numberInputField.setDisable(true);
        closeButton.setVisible(true);
    }
}
