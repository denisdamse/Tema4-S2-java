public class Birou {
    int latime;
    int lungime;
    int inaltime;
    public Birou(Sertar sertar1, Sertar sertar2, int lat, int lun, int ina)
    {
        sertar1=new Sertar(lat, lun, ina);
        sertar2=new Sertar(lat, lun, ina);
        latime=lat;
        lungime=lun;
        inaltime=ina;
    }
    public void tipareste()
    {
        System.out.println("Birou: "+" + "+latime+" + "+lungime+" + "+inaltime);
    }
}
