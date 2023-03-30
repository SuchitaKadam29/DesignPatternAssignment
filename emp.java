package DP;

import java.util.ArrayList;
import java.util.List;
public class emp implements Cloneable{
	private List<String> emp;
	public Workers() {
		emp = new ArrayList<>();
		}
	public emp(List<String> e) {
		emp = e;
	}	
	public void LoadData() {
		emp.add("Raj");
		emp.add("shashwat");
		emp.add("rashmi");
		emp.add("shreyansh");
		emp.add("neha");
	}
	public List<String> getemp() {
		return emp;
	}
	@Override
	public emp clone() {
		List<String> temp = new ArrayList<>();
		for(String o : emp) {
			temp.add(o);
		}
		return new emp(temp);
	}
}
