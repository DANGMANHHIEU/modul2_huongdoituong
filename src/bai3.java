public class bai3 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.turnOn();
        fan1.setSpeed(3);
        fan1.setRadius(10.0);
        fan1.setColor("Yellow");
        System.out.println(fan1);

        Fan fan2 = new Fan();
         fan2.turnOff();
        System.out.println(fan2);
    }

}
class Fan{
    final int slow =1;
    private boolean on = false;
    private int speed = slow;
    private String color = "blue";
    private double radius = 5.0;
    public Fan(){
    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void setSpeed(int newspeed){
        if(on && newspeed>=1&&newspeed<=3){
           speed = newspeed;
        }
    }
    public void setColor(String newcolor){
        color = newcolor;
    }
    public void setRadius(double newradius){
        radius = newradius;
    }
    public void speedUp(){
        if(on && speed<3){
            speed++;
        }
    }
    public void speedDown(){
        if(on && speed>1){
            speed--;
        }
    }

    @Override
    public String toString() {
        if(on==true){
            return speed +"/"+ radius+"/"+color+"/ Fan is on";
        }
        else
          return radius+"/"+color+"/Fan is off";

    }
}
