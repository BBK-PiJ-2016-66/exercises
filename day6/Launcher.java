public class Launcher{
    public static void main (){
        HospitalManager hm = new HospitalManager();    
        Patient p1 = new Patient("John", 23, "Male");
        Patient p2 = new Patient("Tamara", 23, "F");
        Patient p3 = new Patient("Sergei", 45, "M");
        hm.addPatient(p1);
        hm.addPatient(p2);
        hm.addPatient(p3);
        hm.display();
    }
    }
