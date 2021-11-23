
public class Principal {

    
    public static void main(String[] args) {
        /*
        //a.
        Auto auto1 = new Auto("silver", "Peugeot", "505", "321654", 4);
        Auto auto2 = new Auto("azul", "Ford", "K", "234567", 2);
        Auto auto3 = new Auto("negro", "Nissan", "Guay", "987987", 5);
        Auto auto4 = new Auto();
        
        //muestro la marca del auto sin parametros
        System.out.println("Marca del auto 4: "+ auto4.getMarca());
        
        //muestro los detalles de los autos con parámetros
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());
        System.out.println(auto3.toString());
        */
        /*
        //b
        Mueble mueble1 = new Mueble("escritorio", 1, 2, "aglomerado", 20);
        Mueble mueble2 = new Mueble("bibliioteca", 2.5, 1.5, "pino", 15);
        Mueble mueble3 = new Mueble("cama", 3, 2, "algarrobo", 10);
        
        //muestro nombre y material de los muebles.
        System.out.println("mueble 1: " + mueble1.getNombre() + " - "+ mueble1.getMaterial());
        System.out.println("mueble 2: " + mueble2.getNombre() + " - "+ mueble2.getMaterial());
        System.out.println("mueble 3: " + mueble3.getNombre() + " - "+ mueble3.getMaterial());
        
        //coloco madera como material de los tres muebles creados.
        mueble1.setMaterial("Madera");
        mueble2.setMaterial("Madera");
        mueble3.setMaterial("Madera");
        
        System.out.println("--------------------------------");
         //muestro nuevamente los muebles (esta vez con el método toString)
         System.out.println(mueble1.toString());
         System.out.println(mueble2.toString());
         System.out.println(mueble3.toString());
        */
        
        //c
        Mascota[] guarderia = new Mascota[5];
        
        Mascota mascota1 = new Mascota("pepito", "gato", "hembra", "marron", "corto", "siames");
        Mascota mascota2 = new Mascota("luna", "perro", "hembra", "colorada", "corto", "breton");
        Mascota mascota3 = new Mascota("lobito", "perro", "macho", "gris", "largo", "huskey");
        Mascota mascota4 = new Mascota("gordo", "perro", "macho", "blanco", "corto", "bulldog");
        Mascota mascota5 = new Mascota("michu", "gato", "hembra", "negro", "largo", "angora");
        
        //cargo el vector con las mascotas.
        guarderia[0] = mascota1;
        guarderia[1] = mascota2;
        guarderia[2] = mascota3;
        guarderia[3] = mascota4;
        guarderia[4] = mascota5;
        
                
        for (int i = 0; i < guarderia.length; i++) {
            
            System.out.println("mascota"+ (i+1));
            System.out.println(guarderia[i].getNombre());
            System.out.println(guarderia[i].getEspecie());
            System.out.println(guarderia[i].getSexo());
            System.out.println();
            
        }
        
        mascota1.setNombre("cachirula");
        mascota4.setNombre("rechoncho");
        
        System.out.println(mascota1.toString());
        System.out.println(mascota4.toString());
        
        System.out.println("-----------------------------------");
        
        for (Mascota mascota : guarderia) {
            if (mascota.getEspecie().equals("perro")) {
                System.out.println(mascota.toString());
            }
        }
        
        
    }
    
}
