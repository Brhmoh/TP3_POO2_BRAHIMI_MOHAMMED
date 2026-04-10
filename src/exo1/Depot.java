package exo1;

import java.util.ArrayList;
import java.util.List;


public class Depot<T extends Identifiable> {

    private List<T> ressources = new ArrayList<>();

    public void ajouter(T ressource) {
        ressources.add(ressource);
    }

    public void afficherTous() {
        for (T r : ressources) {
            System.out.println(r);
        }
    }

    public T rechercherParId(String id) {
        for (T r : ressources) {
            if (r.getId().equals(id)) {
                return r; 
            }
        }
        return null; 
    }

    public boolean supprimerParId(String id) {
        T cible = rechercherParId(id);
        if (cible != null) {
            ressources.remove(cible);
            return true;
        }
        return false;
    }

    public int taille() {
        return ressources.size();
    }
}
