public class Person {
    private String name;
    private Person prev;
    private Person next;
    
    public void Person(String name) {
        this.name = name;
    }
    
    public void setNext(Person person) {
        this.next = person;
    }
    
    public Person getNext() {
        return this.next;
    }
    
    public void setPrevious(Person person) {
        this.prev = person;
    }
    
    public Person getPrevious() {
        return this.prev;
    }
    
    public boolean isFirst()
    {
        return this.prev == null;
    }
    
    public boolean isLast()
    {
        return this.next == null;
    }
}
