package pl.edu.pw.elka.topt.model;

public enum STATE {

	s1(1, "Wszystkie porty wolne"),
	s2(2, ""),
	s3(3, ""),
	s4(4, ""),
	s5(5, ""),
	s6(6, ""),
	s7(7, "");
	
	private final String opis;
	private final int ID;
	
	STATE(int ID, String opis)
	{
		this.ID = ID;
		this.opis = opis;
		
	}

}
