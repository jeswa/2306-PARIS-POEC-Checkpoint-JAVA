public class Reservation {
    // Réservation par le client
    String place = "A1";

    Reservation reservation1 = client1.reserve(seance1, salle1, place);
        if (reservation1 != null) {
        System.out.println("Reservation made by client: " + reservation1);
    }
        else {
        System.out.println("Reservation failed. The seance is full.");
    }
}
