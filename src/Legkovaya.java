public class Legkovaya {
    String marka;
    int probeg;


    Legkovaya(String marka, int probeg) {
        this.marka = marka;
        this.probeg = probeg;
    }

    public String rides() {
        return marka + " едет";
    }
    public void getInfo() {
        System.out.print( rides() + ", пробег "+ probeg+ "лет, ");

    }
}
