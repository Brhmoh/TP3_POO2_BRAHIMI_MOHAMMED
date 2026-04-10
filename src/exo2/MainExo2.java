package exo2;
public class MainExo2 {
    public static void main(String[] args) throws Exception {
        
        MiniInspecteur.inspecter(CompteUtilisateur.class);

        
        Class<?> cls = Class.forName("exo2.CompteUtilisateur");
        CompteUtilisateur c = (CompteUtilisateur) cls.getDeclaredConstructor(String.class).newInstance("Alice");
        System.out.println("\nObjet créé : " + c);

        
        MiniInspecteur.modifierPrive(c, "nom", "Alice_Modifiée");
        System.out.println("Après modification réflexive : " + c);
        
       
        cls.getMethod("activer").invoke(c);
    }
}
