import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.text.*;

class CalcButton extends Button{
	public CalcButton(String caption, IDisplayable comp){
		super(caption);
		
		setMinWidth(ConstantsGui.COMPSIZE);
		setMinHeight(ConstantsGui.COMPSIZE);
		setMaxWidth(Double.MAX_VALUE);
		setMaxHeight(Double.MAX_VALUE);

		setFont(new Font(getFont().getName(), ConstantsGui.BFONTSIZE));

		setOnAction((event)->{
			comp.display(getText());
			//field.setText(cc.processInput(getText(), field.getText(), field.getText().length()));
		});
	}
}