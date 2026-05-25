/**
 * Creates the "Bottle" class with material, volume, and capacity properties.
*/
  

public class Bottle{
  private double intCap;
  private double amt;

  public Bottle(double cap){
    intCap = cap;
    amt = cap;
  }

  public double updateAmount(double removed){
    amt -= removed;
    if (amt <= 0.25 * intCap){
      amt = intCap;
    }
    return amt;
  }
}
