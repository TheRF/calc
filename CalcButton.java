import javafx.scene.control.*;
import javafx.event.*;

class CalcButton extends Button{
	public CalcButton(String caption, TextField field, CalcController cc){
		super(caption);
		this.setOnAction((event)->{
			if(field.getText().equals(Constants.ZERO.toString()))
				field.setText(Constants.EMPTY);
			
			field.setText(cc.processInput(this.getText(), field.getText(), field.getText().length()));

			if(field.getText().equals(Constants.EMPTY))
				field.setText(Constants.ZERO.toString());
		});
	}
}