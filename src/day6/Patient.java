public class Patient {

    private String name;
    private int age;
    private String gender;
    private Patient next;
    
    public Patient(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public void setNext(Patient next) {
        this.next = next;
    }
    
    public Patient getNext() {
        return this.next;
    }
}





