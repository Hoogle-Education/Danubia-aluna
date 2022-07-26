package entities;

public class PlateChecker {
  
  // atributos
  private String plate;
  private boolean isValid;

  // construtores com sobrecargas
  public PlateChecker(String plate) {
    this.plate = plate;

    // fill the validation
    setPlate(plate);   // reusing set plate validation  
  }

  // getter and setter
  public boolean getPlate() {
    return isValid;
  }
  
  
  public void setPlate(String plate) {
    this.plate = plate;
    
    if(checkPlate(plate)) isValid = true;
    else isValid = false;
  }

  // métodos - adicionar recursos
  public boolean checkPlate(String plate){
    String[] plateSplited = plate.split("-");
    String field1 = plateSplited[0], field2 = plateSplited[1], field3 = plateSplited[2];

    // number checking and size number checking
    if(!isNumeric(field1) || field1.length() != 3) 
      return false;

    // validating text upper case and list of valid states
    if(!isValidState(field2) || !field2.toUpperCase().equals(field2)) 
      return false;

    // validating digits and hpw many last digits
    if(!isNumeric(field3) || field3.length() > 6 || field3.length() < 1)
      return false;

    return true;
  }

  // boolean - true or false
  private boolean isNumeric(String number){

    for(int i=0; i<number.length(); i++){
      char c = number.charAt(i);

      boolean thisCharIsNumeric;
      switch (c) {
        case '0': case '1': case '2':
        case '3': case '4': case '5':
        case '6': case '7': case '8':
        case '9':
          thisCharIsNumeric = true;
          break;
        default:
          thisCharIsNumeric = false;
          break;
      }

      if(!thisCharIsNumeric) return false;

    }

    return true;
  }

  private boolean isValidState(String state){
    switch (state) {
      case "CK": case "CE": case "CN":
      case "CW": case "DN": case "DL":
      case "GY": case "KE": case "KK":
      case "KY": case "LK": case "LD":
      case "LH": case "LM": case "LS":
      case "MH": case "MN": case "MO":
      case "OY": case "RN": case "SO":
      case "TY": case "WD": case "WH":
      case "WX":case "WW":
        return true;      
      default:
        return false;
    }
  }

}
