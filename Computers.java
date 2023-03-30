package DP;

public abstract class Computers{
	public abstract String getRam();
	public abstract String getHdd();
	public abstract String getCPU();
public String toString() {
	return "RAM: " + this.getRam() + " HDD: " + this.getHdd() + " CPU: " + this.getCPU();
}
	
}


