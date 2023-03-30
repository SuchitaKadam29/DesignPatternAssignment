package DP;

public class Prototype {

	public static void main(String[] args) {
		emp e = new emp();
		e.LoadData();
		emp e1 = e.clone();
		emp e2 = e.clone();
		e1.getempList().add("Shashwat");
		e2.getempList().remove(3);
		System.out.println(e.getempList());
		System.out.println(e1.getempList());
		System.out.println(e2.getempList());

	}

}
