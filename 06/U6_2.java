public class U6_2 {
    public static void main(String[] args) {
        Station tokyo = new Station ("ìåãû");
        Station kanda = new Station ("ê_ìc");
        tokyo.setDown (kanda);
        kanda.setUp (tokyo);
        printUp (kanda);
    }
    public static void printUp (Station start) {
        Station station = start;
        while (station != null) {
            System.out.println (station.getName());
            station = station.getUp();
        }
    }
}
