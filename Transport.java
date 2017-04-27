/**
 * Created by zolotuy on 27.04.2017.
 */
public class Transport extends Plane {


    public Transport() {
        super(700,500,400,6,"transport");
    }
    public String toString(){
        return "Info"+"name:"+getName()+" "+"speed:"+getSpeed()+" "+"well:"+getWeel()+"mass:"+getMass()+" "+"count:"+getCountPassenger();
    }
}
