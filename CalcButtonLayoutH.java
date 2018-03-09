import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

class CalcButtonLayoutH extends HBox{

	public CalcButtonLayoutH(int row, TextField tf, CalcController cc, boolean centered){
		super();
		setSpacing(ConstantsGui.SPACING);
		HBox.setHgrow(this, Priority.ALWAYS);
		if(centered){
			setAlignment(Pos.CENTER);
			setPadding(new Insets(0, ConstantsGui.SPADDING, 0, ConstantsGui.SPADDING));
		}
		
		ConstWrapsButtonPosition btn = new ConstWrapsButtonPosition();
		for(String s: btn.getHLine(row)){
			CalcButton _btn = new CalcButton(s, tf, cc);
			HBox.setHgrow(_btn, Priority.ALWAYS);
			getChildren().add(_btn);
		}
	}
	
}