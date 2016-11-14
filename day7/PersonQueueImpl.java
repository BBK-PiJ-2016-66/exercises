/**
 * Implementation of PersonQueue interface.
 */
public class PersonQueueImpl implements PersonQueue {
    private Person current;
    
    /**
     * Adds another person to the queue.
     */
    void insert(Person person) {
        if (this.current == null) {
            this.current = person;
        } else {
            Person next = this.current;
            while (!next.isLast()) {
                next = next.getNext();
            }
            next.setNext(person);
        }
    }
    
    /**
     * Removes a person from the queue.
     */
    Person retrieve() {
        if (this.current == null) {
            return null;
        }
        
        Person person = this.current;
        
        while (!person.isFirst()) {
            person = person.getPrevious();
        }
        
        return person;
    }

}
