/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {
  ArrayList<String> residents;
  boolean hasDiningRoom;

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }

  public static void main(String[] args) {
    House Cushing = new House("Cushing House", "1 Paradise Road Northampton MA 01063", 4, true);
    System.out.println(Cushing);
    Cushing.moveIn("Teia Shannon");
    Cushing.moveIn("The Creepy Bunny Head");
    System.out.println(Cushing.residents);
    Cushing.moveOut("Teia Shannon");
    System.out.println(Cushing.residents);
    Cushing.isResident("Teia Shannon");
  }

  public void moveIn(String name) {
    residents.add(name);
  }

  public String moveOut(String name) {
    residents.remove(name);
    System.out.println(name + " has moved out");
    return name;
  }

  public Boolean isResident(String name) {
    Boolean residentStatus = residents.contains(name);
    if (residentStatus = true) {
      System.out.println(name + " is a resident");
    }
    else if (residentStatus = false) {
      System.out.println(name + " is not a resident");
    }
    return residentStatus;
    }
  }


