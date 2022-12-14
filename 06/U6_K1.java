public class U6_K1 {
    public static void main(String[] args) {
        Station tokyo = new Station ("東京");
        Station kanda = new Station ("神田");
        Station akihabara = new Station ("秋葉原");
        Station okachimachi = new Station ("御徒町");
        Station ueno = new Station ("上野");
        tokyo.setDown (kanda);
        kanda.setDown (akihabara);
        akihabara.setDown (okachimachi);
        okachimachi.setDown (ueno);
        ueno.setUp (okachimachi);
        okachimachi.setUp (akihabara);
        akihabara.setUp (kanda);
        kanda.setUp (tokyo);
        printDown(tokyo);
        System.out.println ();
        printUp(ueno);
    }
    public static void printDown (Station start) {
        Station station = start;
        while (station != null) {
            System.out.println (station.getName());
            station = station.getDown();
        }
    }
    public static void printUp (Station start) {
        Station station = start;
        while (station != null) {
            System.out.println (station.getName());
            station = station.getUp();
        }
    }
}
