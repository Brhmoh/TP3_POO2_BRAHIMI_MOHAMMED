package exo1;

public class Livre implements Identifiable {
    private String id;
    private String titre;

    public Livre(String id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Livre [ID=" + id + ", Titre=" + titre + "]";
    }
}
