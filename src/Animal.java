public class Animal {

    public String Nom= "";
    public String Description=" ";

    public  String  getNom(){
        return Nom;
    }

    public void SetNom(String nom){
        this.Nom=nom;

    }

    public void  tostring(){
        System.out.println("Je suis "+ this.Nom);
    }


    public void son(String son){
        System.out.println("Je suis "+ this.Nom +" et je fais "+son);
    }


}

