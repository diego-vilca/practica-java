
public class Videojuego {
    //atributos
    private String codigo;
    private String titulo;
    private String consola;
    private int cantJugadores;
    private String categoria;
    
    //constructores
    public Videojuego(){
        
    }
    
    public Videojuego(String codigo, String titulo, String consola, int cantJugadores, String categoria){
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantJugadores = cantJugadores;
        this.categoria = categoria;
    }
    
    //getters and setters
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getConsola(){
        return this.consola;
    }
    
    public void setConsola(String consola){
        this.consola = consola;
    }
    
    public int getCantJugadores(){
        return this.cantJugadores;
    }
    
    public void setCantJugadores(int cantJugadores){
        this.cantJugadores = cantJugadores;
    }
    
    public String getCategoria(){
        return this.categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append("\ncodigo: ").append(this.codigo);
        sb.append("\ntítulo: ").append(this.titulo);
        sb.append("\nconsola: ").append(this.consola);
        sb.append("\ncantidad de jugadores: ").append(this.cantJugadores);
        sb.append("\ncategoría: ").append(this.categoria);
        
        return sb.toString();
    }
}   

