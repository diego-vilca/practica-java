
public class Mueble {
    //atributos
    private String nombre;
    private double alto;
    private double ancho;
    private String material;
    private int cantidad;
    
    //constructores
    public Mueble(){
        
    }
    
    public Mueble(String nombre, double alto, double ancho, String material, int cantidad){
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
        this.material = material;
        this.cantidad = cantidad;
    }
    
    //getters and setters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getMaterial(){
        return this.material;
    }
    
    public void setMaterial(String material){
        this.material = material;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nnombre: "+ this.nombre);
        sb.append("\nmaterial: " + this.material);
        
        return sb.toString();
    }
    
    
    
}
