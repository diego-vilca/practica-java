
public class Auto {
    //atributos
    private String color;
    private String marca;
    private String modelo;
    private String patente;
    private int cantPuertas;
    
    //constructores
    public Auto(){
        
    }
    
    public Auto(String color, String marca, String modelo, String patente, int cantPuertas){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.cantPuertas = cantPuertas;
    }
    
    //getter and setters
    public String getColor(){
         return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(){
        this.marca = marca;
    }
    
    public String modelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getPatente(){
        return this.patente;
    }
    
    public void setPatente(String patente){
        this.patente = patente;
    }
    
    public int getCantPuertas(){
        return this.cantPuertas;
    }
    
    public void setCantPuertas(int cantPuertas){
        this.cantPuertas = cantPuertas;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nmarca: " + this.marca);
        sb.append("\nmodelo: " + this.modelo);
        sb.append("\npatente: "+ this.patente);
        
        return sb.toString();
    }
    
    
    
}
