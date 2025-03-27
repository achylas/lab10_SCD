public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;


    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void startMovie(String movieName) {
        System.out.println("\n Starting Movie: " + movieName + "...\n");
        dvdPlayer.turnOn();
        dvdPlayer.playMovie(movieName);
        projector.turnOn();
        projector.setInput("DVD Player");
        soundSystem.turnOn();
        soundSystem.setVolume(10);
        System.out.println("Enjoy your movie! \n");
    }

    public void stopMovie() {
        System.out.println("\nStopping Movie...\n");
        dvdPlayer.turnOff();
        projector.turnOff();
        soundSystem.turnOff();
        System.out.println("Movie stopped. Have a great day! \n");
    }
}
