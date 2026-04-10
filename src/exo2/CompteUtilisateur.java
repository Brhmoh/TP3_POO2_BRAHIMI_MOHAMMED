package exo2;
public class CompteUtilisateur {
    private String nom;
    private boolean actif = false;

    public CompteUtilisateur() { this.nom = "Inconnu"; }
    public CompteUtilisateur(String nom) { this.nom = nom; }
    
    public void activer() { this.actif = true; System.out.println("Compte activé !"); }
    public String toString() { return "Compte [Nom=" + nom + ", Actif=" + actif + "]"; }
}
