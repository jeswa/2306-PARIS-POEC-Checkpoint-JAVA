public class Seance {
    public static void main(String[] args){
        // Création des séances
        Seance seance1 = new Seance(
                film1,
                new Date(2023, 6,24),
                new Time(19, 55, 00),
                salle1
        );
        Seance seance2 = new Seance(
                film2,
                new Date(2023, 6,24),
                new Time(19, 55, 00),
                salle2
        );
        System.out.println("Seances created: " + seance1 + ", " + seance2);
        // Programmation des séances au cinéma
        cinema.scheduleSeance(film1, new Date(), new Time(), salle1);
        cinema.scheduleSeance(film2, new Date(), new Time(), salle2);
        System.out.println("Seances scheduled in the cinema.");


    }
}
