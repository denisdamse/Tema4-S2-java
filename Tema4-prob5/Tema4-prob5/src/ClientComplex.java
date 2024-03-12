
public class ClientComplex {

	public static void main(String[] args) {
		
		Complex c = new Complex(3, 7);
		System.out.println(c);
		c.afisareComplex();
        c.afisareComplex();

		Complex c2= new Complex(2,5.4);
		Complex.numarAfisari();
        c2.modulComplex();
        c2.toString();
        c2.suma(c2);
	}

}
