public class Benzinbil extends Bil {
    private int oktantal;
    private int kmPrL;

    public Benzinbil(int regNr, String mærke, String model, int årgang,
               int antalDøre, int oktantal, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "\nBenzinbil : \n" +
                "Registrerings nummer: " + regNr + "\n" +
                "Mærke: " + mærke + "\n" +
                "Model: " + model + '\'' +
                "Årgang: " + årgang + "\n" +
                "Antal døre: " + antalDøre + "\n" +
                "Kilometer per liter: " + kmPrL + "\n" +
                "Oktan antal: " + oktantal + "\n"
                ;
    }

    @Override
    public double beregnGrønEjerafgift() {
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
