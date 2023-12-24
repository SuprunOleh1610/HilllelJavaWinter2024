package lesson_05.homework_07.Competition.Obstacles;

import lesson_05.homework_07.Competition.Participants.Participant;

public class RunningTrack extends Obstacle {
    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public void overcome(Participant participant) {
        super.overcome(participant, "Бігова Доріжка", length);
        participant.run(length);
    }
}
