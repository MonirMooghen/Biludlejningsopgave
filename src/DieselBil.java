public class DieselBil extends Bil {
    private boolean harPartikelfilter;
    private int kmPrL;

    public DieselBil(int regNr, String mærke, String model, int årgang,
                     int antalDøre, boolean harPartikelfilter, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public boolean getHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "\nDieselbil: " +
                "Registrerings nummer: " + regNr + "\n" +
                "Mærke: " + mærke + "\n" +
                "Model: " + model + '\'' +
                "Årgang: " + årgang + "\n" +
                "Antal døre: " + antalDøre + "\n" +
                "Har den partikelfilter: " + harPartikelfilter + "\n" +
                "Kilometer per liter: " + kmPrL + "\n"
                ;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double dieselGrønEjerafgift = 0;

        if (kmPrL >= 20 && kmPrL <= 50) {
            dieselGrønEjerafgift = 330 + 130;
        } else if (kmPrL < 20 && kmPrL <= 15) {
            dieselGrønEjerafgift = 1050 + 1390;
        } else if (kmPrL < 15 && kmPrL <= 10) {
            dieselGrønEjerafgift = 2340 + 1850;
        } else if (kmPrL < 10 && kmPrL <= 5) {
            dieselGrønEjerafgift = 5550 + 2270;
        } else if (kmPrL < 5) {
            dieselGrønEjerafgift = 10470 + 15260;
        } else {
            dieselGrønEjerafgift = 330 + 130;
        }

        if (getHarPartikelfilter()) {
            return dieselGrønEjerafgift;
        }
        dieselGrønEjerafgift += 1000;
        return dieselGrønEjerafgift;
    }
}
