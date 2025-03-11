public class Vehicle {
   String brand;
   int speed;
   Public vehicle(String brand,int speed) {
    this.brand = brand;
    this.speed = speed;
   }
   public Void accelerate(int increase){
    speed += increase;
   }
   public void brake( int decrease){
    speed =Math.max(speed - decrease,0);

   }
   public void showdetails(){
    System.out.println("vehicle brand :"+ brand +"Speed:"+ speed);
   }

}
class Car extends Vehicle{
    int fuelLevel;
    Public Car(String brand, int speed,int fuelLevel){
        Super (brand,speed);
        this.fuelLevel = fuelLevel;
    }
    Public Void refuel(int amount)
    fuelLevel =Math.min(fuelLevel + amount,100);
    }
    Public void ShowDetails(){
        System.out.println("car Brand:" + brand+",speed:+",Fuellevel: + "%");
    }
    //subclass bike
    Class Bike extends vehicle{
        boolean helmeton;
        public Bike(String brand,int speed,boolean helmeton)
        {
            Super (brand ,speed);
            this.helmeton =helmeton;}
            public void wearhelmet(){
                helmeton = true;
            }
            public Void showdetails(){
                System.out.println("bike brand:" + brand+",speed:" + speed +",helmeton:"+helmeton);
            }
        }//main class
        public class Vehiclesystem{
            public static void main(String[] args) {
                Car car= new car("Toyota",60,50);
                car.accelerate(20),
                car.brake(30);
                car.refuel(30);
                car.showdetails();
                //bike objects
                Bike bike = new Bike("yamaha,40,false");
                bike.accelerate(15);
                bike.brake(10);
                bike.wearhelmet();
                bike.showDetails();

            }
        }
    

}
