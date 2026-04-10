package exo1;

public class MainExo1 {
    public static void main(String[] args) {
        
        Depot<Livre> depotLivres = new Depot<>();
        depotLivres.ajouter(new Livre("L1", "Java pour les nuls"));
        depotLivres.ajouter(new Livre("L2", "Design Patterns"));

        
        Depot<VideoCours> depotVideos = new Depot<>();
        depotVideos.ajouter(new VideoCours("V1", "Cours Généricité", "Dr. Khelifati"));

        System.out.println(" CONTENU DU DEPOT DE LIVRES ");
        depotLivres.afficherTous();

        System.out.println("\n RECHERCHE DU LIVRE L1 ");
        Livre livreTrouve = depotLivres.rechercherParId("L1");
        System.out.println("Résultat : " + livreTrouve);

        System.out.println("\n SUPPRESSION DU LIVRE L2 ");
        depotLivres.supprimerParId("L2");
        depotLivres.afficherTous();

        System.out.println("\n CONTENU DU DEPOT DE VIDEOS ");
        depotVideos.afficherTous();
    }
}

