import javafx.scene.layout.*;

class CalcLayout extends VBox{
	public CalcLayout(){
		super();
		
		CalcDisplayField tf = new CalcDisplayField();
		getChildren().add(tf);

		CalcButtonLayout layout = new CalcButtonLayout(tf, new CalcController());
		getChildren().add(layout);
	}
}