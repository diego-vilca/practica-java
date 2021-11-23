
public class Mascota {
    private String nombre;
    private String especie;
    private String sexo;
    private String color;
    private String pelaje;
    private String raza;
    
    //constructores

    public Mascota(){
        
    } 
    
    public Mascota(String nombre, String especie, String sexo, String color, String pelaje, String raza) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.color = color;
        this.pelaje = pelaje;
        this.raza = raza;
    }
        
        
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    //sobrecarga método toString
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\nnombre: ").append(this.nombre);
        sb.append("\nespecie: ").append(this.especie);
        sb.append("\nsexo: ").append(this.sexo);
        sb.append("\ncolor: ").append(this.color);
        sb.append("\npelaje: ").append(this.pelaje);
        sb.append("raza: ").append(this.raza);
        
        return sb.toString();
    }
}
