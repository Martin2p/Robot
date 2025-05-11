package Basics.OOP;

public class Droid{
  public static double batteryLevel = 100;
  public static double loadPerMinute = 3;
  String name;

  public Droid(String droidName) {
    name = droidName;
  }

  //Batterie-Level reduzieren
  public void dance() {
    batteryLevel -= 20;
    System.out.println(name + " is performing dancing!");
    System.out.println("Remaining battery level: " + Droid.batteryLevel + "%");
  }
  
 //Batterie-Level reduzieren
  public void coding() {
    batteryLevel -= 5;
    System.out.println(name + " is performing coding!");
    System.out.println("Remaining battery level: " + Droid.batteryLevel + "%");
  }

  //Batterie-Level reduzieren
  public void clean() {
    batteryLevel -= 10;
    System.out.println(name + " is performing cleaing!");
    System.out.println("Remaining battery level: " + Droid.batteryLevel + "%");
  }

  public void loading(double inputTime) {

    double loading = inputTime * Droid.loadPerMinute;
    double loadingtime = (100 - Droid.batteryLevel)/loadPerMinute;

    batteryLevel += loading;

    System.out.println("Required loadingtime for 100% battery level for " + name + " is " + loadingtime + " minutes.");
    System.out.println(name + " is loading battery for " + loadingtime + " minutes! - Loadingspeed: " + Droid.loadPerMinute + " % per minute!");

    if (Droid.batteryLevel >= 100){
        Droid.batteryLevel = 100;
        System.out.println("Battery level at 100% ! Stopp loading.") ;

    }else{
        System.out.println("Remaining battery level after " + inputTime + " minutes loading time: " + Droid.batteryLevel + "% !");
    }
  }

   public static void main(String[] args) {

    Droid Codey = new Droid("Codey");

    Codey.dance();
    Codey.coding();
    //Codey.clean();
    Codey.loading(3.4);
   }
}
