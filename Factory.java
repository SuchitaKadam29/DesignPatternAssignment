package DP

public class Factory {
	public static Computers getComputer(String type, String Ram, String Hdd, String CPU) {
		if(type.equalsIgnoreCase("PC"))
				return new PersonalComputer(Ram,Hdd,CPU);
		else if(type.equalsIgnoreCase("Server"))
			return new ServerComputer(Ram,Hdd,CPU);
		return null;
	}
	public static void main(String[] args) {
		System.out.println(ComputerFactory.getComputer("Server, "16 gb", "1 TB", "i7 11th gen"));
	}

}
