import java.util.ArrayList;

public class Garage {
    private ArrayList<Bil> bilpark;
    private String myCarCollection;

    public Garage(){
        bilpark = new ArrayList<>();
    }

    public void add(Bil bil) {
        bilpark.add(bil);
    }

    @Override
    public String toString() {
        String result= "";
        result += "Biler i garagen:  \n";
        for(Bil biler : bilpark){
            result += biler.toString();
        }
        return result;
    }

    public double beregnGrønAfgiftForBilpark(){
        double grønEjerafgift = 0;
        for(Bil biler : bilpark){
            grønEjerafgift += biler.beregnGrønEjerafgift();
        }
        return grønEjerafgift;
    }

}
