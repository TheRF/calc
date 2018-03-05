import javafx.scene.control.*;
import javafx.geometry.*;

class CalcDisplayField extends TextField{
	public CalcDisplayField(){
		super(Constants.ZERO.toString());

		setAlignment(Pos.CENTER_RIGHT);
	}

	public void setText(String text){
		if (text.equals(Constants.EMPTY))
			text = Constants.ZERO.toString();

		super.setText(text);
	}
}