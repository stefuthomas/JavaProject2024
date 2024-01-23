import java.util.Scanner;
public class CoffeeMaker {
    private int coffeeAmount;
    private String coffeeType;
    private boolean on_offSwitch;

    // konstruktori, jossa alustetaan kahvinkeitin
    public CoffeeMaker() {
        this.on_offSwitch = false;
        this.coffeeAmount = 0;
        this.coffeeType = "normal";
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    public void setCoffeeAmount(int coffeeAmount) {
        this.coffeeAmount = coffeeAmount;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void isOff() {
        // valintarakenne if-else, jossa tarkistetaan onko kahvinkeitin päällä
        if (!on_offSwitch) {
            //Jos kahvinkeitin ei ole päällä, niin tulostetaan virheilmoitus
            System.out.println("Coffee maker is already turned off.");
        } else {
            //Jos kahvinkeitin on päällä, niin kahvinkeitin sammutetaan
            System.out.println("Coffee maker is turned off.");
            on_offSwitch = false;
        }
    }

    public void isOn() {
        // valintarakenne if-else, jossa tarkistetaan onko kahvinkeitin päällä
        if (on_offSwitch) {
            //Jos kahvinkeitin on päällä, niin tulostetaan virheilmoitus
            System.out.println("Coffee maker is already turned on.");
        } else {
            //Jos kahvinkeitin ei ole päällä, niin kahvinkeitin käynnistetään
            System.out.println("Coffee maker is turned on.");
            on_offSwitch = true;
        }
    }

    public void amountSelector() {
        // valintarakenne if-else, jossa tarkistetaan onko kahvinkeitin päällä
        if (on_offSwitch) {
            //Jos kahvinkeitin on päällä, niin kysytään käyttäjältä määrä
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input the amount:");
            int amount = scanner.nextInt();
            // valintarakenne if-else, jossa tarkistetaan onko määrä sallittu
            if (amount >= 10 && amount <= 80) {
                //Jos määrä on sallittu, niin asetetaan määrä
                setCoffeeAmount(amount);
            } else {
                //Jos määrä ei ole sallittu, niin tulostetaan virheilmoitus
                System.out.println("The amount " + amount + " is more/less than the acceptable amount");
            }
        } else {
            //Jos kahvinkeitin ei ole päällä, niin tulostetaan virheilmoitus
            System.out.println("Coffee maker is turned off.");
        }
    }
    public void typeSelector() {
        // valintarakenne if-else, jossa tarkistetaan onko kahvinkeitin päällä
        if (on_offSwitch) {
            //Jos kahvinkeitin on päällä, niin kysytään käyttäjältä tyyppi
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input the type (1. normal 2. espresso):");
            int type = scanner.nextInt();
            if (type == 1) {
                //Jos vainta on "1", niin asetetaan tyyppi "normal"
                setCoffeeType("normal");
            } else if (type == 2) {
                //Jos vainta on "2", niin asetetaan tyyppi "espresso"
                setCoffeeType("espresso");
            } else {
                //Jos vainta ei ole "1" tai "2", niin tulostetaan virheilmoitus
                System.out.println("The type " + type + " is not available");
            }
        } else {
            //Jos kahvinkeitin ei ole päällä, niin tulostetaan virheilmoitus
            System.out.println("Coffee maker is turned off.");
        }
    }

}

class Coffee {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();    // luodaan kahvinkeitin
        // valintarakenne while, jossa kysytään käyttäjältä komentoja
        while (true) {
            Scanner scanner = new Scanner(System.in);
            // tulostetaan käyttäjälle valikko
            System.out.println("Input the command");
            System.out.println("1. Turn on");
            System.out.println("2. Turn off");
            System.out.println("3. Select amount");
            System.out.println("4. Select type");
            System.out.println("5. Brew coffee");
            System.out.println("6. Exit");
            int command = scanner.nextInt();
            // valintarakenne switch-case, jossa kutsutaan kahvinkeittimen metodeja.
            switch (command) {
                case 1:
                    coffeeMaker.isOn();
                    break;
                case 2:
                    coffeeMaker.isOff();
                    break;
                case 3:
                    coffeeMaker.amountSelector();
                    break;
                case 4:
                    coffeeMaker.typeSelector();
                    break;
                case 5:
                    System.out.println("Coffee type: " + coffeeMaker.getCoffeeType());
                    System.out.println("Coffee amount: " + coffeeMaker.getCoffeeAmount());
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("The command " + command + " is not available");
                    break;
            }
        }
    }
}