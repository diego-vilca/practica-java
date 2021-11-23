
package logica;

public class Arbusto extends Planta{
    private double ancho;
    private boolean esDomestico;
    private String variedad;
    private String colorHojas;
    private boolean sePoda;
    
    //constructores
    public Arbusto(){
        super();
    }

    public Arbusto(double ancho, boolean esDomestico, String variedad, String colorHojas, boolean sePoda, String nombre, double altoTallo, String climaIdeal) {
        super(nombre, altoTallo, climaIdeal);
        
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
        this.sePoda = sePoda;
    }
    
    //getters and setters

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePoda() {
        return sePoda;
    }

    public void setSePoda(boolean sePoda) {
        this.sePoda = sePoda;
    }
    
    //métodos
    @Override
    public String hola(){
        return super.hola() + " arbusto!";
    }
    
    //sobrecarga de métodos
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append("\nancho: ").append(this.ancho);
        sb.append("\nEs doméstico: ").append(this.esDomestico ? "si" : "no");
        sb.append("\nvariedad: ").append(this.variedad);
        sb.append("\nse poda: ").append(this.sePoda ? "si" : "no");
        
        return sb.toString();
    }
    
    
    
    
}
