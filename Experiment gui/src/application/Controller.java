package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class Controller {
	@FXML
    private TextField num1field;

    @FXML
    private TextField num2field;

    @FXML
    private TextField summation;

    @FXML
    private Button addtion;

    @FXML
    void add(ActionEvent event) {
int firstnum,secondnum,add;
firstnum=Integer.parseInt(num1field.getText());
secondnum=Integer.parseInt(num2field.getText());
add=firstnum+secondnum;
summation.setText(String.valueOf(add));
    }
}
