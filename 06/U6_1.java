public class U6_1 {
    public static void main(String[] args) {
        Station tokyo = new Station ("ìåãû");
        Station kanda = new Station ("ê_ìc");
        tokyo.setDown (kanda);
        kanda.setUp (tokyo);
        printDown(tokyo);
    }
    public static void printDown (Station start) {
        Station station = start;
        while (station != null) {
            System.out.println (station.getName());
            station = station.getDown();
        }
    }
    /*
    Station next = start;
    while (true) {
        System.out.println (next.getName());
        try {
            next = next.getDown ();
            name = next.getName ();
        } catch (NullPointerException e) {
            break;
        }
    }
     */
}
