public class Film {
    public static void main(String[] args){

        // Création des films
        Film film1 = new Film("Titanic", "Un bateau qui coule", new Date());
        Film film2 = new Film("Inception", "Un voyage dans les rêves", new Date());
        System.out.println("Films created: " + film1 + ", " + film2);

// Ajout des films au cinéma
        cinema.addFilm(film1);
        cinema.addFilm(film2);
        System.out.println("Films added to the cinema.");

    }
}
