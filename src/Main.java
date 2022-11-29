import ui.UiMenu;

public class Main { //El método main es el punto de entrada de nuestra aplicación
    public static void main(String[] args) {
        //Método constructor:
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
        //Una clase es totalmente distinta a un objeto

        //Mostrar menú UI
        UiMenu.showMenu();
    }
}