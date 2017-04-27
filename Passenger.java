/**
 * Created by zolotuy on 27.04.2017.
 */
public class Passenger extends Plane{
    public Passenger() {
        super(1000,400,10,3,"passenger");
    }
    public String toString(){
        return "Info"+"name:"+getName()+" "+"speed:"+getSpeed()+" "+"well:"+getWeel()+"mass:"+getMass()+" "+"count:"+getCountPassenger();
    }

}
