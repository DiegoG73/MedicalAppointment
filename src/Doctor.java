public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    //Método contructor:
    Doctor(){
        System.out.println("Construyendo el método Doctor");
        id++;
    }
    Doctor(String name){
        System.out.println("El nombre del Doctor es: " + name);
    }

    //Comportamientos:
    public void showName(){
        System.out.println(name);
    }
    //ID
    public void showId(){
        System.out.println("Doctor ID: " + id);
    }
}
