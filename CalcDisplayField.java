import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.text.*;

class CalcDisplayField extends TextField{
	public CalcDisplayField(){
		super(Constants.ZERO.toString());

		setAlignment(Pos.CENTER_RIGHT);
		setFont(new Font(getFont().getName(), ConstantsGui.FONTSIZE));
		setMinHeight(ConstantsGui.COMPSIZE);

		setEditable(false);
		textProperty().addListener((observable, sOld, sNew)->{
			if(Constants.EMPTY.equals(sNew))
				setText(Constants.ZERO.toString());
		});
	}
}