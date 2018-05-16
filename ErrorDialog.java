import javafx.scene.control.*;
import javafx.scene.control.Alert.*;
import javafx.scene.control.Alert.AlertType.*;

class ErrorDialog{
	public static void alert(String title, String header, String content){
		Alert ea = new Alert(AlertType.ERROR);
		ea.setTitle(title);
		ea.setHeaderText(header);
		ea.setContentText(content);
		ea.showAndWait();
	}
}