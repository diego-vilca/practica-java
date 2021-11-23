
package logica;

public class Flor extends Planta{
    private String colorPetalos;
    private double promPetalos;
    private String colorPistillo;
    private String variedadFlor;
    private String floreceEn;
    
    //constructores

    public Flor() {
        super();
    }

    public Flor(String colorPetalos, double promPetalos, String colorPistillo, String variedadFlor, String floreceEn, String nombre, double altoTallo, String climaIdeal) {
        super(nombre, altoTallo, climaIdeal);
        
        this.colorPetalos = colorPetalos;
        this.promPetalos = promPetalos;
        this.colorPistillo = colorPistillo;
        this.variedadFlor = variedadFlor;
        this.floreceEn = floreceEn;
    }
    
    //getters and setter

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public double getPromPetalos() {
        return promPetalos;
    }

    public void setPromPetalos(double promPetalos) {
        this.promPetalos = promPetalos;
    }

    public String getColorPistillo() {
        return colorPistillo;
    }

    public void setColorPistillo(String colorPistillo) {
        this.colorPistillo = colorPistillo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getFloreceEn() {
        return floreceEn;
    }

    public void setFloreceEn(String floreceEn) {
        this.floreceEn = floreceEn;
    }
    
    //métodos
    @Override
    public String hola(){
        return super.hola() + "a flor!";
    }
    
    //sobrecarga
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append("\ncolor de pétalos: ").append(this.colorPetalos);
        sb.append("\ncantidad promedio de pétalos: ").append(this.promPetalos);
        sb.append("\ncolor del pistillo: ").append(this.colorPistillo);
        sb.append("\nvariedad de la flor: ").append(this.variedadFlor);
        sb.append("\nestación en que florece: ").append(this.floreceEn);
        
        return sb.toString();
    }
    
    
    
}
