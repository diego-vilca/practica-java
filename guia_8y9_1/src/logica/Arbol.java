
package logica;

public class Arbol extends Planta{
    private String variedad;
    private String tipoTronco;
    private double radioTronco;
    private String color;
    private String tipoHoja;
    
    //constructores
    
    public Arbol(){
        super();
    }

    public Arbol(String variedad, String tipoTronco, String color, String tipoHoja, String nombre, double altoTallo, String climaIdeal) {
        super(nombre, altoTallo, climaIdeal);
        
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.color = color;
        this.tipoHoja = tipoHoja;
    }
    
    //getters and setters

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHoja() {
        return tipoHoja;
    }

    public void setTipoHoja(String tipoHoja) {
        this.tipoHoja = tipoHoja;
    }

    public double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
    }
    
    //métodos
    @Override
    public String hola(){
        return super.hola() + " árbol!";
    }
    
    
    //sobrecarga
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append("\nvariedad: ").append(this.variedad);
        sb.append("\ntipo de tronco: ").append(this.tipoTronco);
        sb.append("\nradio del tronco: ").append(this.radioTronco);
        sb.append("\ncolor: ").append(this.color);
        sb.append("\ntipo de hojas: ").append(this.tipoHoja);
        
        return sb.toString();
    }
    
    
   
}
