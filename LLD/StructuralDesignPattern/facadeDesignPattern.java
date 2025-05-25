package StructuralDesignPattern;

class MusicPlayer {

    public void inializeVideoDriver() {
        System.out.println("initialized video driver");
    }

    public void decodeAudio() {
        System.out.println("decoding audio");
    }

    public void startPlayback() {
        System.out.println("starting play back");
    }
}

class VideoPlayer {
    /* same as video player */
}

class ImageViewer {
    /* same as video and audio player */
}

class MusicFacade {
    MusicPlayer musicPlayer;
    VideoPlayer videoPlayer;
    ImageViewer imageViewer;

    MusicFacade() {
        this.musicPlayer = new MusicPlayer();
        this.imageViewer = new ImageViewer();
        this.videoPlayer = new VideoPlayer();
    }

    public void performAction(String action) {
        switch (action.toLowerCase()) {
            case "playmusic":
                this.musicPlayer.inializeVideoDriver();
                this.musicPlayer.decodeAudio();
                this.musicPlayer.startPlayback();
                break;
            case "playvideo":
                /* same as audioplayter */
                break;
            case "viewimage":
                /* same as audio and video player */
                break;
            default:
                System.out.println("Invalid action ");
        }
    }
}

/*
 * readable, maintainable and more modular code, decoupled and can be easily
 * scaled to larger systems
 * main pupose is to break complex things into smaller chunks so that the
 * complexity decrease and coupling reduces
 */
public class facadeDesignPattern {
    public static void main(String[] args) {
        MusicFacade musicFacade = new MusicFacade();
        musicFacade.performAction("playmusic");
    }

}
