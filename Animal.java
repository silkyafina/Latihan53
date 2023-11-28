package pkg22166017.pbo.lat53;

/**
 *
 * @author User
 * Nama         : Silky Afina Saly
 * NIM          : 22166017
 * Mata Kuliah  : Pemrograman Berorientasi Objek 1
 * Program Studi: Sistem Informasi
 * Semester     : 3
 */
// membuat super class animal
public class Animal {
    // dekllarasi atribut kelas animal
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
   // metode getter dan setter untuk mengambil dan mengisi data ke dalam obyek
    public boolean isVegetarian(){
        return vegetarian;
    }
    public String getEats(){
        return eats;
    }
    public int getNoOfLegs(){
        return noOfLegs;
    }
    // konstruktor
    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
   

    }
}
// membuat subclass rabbit, turunan dari animal
class Rabbit extends Animal {
    private final String color;
    private final String name;
// metode getter dan setter untuk mengambil dan mengisi warna, name
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }
    //konstruktor
    public Rabbit(boolean vegetarian, String food, int legs, String color, String name) {
        super(vegetarian, food, legs);
        this.color = color;
        this.name = name;
    
    }
   // membuat obyek rabbit 
    public static void main(String[] args) {   
        Rabbit rabbit = new Rabbit(false, "grass", 4, "grey", "Peter" );
        System.out.println("Hello, his name is "+rabbit.getName());
        System.out.println(rabbit.getName()+" is vegetarian? "+ rabbit.isVegetarian());
        System.out.println(rabbit.getName()+ " eats " + rabbit.getEats());
        System.out.println(rabbit.getName()+ " has " + rabbit.noOfLegs+" legs");
        System.out.println(rabbit.getName()+" color is"+rabbit.getColor());

    }
}

    
