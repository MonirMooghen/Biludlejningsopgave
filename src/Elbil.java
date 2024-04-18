public class Elbil extends Bil {
    private int batterikapacitetKWh;
    private int maxKm;
    private int whPrKm;

    public Elbil(int regNr, String mærke, String model, int årgang,
                 int antalDøre, int batterikapacitetKWh, int maxKm,
                 int whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "\nElbil: \n" +
                "Registrerings nummer: " + regNr + "\n" +
                "Mærke: " + mærke + "\n" +
                "Model: " + model + '\'' +
                "Årgang: " + årgang + "\n" +
                "Antal døre: " + antalDøre + "\n" +
                "Batteri kapacitet i KWh: " + batterikapacitetKWh + " KWh \n" +
                "Max km per opladning: " + maxKm + " km \n" +
                "KWh per kilometer: " + whPrKm + " KWh \n"
                ;
    }

    @Override
    public double beregnGrønEjerafgift() {
         double kmPrL = ((whPrKm/91.25)/100);

        if(kmPrL >=20 && kmPrL<=50){
            return 330;
        } else if (kmPrL <20 && kmPrL<=15) {
            return 1050;
        } else if (kmPrL <15 && kmPrL<=10) {
            return 2340;
        } else if (kmPrL <10 && kmPrL<=5) {
            return 5550;
        } else if (kmPrL <5) {
            return 10470;
        } else {
            return 330;
        }
    }
}
