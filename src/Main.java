//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Garage minGarage = new Garage();

        Bil bil1 = new Benzinbil(1, "Opel", "Coesa", 2017, 5, 80, 30);
        Bil bil2 = new DieselBil(2, "Peugeot", "206", 2008, 5, false, 20);
        Bil bil3 = new Elbil(3, "Tesla", "X", 2020, 3, 1000, 400, 70);

        minGarage.add(bil1);
        minGarage.add(bil2);
        minGarage.add(bil3);

        System.out.println(minGarage);
        System.out.println("Den samlede grønne afgift for parken er: " +
                minGarage.beregnGrønAfgiftForBilpark());
    }
}