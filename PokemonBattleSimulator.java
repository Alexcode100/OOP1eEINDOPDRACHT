import java.util.Scanner;

class Charmander {
    private String naam;
    private String kracht = "vuur";
    private String zwakte = "water";

    public Charmander(String naam) {
        this.naam = naam;
    }

    public void strijdkreet() {
        System.out.println(naam + "!");
    }
}

public class PokemonBattleSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. De speler start t spel
        System.out.println("Welkom bij de Pokemon Battle Simulator!");

        // 2. De speler geeft een naam aan een Charmander
        System.out.println("Geef een naam aan je Charmander:");
        String charmanderNaam = scanner.nextLine();
        Charmander charmander = new Charmander(charmanderNaam);

        while (true) {
            // 3. De charmander doet zijn strijdkreet 10 keer
            for (int i = 0; i < 10; i++) {
                charmander.strijdkreet();
            }

            // 4. De speler kan een nieuwe naam geven aan dezelfde charmander
            System.out.println("Geef een nieuwe naam aan je Charmander of typ 'stop' om te stoppen:");
            String nieuweNaam = scanner.nextLine();

            if (nieuweNaam.equalsIgnoreCase("stop")) {
                // 6. Herhaal 4 en 5 tot de speler het spel verlaat
                break;
            } else {
                charmander = new Charmander(nieuweNaam);
            }
        }

        System.out.println("Bedankt voor het spelen!");
        scanner.close();
    }
}