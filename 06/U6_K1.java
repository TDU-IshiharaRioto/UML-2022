public class U6_K1 {
    public static void main(String[] args) {
        Station tokyo = new Station ("����");
        Station kanda = new Station ("�_�c");
        Station akihabara = new Station ("�H�t��");
        Station okachimachi = new Station ("��k��");
        Station ueno = new Station ("���");
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
