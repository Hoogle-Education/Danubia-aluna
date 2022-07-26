public class Project {
  
  private String name;
  private int duration; // mandatory state
  private int people;

  public Project(String name, int duration, int people) {
    this.name = name;
    this.duration = duration;
    this.people = people;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public int getPeople() {
    return people;
  }

  public void setPeople(int people) {
    this.people = people;
  }

  @Override
  public String toString(){
    return "Name: " + name
            + "\nDuration: " + duration
            + " || Amount of People: " + people;
  }

}
