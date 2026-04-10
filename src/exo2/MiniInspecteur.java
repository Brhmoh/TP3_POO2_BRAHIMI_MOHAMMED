package exo2;
import java.lang.reflect.*;

public class MiniInspecteur {
    public static void inspecter(Class<?> cls) {
        System.out.println("Classe : " + cls.getName());
        System.out.println(" Méthodes ");
        for (Method m : cls.getDeclaredMethods()) System.out.println("- " + m.getName());
        System.out.println(" Attributs ");
        for (Field f : cls.getDeclaredFields()) System.out.println("- " + f.getName());
    }

    public static void modifierPrive(Object obj, String champ, Object valeur) throws Exception {
        Field f = obj.getClass().getDeclaredField(champ);
        f.setAccessible(true);
        f.set(obj, valeur);
    }

	
}
