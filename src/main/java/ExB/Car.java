package ExB;
import java.util.Scanner;
public class Car {
    Scanner in = new Scanner(System.in);
    private String manufacturer;
    private String model;
    private int year;
    private int cc;
    private int km;
    private int lastService;
    private int nextService;
    private boolean serviceStatus;

    public int getKm(){
        return km;
    }
    public int getNextService(){
        return nextService;
    }
    public boolean needsService(){ //checks if the car needs service
        return km < nextService;
    }

    public Car(){ //default constructor sets all values to 0 or "" and serviceStatus to false
        manufacturer = " ";
        model = " ";
        year = 0;
        cc = 0;
        km = 0;
        lastService = 0;
        nextService = 0;
        serviceStatus = false;
    }
    //constructor with parameters sets all values to the parameters and serviceStatus from needsService()
    public Car(String manufacturer, String model, int year, int cc, int km, int lastService, int nextService){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.cc = cc;
        this.km = km;
        this.lastService = lastService;
        this.nextService = nextService;
        this.serviceStatus = needsService();
    }
   
    public void read(){ //reads all values from the user and sets serviceStatus from needsService()
        System.out.print("Manufacturer: ");
        manufacturer = in.nextLine();
        System.out.print("Model: ");
        model = in.nextLine();
        System.out.print("Year: ");
        year = in.nextInt();
        System.out.print("CC: ");
        cc = in.nextInt();
        System.out.print("KM: ");
        km = in.nextInt();
        System.out.print("Last Service: ");
        lastService = in.nextInt();
        System.out.print("Next Service: ");
        nextService = in.nextInt();
        serviceStatus = needsService();
    }

    public void print(){ //prints all values
        System.out.println("Manufacturer:"+manufacturer);
        System.out.println("Model:"+model);
        System.out.println("Year:"+year);
        System.out.println("CC:"+cc);
        System.out.println("KM:"+km);
        System.out.println("Last Service:"+lastService);
        System.out.println("Next Service:"+nextService);
        if (serviceStatus){
            System.out.println("Service Status: Does not need service");
        }
        else{
            System.out.println("Service Status: Needs service");
        }
    }
}