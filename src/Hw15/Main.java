package Hw15;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] groups = {new RockMusic() , new PopMusic() , new ClassicMusic()};

        for (MusicStyles musicStyles : groups) {
            musicStyles.playMusic();
        }

        }
    }

