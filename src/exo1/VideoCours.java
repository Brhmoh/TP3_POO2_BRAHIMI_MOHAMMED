package exo1;


public class VideoCours implements Identifiable {
    private String id;
    private String titre;
    private String enseignant;

    
    public VideoCours(String id, String titre, String enseignant) {
        this.id = id;
        this.titre = titre;
        this.enseignant = enseignant;
    }

    
    @Override
    public String getId() {
        return this.id;
    }

    
    @Override
    public String toString() {
        return "VideoCours [ID=" + id + ", Titre=" + titre + ", Enseignant=" + enseignant + "]";
    }
}
