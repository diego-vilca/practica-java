
public class Fruta {
    private String nombre;
    private String color;
    private int calorias;
    private String tipoCascara;
    private boolean esComestible;

    //constructores
    public Fruta() {
    }

    public Fruta(String nombre, String color, int calorias, String tipoCascara, boolean esComestible) {
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
        this.tipoCascara = tipoCascara;
        this.esComestible = esComestible;
    }
    
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getTipoCascara() {
        return tipoCascara;
    }

    public void setTipoCascara(String tipoCascara) {
        this.tipoCascara = tipoCascara;
    }

    public boolean isEsComestible() {
        return esComestible;
    }

    public void setEsComestible(boolean esComestible) {
        this.esComestible = esComestible;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nnombre: ").append(this.nombre);
        sb.append("\ncolor: ").append(this.color);
        sb.append("\ncalorias: ").append(this.calorias);
        sb.append("\ntipo de cascara: ").append(this.tipoCascara);
        sb.append("\nes comestible: ").append(this.esComestible ? "si" : "no");
        
        return sb.toString();
    }
    
}
