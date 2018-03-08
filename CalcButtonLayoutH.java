import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

class CalcButtonLayoutH extends HBox{

	public CalcButtonLayoutH(int row, TextField tf, CalcController cc){
		super();
		setSpacing(Constants.SPACING);
		//HBox.setHgrow(this, Priority.ALWAYS);
		setAlignment(Pos.CENTER);
		
		ConstWrapsButtonPosition btn = new ConstWrapsButtonPosition();
		for(String s: btn.getHLine(row)){
			getChildren().add(new CalcButton(s, tf, cc));
		}
	}
	
}