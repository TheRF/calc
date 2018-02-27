import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

class CalcButtonLayout extends VBox{
	
	public CalcButtonLayout(TextField tf, CalcController cc){
		super();
		
		ConstWrapsButtonPosition btn = new ConstWrapsButtonPosition();

		for(int i=0; i<btn.getHLinesCount(); i++){
			getChildren().add(new CalcButtonLayoutH(i, tf, cc));
		}
	}
}