import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

class CalcButtonLayout extends VBox{
	
	public CalcButtonLayout(TextField tf, CalcController cc){
		super();
		setSpacing(ConstantsGui.SPACING);
		VBox.setVgrow(this, Priority.ALWAYS);
		
		ConstWrapsButtonPosition btn = new ConstWrapsButtonPosition();

		for(int i=0; i<btn.getHLinesCount(); i++){
			CalcButtonLayoutH hlay = new CalcButtonLayoutH(i, tf, cc);
			VBox.setVgrow(hlay, Priority.ALWAYS);
			getChildren().add(hlay);
		}

		widthProperty().addListener((observable, dOld, dNew)->{
			setButtonPadding();
		});
	}

	private int getItemCount(){
		int i = 0;
		for(Node n: getChildren())
			i++;

		return i;
	}

	private void setButtonPadding(){
		double[] items = new double[getItemCount()];
		double max = 0;

		for(int i=0; i<getItemCount(); i++){
			items[i] = ((CalcButtonLayoutH)getChildren().get(i)).getButtonCount();
			max = (items[i]>max)?items[i]:max;
		}

		double w = getWidth();
		for(int i=0; i<getItemCount(); i++){
			if(items[i]<max){
				double pad=(	w
								-(items[i]-1)*ConstantsGui.SPACING
								-items[i]*((w-(max-1)*ConstantsGui.SPACING)/max))
								/2;
				((CalcButtonLayoutH)getChildren().get(i)).setPadding(new Insets(0, pad, 0, pad));
			}
		}
	}
}