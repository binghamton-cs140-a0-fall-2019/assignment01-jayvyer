package assignment01;

public class SimpleDate {
  private int year;
  private int month;
  private int day;

  public static SimpleDate of(int yr, int m, int d){
    var returnValue = new SimpleDate();
    returnValue.year = yr;
    returnValue.month = m;
    returnValue.day = d;
    return returnValue;
  }

  public boolean before(SimpleDate other){
    if(this.year != other.year){
      return (this.year < other.year);
    } else if ((this.month != other.month)){
      return (this.month < other.month);
    } else {
      return false;
    }
  }
}
