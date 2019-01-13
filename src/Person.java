public class Person {
    static int counter = 0;
    int count = 0;
    String firstName = "Sameera";
    String lastName = "sameer ";
    String address = "Amman";
    int dateOfBirth = 1980;
    String nationality = "Jordanian";
    String city = "Amman";
    int weight = 50;
    int height = 165;
    Boolean isMale = true;


    public Person() {
        this.counter++;
    }

    public Person(int a, String b,String c, String d, int e, String f, String g,int h,int i, Boolean j ){
         count = a;
         firstName = b;
         lastName = c;
         address = d;
         dateOfBirth = e;
         nationality = f;
         city = g;
         weight = h ;
         height = i;
         isMale = j;
        this.counter++;
    }

    public String getFullName(){
        return firstName+lastName ;
    }

    public double getHeightInFeet(){
        return height * 0.0328084;
    }
    public int getAge(){
        return 2019 - dateOfBirth;
    }
    public int eating(){
        return weight + 1;
    }
    public String getInfo(){
        return firstName+ " " + lastName + " " + address + " " + dateOfBirth + " " + nationality+ " "  + city + " "  + weight+ " "  + height+ " "  + isMale;
    }
}
