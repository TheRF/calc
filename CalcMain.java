import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;

public class CalcMain extends Application{
	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage PrimaryStage){
		PrimaryStage.setScene(new Scene(new CalcLayout(),
										ConstantsGui.APPMINSIZE,
										ConstantsGui.APPMINSIZE));
		PrimaryStage.setTitle(ConstantsGui.TITLE);
		PrimaryStage.setMinWidth(ConstantsGui.APPMINSIZE);
		PrimaryStage.setMinHeight(ConstantsGui.APPMINSIZE);
		PrimaryStage.show();
	}
}