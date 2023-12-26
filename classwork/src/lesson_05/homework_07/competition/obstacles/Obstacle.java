package lesson_05.homework_07.competition.obstacles;

import lesson_05.homework_07.competition.participants.Participant;

public class Obstacle {
    public void overcome(Participant participant, String obstacleName, int value) {
        System.out.println(participant.getName() + " спробував подолати перешкоду [" + obstacleName +
                "] розміром [" + value + "]");
    }
}
