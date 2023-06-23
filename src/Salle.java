import java.util.*;
public class Salle {
    // Création des place
    List<String> places = new ArrayList<>();
    String[] rows = {"A", "B", "C", "D", "E", "F", "G"};
    int i=1;
        for(String row : rows) {
        for(int i = 1; i <= 10; i++) {
            places.add(row + i);
        }
    }
    Salle salle1 = new Salle(70, places);
    Salle salle2 = new Salle(70, places);
        System.out.println("Salles created: " + salle1 + ", " + salle2);



}
