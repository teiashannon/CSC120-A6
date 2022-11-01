/* This is a stub for the Cafe class */
public class Cafe extends Building {
    int nCoffeeOunces;
    int nSugarPackets;
    int nCreams;
    int nCups;

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    
    public static void main(String[] args) {
        Cafe ShelburneFalls = new Cafe("Shelburne Falls", "322 Russell St Hadley MA 01035", 1, 12, 25, 25, 50);
        System.out.println(ShelburneFalls);
        ShelburneFalls.sellCoffee(12, 2, 3);
        ShelburneFalls.sellCoffee(12, 4, 1);
    }

    public void sellCoffee(int size, int sugars, int creams) {
        if (size > nCoffeeOunces) {
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
        }
        nCoffeeOunces = nCoffeeOunces - size;
        if (sugars > nSugarPackets) {
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
        }
        nSugarPackets = nSugarPackets - sugars;
        if (creams > nCreams) {
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
        }
        nCreams = nCreams - creams;
        if (nCups == 0) {
            restock(nCoffeeOunces, nSugarPackets, nCreams, nCups);
        }
        nCups = nCups - 1;
        System.out.println("A " + size + " ounce coffee with " + sugars + " sugars " + "and " + creams + " creams is ready.");
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        nCoffeeOunces = nCoffeeOunces + 100;
        nSugarPackets = nSugarPackets + 50;
        nCreams = nCreams + 50;
        nCups = nCups + 250;
        System.out.println("The supplies are restocked.");
    }

    
}
