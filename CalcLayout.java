import javafx.scene.layout.*;
import javafx.geometry.*;

class CalcLayout extends VBox{
	public CalcLayout(){
		super();
		//VBox.setVgrow(this, Priority.ALWAYS);
		setMinWidth(Constants.APPMINSIZE);
		setMinHeight(Constants.APPMINSIZE);

		setPadding(new Insets(Constants.SPACING));
		setSpacing(Constants.SPACING);

		CalcDisplayField tf = new CalcDisplayField();
		getChildren().add(tf);

		CalcButtonLayout layout = new CalcButtonLayout(tf, new CalcController());
		getChildren().add(layout);
	}
}