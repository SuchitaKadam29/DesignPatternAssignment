package DP;

public class server extends Computers{
	private String Ram;
	private String Hdd;
	private String CPU;
	public server(String ram, String hdd, String cPU) {
		super();
		Ram = ram;
		Hdd = hdd;
		CPU = cPU;
	}
	
	public String getRam() {
		return Ram;
	}
	public String getHdd() {
		return Hdd;
	}
	public String getCPU() {
		return CPU;
	}
	
}
