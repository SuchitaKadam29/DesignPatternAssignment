package DP;

public class pc extends Computers{
	private String Ram;
	private String Hdd;
	private String CPU;
	public PersonalComputer(String ram, String hdd, String CPU) {
		super();
		this.Ram = ram;
		this.Hdd = hdd;
		this.CPU = CPU;
	}
	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.Ram;
	}

	@Override
	public String getHdd() {
		// TODO Auto-generated method stub
		return this.Hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.CPU;
	}
	@Override
	public String toString() {
		return "PC " + "RAM: " + this.getRam() + " HDD: " + this.getHdd() + " CPU: " + this.getCPU();
	}
	
}
