import javafx.scene.control.*;
import javafx.geometry.*;

class CalcDisplayField extends TextField{
	public CalcDisplayField(){
		super(Constants.ZERO.toString());

		setAlignment(Pos.CENTER_RIGHT);
	}
}