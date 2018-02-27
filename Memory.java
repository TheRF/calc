class Memory{
	private double memvalue;

	private void initMemory(double val){
		memvalue = val;
	}

	public Memory(){
		initMemory(0);
	}

	public Memory(double val){
		initMemory(val);
	}

	public double getMemory(){return memvalue;}
	public void setMemory(double d){memvalue = d;}
}