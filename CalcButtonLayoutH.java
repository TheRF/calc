import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

class CalcButtonLayoutH extends HBox{

	public CalcButtonLayoutH(int row, TextField tf, CalcController cc){
		super();
		
		ConstWrapsButtonPosition btn = new ConstWrapsButtonPosition();
		for(String s: btn.getHLine(row)){
			getChildren().add(new CalcButton(s, tf, cc));
		}
	}
	
}