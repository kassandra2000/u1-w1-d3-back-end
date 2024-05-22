package esercizio_2;

public class Call {
    private int minute;
    private long cellphoneNumber;

    //costruttore
    public Call(int minute, long cellphoneNumber) {
        this.minute = minute;
        this.cellphoneNumber = cellphoneNumber;
    }


    public void callInProgress(String[] calls, int i) {
        calls[i] = "hai chiamato il numero: " + this.cellphoneNumber + " per: " + this.minute + " minuti ";
    }

}
