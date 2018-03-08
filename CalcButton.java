import javafx.scene.control.*;
import javafx.event.*;

class CalcButton extends Button{
	public CalcButton(String caption, TextField field, CalcController cc){
		super(caption);
		
		setMinWidth(Constants.COMPSIZE);
		setMinHeight(Constants.COMPSIZE);
		setMaxWidth(Double.MAX_VALUE);
		setMaxHeight(Double.MAX_VALUE);

		this.setOnAction((event)->{
			field.setText(cc.processInput(this.getText(), field.getText(), field.getText().length()));
		});
	}
}