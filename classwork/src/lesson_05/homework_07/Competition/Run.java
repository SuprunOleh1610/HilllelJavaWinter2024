package lesson_05.homework_07.Competition;

import lesson_05.homework_07.Competition.Obstacles.Obstacle;
import lesson_05.homework_07.Competition.Obstacles.RunningTrack;
import lesson_05.homework_07.Competition.Obstacles.Wall;
import lesson_05.homework_07.Competition.Participants.Cat;
import lesson_05.homework_07.Competition.Participants.Human;
import lesson_05.homework_07.Competition.Participants.Participant;
import lesson_05.homework_07.Competition.Participants.Robot;

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
