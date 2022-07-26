package entities;

import java.util.Random;

public class SecurityCode {
  
  public SecurityCode() {
  }

  public String[] generateCodes(int numberOfCodes){
    
    // list of codes
    String[] codes = new String[numberOfCodes];

    // random generator tool
    Random randGenetor = new Random();

    int pos = 0;
    for(String code : codes){
      code = "";
      
      // generating random digits
      code += Integer.toString(randGenetor.nextInt(10));
      code += Integer.toString(randGenetor.nextInt(10));
      code += Integer.toString(randGenetor.nextInt(10));
      code += Integer.toString(randGenetor.nextInt(10));

      // generating random letters
      code += (char)(Character.valueOf('A') + randGenetor.nextInt(26));
      code += (char)(Character.valueOf('A') + randGenetor.nextInt(26));
      code += (char)(Character.valueOf('A') + randGenetor.nextInt(26));
      // take initial letter and randomize the increment

      codes[pos++] = code;
      // ++a -> primeiro aumenta depois usa na conta
      // a++ -> primeiro usa, depois aumenta
    }

    return codes;
  }

}
