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
		try{
			String disp = getText();
			disp = disp.replace(Constants.DSEP, Constants.DSEPNORM);
			disp = cc.processInput(s, disp, disp.length());
			disp = disp.replace(Constants.DSEPNORM, Constants.DSEP);

			if (disp.equals(Constants.INF) || disp.equals(Constants.NAN)){
				throw new ArithmeticException(ErrorConstants.ERRCALCCONTZERO);
			}

			setText(disp);
		}
		catch(ArithmeticException e){
			if ((e.getMessage()).contains(ErrorConstants.ERRCALCCONTZERO))
				ErrorDialog.alert(ErrorConstants.ERRCALCTITLE,
				                  ErrorConstants.ERRCALCZERO,
				                  e.getMessage());
			else
				ErrorDialog.alert(ErrorConstants.ERRCALCTITLE,
					              ErrorConstants.ERRCALCDEF,
					              e.getMessage());

			setText(Constants.EMPTY);
		}
		catch(RuntimeException e){
			ErrorDialog.alert(ErrorConstants.ERRSYNTITLE,
				              ErrorConstants.ERRSYNDESC,
				              e.getMessage());
		}
	}
}