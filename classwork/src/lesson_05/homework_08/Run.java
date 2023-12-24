package lesson_05.homework_08;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Subscriber> subscribers = new ArrayList<>();
        subscribers.add(new Subscriber(1, "Сміт", "Джон", "New York", "65464", 54646, -1, 15, 0, 1));
        subscribers.add(new Subscriber(1, "Smith", "John", "New York", "65464", 54646, 15, 15, 6, 3));

        SubscriberServiceImpl subscriberService = new SubscriberServiceImpl(subscribers);

        System.out.println(subscriberService.getSubscribersWithCityCallDurationAbove(14));
        System.out.println("--------------------");
        System.out.println(subscriberService.getSubscribersWithInterCityCalls());
        System.out.println("--------------------");
        System.out.println(subscriberService.getSubscribersByLastNameStartLetter("S"));
        System.out.println("--------------------");
        System.out.println(subscriberService.getTotalInternetTrafficByCity("New York"));
        System.out.println("--------------------");
        System.out.println(subscriberService.getNumberOfSubscribersWithNegativeBalance());


    }


}
//1,"Сміт", "Джон", "Нью-йорк",65464, 54646, 130, 15, 5, 1