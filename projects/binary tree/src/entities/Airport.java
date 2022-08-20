package entities;

public class Airport implements Comparable<Airport>{
  
  private String airportName;
  private String location;
  private int waitingIndex;

  public Airport() {
  }
  
  public Airport(String airportName, String location, int waitingIndex) {
    this.airportName = airportName;
    this.location = location;
    this.waitingIndex = waitingIndex;
  }

  public String getAirportName() {
    return airportName;
  }

  public void setAirportName(String airportName) {
    this.airportName = airportName;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public int getWaitingIndex() {
    return waitingIndex;
  }

  public void setWaitingIndex(int waitingIndex) {
    this.waitingIndex = waitingIndex;
  }

  @Override
  public String toString() {
    String aux = "AIRPORT : " + airportName + "\n"
                + "LOCATION : " + location + "\n"
                + "WAITING INDEX : " + waitingIndex;
    return aux;
  }

  @Override
  public int compareTo(Airport other) {
    
    int result = Integer.compare(this.waitingIndex, other.waitingIndex);

    if( result > 0 ) {
      return -1;
    } else if ( result < 0 ) {
      return 1;
    } else return 0;
  }

}
