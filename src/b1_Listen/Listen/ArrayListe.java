package b1_Listen.Listen;

import java.util.ArrayList;

public class ArrayListe {

    public static void main(String[] args) {
        
            // ArrayListe erstellen
 ArrayList<Integer> primzahlen = new ArrayList<>();

 // Objekte hinzufügen
 primzahlen.add(2);
 primzahlen.add(3);
 primzahlen.add(5);

 // Liste ausgeben
 System.out.println(primzahlen);

 // Objekt entfernen
 primzahlen.remove(2);

 // Über Liste iterieren
 for (Integer i : primzahlen) {
            System.out.println(i);
  }

  //prüfen ob Werte in Liste sind
  System.out.println(primzahlen.contains(3));

    }
    
}
