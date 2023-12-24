package lesson_05.homework_08;

import java.util.List;

public interface SubscriberService {
    List<Subscriber> getSubscribersWithCityCallDurationAbove(int duration);

    List<Subscriber> getSubscribersWithInterCityCalls();

    List<Subscriber> getSubscribersByLastNameStartLetter(String letter);

    double getTotalInternetTrafficByCity(String city);

    int getNumberOfSubscribersWithNegativeBalance();
}
