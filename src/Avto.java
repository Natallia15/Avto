public class Avto {
    String marka;
    int probeg;


    Avto(String marka, int probeg) {
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
