/**
 * Created by zolotuy on 26.04.2017.
 */
abstract class Mashine implements Run{
    private final int MaxSpeed=10000;
    private final int MinSpeed=10;
    private final int MaxCountPassenger=500;
    private final int MinCountPassenger=1;
    private String name;
    private int speed;
     Mashine(String name,int speed){
        this.name=name;
        this.speed=speed;
    }
    public String getName(){
     return name;
    }
    public int getSpeed(){
        return speed;
    }



}
