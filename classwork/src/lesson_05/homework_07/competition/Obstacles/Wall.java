package lesson_05.homework_07.competition.Obstacles;

import lesson_05.homework_07.competition.Participants.Participant;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void overcome(Participant participant) {
        super.overcome(participant, "Стіна", height);
        participant.jump(height);
    }
}