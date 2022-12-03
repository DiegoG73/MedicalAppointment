import java.util.Date;

public class Main { //El método main es el punto de entrada de nuestra aplicación
    public static void main(String[] args) {
        /*//Método constructor:
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println();
        //Doctor myDoctor = new Doctor("Anahí Salgado");
        Doctor myDoctorAnn = new Doctor();
        myDoctorAnn.name = "Anahí Salgado";
        myDoctorAnn.showName();
        myDoctorAnn.showId();
        //Una clase es totalmente distinta a un objeto*/

        //Mostrar menú UI
        //showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "Pediatría");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");
        System.out.println(myDoctor.getAvailableAppointments());
        
        //Así llamamos una clase estática 
        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }


        Patient patient = new Patient("Alina Enokaeva", "alina@enokaeva.com");
        patient.setWeight(60.5);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("65468914");
        System.out.println(patient.getPhoneNumber());
    }
}