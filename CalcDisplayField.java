import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.text.*;

class CalcDisplayField extends TextField implements IDisplayable{
	private  CalcController cc;

	public CalcDisplayField(){
		super(Constants.ZERO.toString());

		setAlignment(Pos.CENTER_RIGHT);
		setFont(new Font(getFont().getName(), ConstantsGui.EFONTSIZE));
		setMinHeight(ConstantsGui.COMPSIZE);

		cc = new CalcController();

		setEditable(false);
		textProperty().addListener((observable, sOld, sNew)->{
			if(Constants.EMPTY.equals(sNew))
				setText(Constants.ZERO.toString());
		});
	}

	public void display(String s){
		setText(cc.processInput(s, getText(), getText().length()));
	}
}