import java.util.ArrayList;

public class Zoo {

    String Nom;
    ArrayList<Animal> animaux = new ArrayList<>();
    public void Ajouter_Animal(Animal A){

        animaux.add(A);

    }

    public void tostring(){
        System.out.println("le ZOO contient"+ this.animaux);
    }
}
