# TP3_POO2_BRAHIMI_MOHAMMED
Rapport TP 3 : Généricité et Réflexivité

Brahimi Mohammed
Date : 11 Avril 2026


Exercice 1 : Généricité
Objectif : Créer un dépôt (`Depot<T>`) capable de gérer des ressources pédagogiques de manière générique.

Ce que j'ai réalisé :
- Interface `Identifiable` : Pour imposer un ID à chaque ressource.
- Classes `Livre` et `VideoCours` : Implémentent l'interface.
- Classe `Depot<T extends Identifiable>` : Permet d'ajouter, rechercher et supprimer des objets sans connaître leur type à l'avance.


Exercice 2 : Réflexivité
Objectif : Inspecter une classe et modifier ses données privées sans utiliser les méthodes classiques.

Ce que j'ai réalisé :
- Classe `MiniInspecteur` : Utilise `java.lang.reflect` pour lister les méthodes et attributs.
- Manipulation dynamique : Création d'un objet via `newInstance()` et modification d'un champ `private` via `setAccessible(true)`.



Conclusion :
Ce TP m'a permis de comprendre comment la  ( Généricité ) rend le code plus sûr et réutilisable, et comment la ( Réflexivité ) permet aux frameworks (comme Spring) de manipuler des objets de manière dynamique.
