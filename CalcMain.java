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
										Constants.APPMINSIZE,
										Constants.APPMINSIZE));
		PrimaryStage.show();
	}
}