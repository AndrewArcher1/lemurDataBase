package lemurdatabase;

public class Mammal {
  private int itsAge;
  private int itsWeight;
  private String breed;
 private String gender;
  public Mammal() {
    itsAge = 2;
    itsWeight = 5;
    gender ="";
  }

  public int getAge() {
    return itsAge;
  }
public String getGender() {
    return gender;
}
public int getWeight() {
    return itsWeight;
  }

  public void setAge(int newAge) {
    itsAge = newAge;
  }
public void setGenger(String newgender){
    gender=newgender;
}
  public void setWeight(int newWeight) {
    itsWeight = newWeight;
  }

  public String toString() {
    String output = "Age: " + itsAge + "\n";
            output += "Weight: " + itsWeight + "\n";
           output += "Gender: " + gender + "\n";
//            output += "Breed: " +  + "\n";
//            output += "New aggression " +   + "\n";
//            output += "New hunger "    +     + "\n";
    //output string is complete, return it
    return output;
}

 
}