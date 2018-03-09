import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

class CalcButtonLayout extends VBox{
	
	public CalcButtonLayout(TextField tf, CalcController cc){
		super();
		setSpacing(ConstantsGui.SPACING);
		VBox.setVgrow(this, Priority.ALWAYS);
		
		ConstWrapsButtonPosition btn = new ConstWrapsButtonPosition();

		for(int i=0; i<btn.getHLinesCount(); i++){
			boolean c = (i==0)||(i==(btn.getHLinesCount()-1));
			CalcButtonLayoutH hlay = new CalcButtonLayoutH(i, tf, cc, c);
			VBox.setVgrow(hlay, Priority.ALWAYS);
			getChildren().add(hlay);
		}
	}
}