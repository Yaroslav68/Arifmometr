package arithmometr;


import java.net.URL;
import java.util.ResourceBundle;

import arithmometr.animation.Shake;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField secondNumber;

    @FXML
    private TextField firstNumber;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button buttonClear;

    @FXML
    private TextField result;

    @FXML
    void add(ActionEvent event) {
        if (firstNumber.getText().isEmpty() || secondNumber.getText().isEmpty()) {
            Shake firstOperandAnim = new Shake(firstNumber);
            Shake secondOperandAnim = new Shake(secondNumber);
            Shake resultAnim = new Shake(result);
            firstOperandAnim.playAnimation();
            secondOperandAnim.playAnimation();
            resultAnim.playAnimation();
            return;
        }
        int first = Integer.parseInt(firstNumber.getText());
        int second = Integer.parseInt(secondNumber.getText());
        int sum = first + second;
        result.setText(String.valueOf(sum));
    }

    @FXML
    void clear(ActionEvent event) {
        firstNumber.clear();
        secondNumber.clear();
        result.clear();
    }

    @FXML
    void initialize() {

    }
}
