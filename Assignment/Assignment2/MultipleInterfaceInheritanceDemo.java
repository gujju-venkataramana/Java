// First interface
interface Camera {

    void takePhoto();
}

// Second interface
interface MusicPlayer {

    void playMusic();
}

// Interface extends multiple interfaces
interface SmartPhone extends Camera, MusicPlayer {

    void makeCall();
}

// Class implements the child interface
class Mobile implements SmartPhone {

    public void takePhoto() {
        System.out.println("Taking photo");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }

    public void makeCall() {
        System.out.println("Making call");
    }
}

public class MultipleInterfaceInheritanceDemo {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        mobile.takePhoto();
        mobile.playMusic();
        mobile.makeCall();
    }
}