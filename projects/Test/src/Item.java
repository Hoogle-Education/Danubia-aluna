public class Item {
  
  public String name;
  public int duration; // mandatory state
  public int amount;

  public Item(String name, int duration, int amount) {
    this.name = name;
    this.duration = duration;
    this.amount = amount;
  }

  @Override
  public String toString(){
    return "Name: " + name
            + "\nDuration: " + duration
            + " || Amount: " + amount;
  }

}
