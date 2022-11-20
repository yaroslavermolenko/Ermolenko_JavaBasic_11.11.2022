package homeWork13;

public class Main {

    public static void main(String[] args) {

        PopMusic popGroup = new PopMusic();
        RockMusic rockGroup = new RockMusic();
        ClassicMusic classicGroup = new ClassicMusic();

        MusicStyles[] musicStyles = {popGroup, rockGroup, classicGroup};
        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();

        }
    }
}