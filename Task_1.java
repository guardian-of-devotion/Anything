package Sobes;

public class Task_1 {
    public static void main(String[] args) {
        MyInfo myInfo = new MyInfo("Sarkis", "Kazan","Kazan Federal University","18","89874086753", "11-906");
        System.out.println(myInfo);
    }
    }
 class MyInfo {
    private String name;
    private String myCity;
    private String myUniversity;
    private String age;
    private String myContactNumber;
    private String myGroup;

     MyInfo (String name, String myCity, String myUniversity, String age, String myContactNumber, String myGroup) {

        this.name = name;
        this.myCity = myCity;
        this.myUniversity = myUniversity;
        this.age = age;
        this.myContactNumber = myContactNumber;
        this.myGroup = myGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getMyCity() {
        return myCity;
    }

    public void setMyCity(String myCity) {
        this.myCity = myCity;
    }

    public String getMyUniversity() {
        return myUniversity;
    }

    public void setMyUniversity(String myUniversity) {
        this.myUniversity = myUniversity;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMyContactNumber() {
        return myContactNumber;
    }

    public void setMyContactNumber(String myContactNumber) {
        this.myContactNumber = myContactNumber;
    }

    public String getMyGroup() {
        return myGroup;
    }

    public void setMyGroup(String myGroup) {
        this.myGroup = myGroup;
    }

    @Override
    public String toString() {
        return "Hello! My name is " + name+". " + "I live in " + myCity+". " + "I study at the " + myUniversity+" as a programmer in the Higher School for Information Technology \nand Information Systems in the group " +
                myGroup +".\n"
                + "I'm " + age + " years old." + " If you want to text me, my contact number is: " + myContactNumber +"." + " See you soon! ;)";
    }
}
