/**
 * Created by zolotuy on 26.04.2017.
 */
public class Plane extends Mashine {
     Plane(int speed, int mass, int countPassenger, int weel, String name) {

      super(name, speed);
      this.mass = mass;
        this.countPassenger = countPassenger;
        this.weel = weel;

    }


    private int mass;
    private int countPassenger;
    private int weel;






    @Override
    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {

        this.mass = mass;
    }

    @Override
    public int getWeel() {
        return weel;
    }

    public void setWeel(int weel) {
        this.weel = weel;
    }

    @Override
    public int getCountPassenger() {

        return countPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }
}
