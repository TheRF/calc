import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.text.*;

class CalcButton extends Button{
	public CalcButton(String caption, TextField field, CalcController cc){
		super(caption);
		
		setMinWidth(ConstantsGui.COMPSIZE);
		setMinHeight(ConstantsGui.COMPSIZE);
		setMaxWidth(Double.MAX_VALUE);
		setMaxHeight(Double.MAX_VALUE);

		setFont(new Font(getFont().getName(), ConstantsGui.BFONTSIZE));

		setOnAction((event)->{
			field.setText(cc.processInput(getText(), field.getText(), field.getText().length()));
		});
	}
}