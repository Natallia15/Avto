public class Gruzovik {
    String marka;
    int probeg;
    int gruzopodyomnost;


    Gruzovik(String marka, int probeg, int gruzopodyomnost ) {
        this.marka = marka;
        this.probeg = probeg;
        this.gruzopodyomnost = gruzopodyomnost;
    }

    public String rides() {
        return marka + " едет";
    }
    public String transport() {
        return " везёт";
    }
    public void getInfo() {
        System.out.print( rides() + ", пробег "+ probeg+ "лет, ");

    }
}
