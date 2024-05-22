package esercizio_2;

public class Sim {
    public static void main(String[] args) {
        Call call1 = new Call(5, 3975464744L);
        call1.callInProgress(calls, 0);
        Call call2 = new Call(2, 3365462745L);
        call2.callInProgress(calls, 1);
        Call call3 = new Call(10, 3875469743L);
        call3.callInProgress(calls, 2);
        Call call4 = new Call(3, 3595464747L);
        // call4.callInProgress(calls, 3);
        Call call5 = new Call(1, 34715467743L);
        // call5.callInProgress(calls, 4);

        Sim sim1 = new Sim(3893140802L, 0, calls);
        sim1.printData();

    }

    private long cellphoneNumber;
    private int credit;
    static String[] calls = new String[5];


    //costruttore
    public Sim(long cellphoneNumber, int credit, String[] calls) {
        this.cellphoneNumber = cellphoneNumber;
        this.credit = credit;
        Sim.calls = calls;
    }

    public void printData() {
        System.out.println("il tuo numero di telefono è: " + this.cellphoneNumber + " il tuo credito è di: " + this.credit +
                " euro ");


        for (int i = 0; i < 5; i++) {
            if (Sim.calls[i] != null) {
                System.out.println(Sim.calls[i]);
            }
        }
    }


}
