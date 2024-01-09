
class StudentInfo{
  private int id;
  private String name = "Fayaz";
  
  public StudentInfo(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
}

public class FirstJava{
  public static void main(String[] args){

  StudentInfo si = new StudentInfo(21, "Fayaz");
  System.out.println(si.getId());
  
  
}

}
