public class App {
    public static void main(String[] args)  {
        Birou birou1 = new Birou(new Sertar(3, 4, 3), new Sertar(3, 4, 2), 10, 11, 10);
        birou1.tipareste();
    }
}
