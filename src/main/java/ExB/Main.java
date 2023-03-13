package ExB;
public class Main {
    public static void main(String[] args) {
       final int MAX_CARS = 10; //max number of cars
       int km = 0; //km due
       int id = 0; //id of the car that needs service the most
       Car car1 = new Car(); //default constructor
       Car car2 = new Car(); //default constructor but with values from read()
       Car car3 = new Car("Volvo","S70",1999,2000,350000,320000,360000); //constructor with parameters
       car2.read(); //reads values from the user
       car1.print(); //prints all values
       car2.print();
       car3.print();
       Car[] Honda = new Car[MAX_CARS]; //array of cars
       for(int i=0;i<MAX_CARS;i++){ //reads values from the user and sets them to the array
           Honda[i] = new Car();
           Honda[i].read();
       }
       for(int i=0;i<MAX_CARS;i++){ //prints all values from the array
           Honda[i].print();
       }
       for(int i=0;i<MAX_CARS;i++){ //checks if the car needs service and prints the car that needs service the most and how many km its due
           if(!Honda[i].needsService()){
            if(Honda[i].getKm()-Honda[i].getNextService()>km){
                km = Honda[i].getKm()-Honda[i].getNextService();
                id = i;
                }
           }
       }
       System.out.println("Printing the car that needs service the most:");
       Honda[id].print();
       System.out.println("Km due: "+km+"km");
    }
}