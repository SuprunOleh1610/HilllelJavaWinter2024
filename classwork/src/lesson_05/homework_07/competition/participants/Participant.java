package lesson_05.homework_07.competition.participants;

public class Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean isOvercome = true;


    public Participant(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public boolean isOvercome() {
        return isOvercome;
    }


    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробіг " + distance + " м");
        } else {
            System.out.println(name + " не може пробігти таку велику відстань");
            isOvercome = false;
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " стрибнув на висоту " + height + " м");
        } else {
            System.out.println(name + " не може стрибнути на таку велику висоту");
            isOvercome = false;
        }
    }
}

