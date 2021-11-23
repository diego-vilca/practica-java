
public class Principal {

    public static void main(String[] args) {
        /*
        Videojuego[] biblioSteam = new Videojuego[5];
        
        Videojuego juego1 = new Videojuego("1234", "dawn of war", "pc", 2, "rts");
        Videojuego juego2 = new Videojuego("5678", "demons souls", "ps3", 1, "rpg");
        Videojuego juego3 = new Videojuego("9876", "zelda botw", "switch", 1, "mundo abierto");
        Videojuego juego4 = new Videojuego("5467", "mario bros", "famicom", 1, "plataformas");
        Videojuego juego5 = new Videojuego("6723", "wow", "pc", 2, "mmorpg");

        biblioSteam[0] = juego1;
        biblioSteam[1] = juego2;
        biblioSteam[2] = juego3;
        biblioSteam[3] = juego4;
        biblioSteam[4] = juego5;
       
        //muestro por pantalla
        for (int i = 0; i < biblioSteam.length; i++) {
            System.out.println("juego: " + biblioSteam[i].getTitulo());
            System.out.println("consola: " + biblioSteam[i].getConsola());
            System.out.println("cantidad de jugadores: " + biblioSteam[i].getCantJugadores());
            System.out.println();

        }
        
        System.out.println("------------------------------------");
        
        juego2.setTitulo("dark souls");
        juego2.setCantJugadores(2);
        juego3.setTitulo("majoras mask");
        juego3.setCantJugadores(2);
        juego3.setConsola("Nintendo 64");
        
        System.out.println(juego2.toString());
        System.out.println(juego3.toString());
        
        System.out.println("------------------------------------");
        
        for (Videojuego videojuego : biblioSteam) {
            if (videojuego.getConsola().equals("Nintendo 64")) {
                System.out.println(videojuego.toString());
            }
        }
        */
        
        Fruta[] cajon = new Fruta[5];
        
        Fruta fruta1 = new Fruta("manzana", "rojo", 5, "fina", true);
        Fruta fruta2 = new Fruta("naranja", "naranja", 7, "gruesa", true);
        Fruta fruta3 = new Fruta("pera podrida", "amarilla", 2, "fina", false);
        Fruta fruta4 = new Fruta("sandia", "verde", 20, "gruesa", true);
        Fruta fruta5 = new Fruta("uva", "violeta", 2, "fina", true);
        
        cajon[0] = fruta1;
        cajon[1] = fruta2;
        cajon[2] = fruta3;
        cajon[3] = fruta4;
        cajon[4] = fruta5;
        
        for (Fruta fruta : cajon) {
            System.out.println("nombre: " + fruta.getNombre());
            System.out.println("calorías: " + fruta.getCalorias());
            System.out.println();            
        }
        
        System.out.println("----------------------------------------");
        
        fruta5.setColor("verde");
        fruta2.setNombre("durazno");
        fruta2.setColor("naranja");
        fruta2.setCalorias(5);
        fruta2.setTipoCascara("fina");
        fruta2.setEsComestible(true);
        
        for (Fruta fruta : cajon) {
            System.out.println(fruta);
        }
        
        System.out.println("----------------------------------------");
        
        for (Fruta fruta : cajon) {
            if (fruta.getColor().equals("verde")) {
                System.out.println(fruta);
            }
        }
        
    }
    
}
