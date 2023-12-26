package lesson_05.homework_07.competition;

import lesson_05.homework_07.competition.obstacles.Obstacle;
import lesson_05.homework_07.competition.obstacles.RunningTrack;
import lesson_05.homework_07.competition.obstacles.Wall;
import lesson_05.homework_07.competition.participants.Cat;
import lesson_05.homework_07.competition.participants.Human;
import lesson_05.homework_07.competition.participants.Participant;
import lesson_05.homework_07.competition.participants.Robot;

public class Run {
    public static void main(String[] args) {

        Participant[] participants = {
                new Human("John"),
                new Cat("Димок"),
                new Robot("R2D2")
        };

        Obstacle[] obstacles = {
                new RunningTrack(200),
                new Wall(1),
                new RunningTrack(500),
                new Wall(2),
                new RunningTrack(1000),
                new Wall(3)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {

                if (obstacle instanceof RunningTrack) {
                    if(!participant.isOvercome()){
                        break;
                    }
                    ((RunningTrack) obstacle).overcome(participant);
                } else if (obstacle instanceof Wall) {
                    if(!participant.isOvercome()){
                        break;
                    }
                    ((Wall) obstacle).overcome(participant);
                }
            }
        }
    }
}
