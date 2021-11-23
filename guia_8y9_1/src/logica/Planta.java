
package logica;

public class Planta {
    private String nombre;
    private double altoTallo;
    private String climaIdeal;
    
    //constructores
    public Planta() {
    }

    public Planta(String nombre, double altoTallo, String climaIdeal) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.climaIdeal = climaIdeal;
    }
    
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
    
    //métodos
    public String hola(){
        return "\nHola soy un";
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nnombre: ").append(this.nombre);
        sb.append("\nalto de tallo: ").append(this.altoTallo);
        sb.append("\nclima ideal: ").append(this.climaIdeal);
        
        return sb.toString();
    }
}
