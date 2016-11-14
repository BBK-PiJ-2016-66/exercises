public class Supermarket {
    private PersonQueue queue;
    
    public void Supermarket(PersonQueue queue) {
        this.queue = queue;
    }
    
    public void addPerson(Person person) {
        this.queue.insert(person);
    }
    
    public Person servePerson() {
        return this.queue.retrieve();
    }
}
