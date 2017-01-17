public class HospitalManager {

    private Patient firstPatient = null;
    
    public void addPatient(Patient newPatient) {
        System.out.println("Adding: " + newPatient.getName());
        
        if (firstPatient == null) {
            firstPatient = newPatient;
            return;
        }
        
        Patient currentPatient = firstPatient;
        while (currentPatient.getNext() != null) {
            currentPatient = currentPatient.getNext();
        }
        
        currentPatient.setNext(newPatient);
        System.out.println("Patient added: " + currentPatient.getNext().getName());
    }
    
    public void display() {
        Patient currentPatient = firstPatient;
    
        while (currentPatient.getNext() != null) {
            System.out.println("Name: " + currentPatient.getName());
            currentPatient = currentPatient.getNext();
            
        }
        System.out.println("Name: " + currentPatient.getName());
    }
}
