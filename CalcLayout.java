import javafx.scene.layout.*;
import javafx.geometry.*;

class CalcLayout extends VBox{
	public CalcLayout(){
		super();
		VBox.setVgrow(this, Priority.ALWAYS);
		setMinWidth(ConstantsGui.APPMINSIZE);
		setMinHeight(ConstantsGui.APPMINSIZE);

		setPadding(new Insets(ConstantsGui.SPACING));
		setSpacing(ConstantsGui.SPACING);

		CalcDisplayField tf = new CalcDisplayField();
		getChildren().add(tf);

		CalcButtonLayout layout = new CalcButtonLayout(tf, new CalcController());
		setVgrow(layout, Priority.ALWAYS);
		getChildren().add(layout);
	}
}