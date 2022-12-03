import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //ATRIBUTO ÜNICO
    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setAvailableAppointments(ArrayList<AvailableAppointment> availableAppointments) {
        this.availableAppointments = availableAppointments;
    }

    //Método contructor:
    Doctor(String name, String speciality, String email){
        super(name, email);
        System.out.println("El nombre del Doctor es: " + name + " y su especialidad es: " + speciality);
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        //Available appointment
        private Date date;
        private String time;
        private int id;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }
        public int getId(){
            return id;
        }
        public void setId(int id){
            this.id = id;
        }

        //Getter & Setter Date
        public Date getDate(){
            return date;
        }
        public void setDate(Date date){
            this.date = date;
        }

        //Getter & Setter Time
        public String getTime(){
            return time;
        }
        public void setTime(){
            this.time = time;
        }
    }
}
