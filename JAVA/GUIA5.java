// Abstracción de una clase
class AbstractAnimal {
    public void sonido() {
        System.out.println("Haciendo sonido genérico...");
    }
}

//Polimorfismo desde abstracción
class AbstractPerro extends AbstractAnimal {
    @Override
    public void sonido() {
        System.out.println("Ladrando...");
    }
}

class AbstractGato extends AbstractAnimal {
    @Override
    public void sonido() {
        System.out.println("Maullando...");
    }
}

// Interfaz
interface Volador {
    void volar();
}

// Clase que implementa la interfaz
class Ave implements Volador {
    @Override
    public void volar() {
        System.out.println("Volando...");
    }
}

public class GUIA5{
    public static void main(String args[]){
        //Creación de objetos abstractos
        AbstractAnimal animal = new AbstractAnimal();

        //Casting de tipos explicito e implicito
        AbstractAnimal perro = new AbstractPerro(); //Implicito
        AbstractAnimal animalGato = new AbstractGato();
        AbstractGato gato = (AbstractGato) animalGato; //Explicito

        //Implementación de polimorfismo
        animal.sonido();
        perro.sonido();
        gato.sonido();

        //Creación de objeto de interfaz
        Ave ave = new Ave();
        ave.volar();
    }
}