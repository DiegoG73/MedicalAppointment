public class Patient extends User{
    //Atributos únicos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        super(name, email);
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    //Que el método get me devuelva la unidad de medida predefinida SIEMPRE: Las reglas de negocio van en las clases que no sean Main
    public String getWeight(){
        return this.weight + "Kg";
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getHeight(){
        return this.height + "Mts";
    }
}
