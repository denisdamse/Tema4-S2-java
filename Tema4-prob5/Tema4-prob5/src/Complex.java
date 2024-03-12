public class Complex 
	{
	private double re, img;
	
	private static int numarafisari=0;	
	public Complex(double re, double img)
	{
		this.re = re;
		this.img = img;
	}
	public double modulComplex()
	{
		return Math.sqrt(re*re+img*img);
	}
	public String toString()
	{
		return 	re+" + i * "+img;
	}
	public void afisareComplex()
	{
		System.out.println(this);
		numarafisari++;
	}
	public Complex suma(Complex c)
	{
		Complex b = new Complex(this.re+c.getRe(), this.img+c.getImg());
		return b;
	}
	public double getRe() {
		return re;
	}
	public double getImg() {
		return img;
	}
	public static int getNumarafisari() {
		return numarafisari;
	}
		public static void numarAfisari()
		{
			System.out.println("S-au afisat "+ numarafisari);
		}
		
		
}
