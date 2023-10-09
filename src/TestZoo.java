public class TestZoo {

    public static void main(String[] args) {
        Animal Requin1= new  Requin();
        Animal  Chimpanze=new Chimpanze();
        Animal   Requin2=new Requin();
        Zoo Zoo1= new Zoo();

        Zoo1.Ajouter_Animal(Requin1);
        Zoo1.Ajouter_Animal(Chimpanze);
        Zoo1.Ajouter_Animal(Requin2);
        Zoo1.toString();

        Requin1.SetNom("Jaws");
        Chimpanze.SetNom("Cheeta");
        Requin2.SetNom("Ham");

        Requin1.toString();
        Requin1.son("argh");

        Chimpanze.toString();
        Chimpanze.son("hihihi");

        Requin2.toString();
        Requin2.son("argh");

    }
}
