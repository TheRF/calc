import javafx.scene.control.*;
import javafx.event.*;

class CalcButton extends Button{
	public CalcButton(String caption, TextField field, CalcController cc){
		super(caption);
		this.setOnAction((event)->{
			field.setText(cc.processInput(this.getText(), field.getText(), field.getText().length()));
		});
	}
}