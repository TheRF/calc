import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

class CalcButtonLayoutH extends HBox{

	public CalcButtonLayoutH(int row, TextField tf, CalcController cc){
		super();
		setSpacing(ConstantsGui.SPACING);
		HBox.setHgrow(this, Priority.ALWAYS);
		
		ConstWrapsButtonPosition btn = new ConstWrapsButtonPosition();
		for(String s: btn.getHLine(row)){
			CalcButton _btn = new CalcButton(s, tf, cc);
			HBox.setHgrow(_btn, Priority.ALWAYS);
			getChildren().add(_btn);
		}
	}

	public int getButtonCount(){
		int i = 0;
		for(Node n: getChildren())
			i++;

		return i;
	}
	
}