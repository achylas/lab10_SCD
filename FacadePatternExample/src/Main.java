public class Main {
    public static void main(String[] args) {
        // Create subsystem instances
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();

        // Create HomeTheaterFacade instance
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

        // Start the movie
        homeTheater.startMovie("Inception");

        // Stop the movie
        homeTheater.stopMovie();
    }
}
