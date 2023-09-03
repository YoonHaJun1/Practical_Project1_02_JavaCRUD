package parking;

public class Park {
    private int number;
    int time;
    int charge;



    Park(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    /*
    1 4967
    2 5738
    */
    @Override
    public String toString() {

        String str = String.format("%15s", number);

        return str;
    }
}
