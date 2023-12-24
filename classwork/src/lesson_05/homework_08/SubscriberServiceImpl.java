package lesson_05.homework_08;

import java.util.ArrayList;
import java.util.List;
public class SubscriberServiceImpl implements SubscriberService {
    private List<Subscriber> subscribers;

    public SubscriberServiceImpl(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public List<Subscriber> getSubscribersWithCityCallDurationAbove(int duration) {
        List<Subscriber> result = new ArrayList<>();
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCityCallDuration() > duration) {
                result.add(subscriber);
            }
        }
        return result;
    }

    @Override
    public List<Subscriber> getSubscribersWithInterCityCalls() {
        List<Subscriber> result = new ArrayList<>();
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getInterCityCallDuration() > 0) {
                result.add(subscriber);
            }
        }
        return result;
    }

    @Override
    public List<Subscriber> getSubscribersByLastNameStartLetter(String letter) {
        List<Subscriber> result = new ArrayList<>();
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getLastName().startsWith(letter) ) {
                result.add(subscriber);
            }
        }
        return result;
    }

    @Override
    public double getTotalInternetTrafficByCity(String city) {
        double totalTraffic = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getCity().equalsIgnoreCase(city)) {
                totalTraffic += subscriber.getInternetTraffic();
            }
        }
        return totalTraffic;
    }

    @Override
    public int getNumberOfSubscribersWithNegativeBalance() {
        int count = 0;
        for (Subscriber subscriber : subscribers) {
            if (subscriber.getBalance() < 0) {
                count++;
            }
        }
        return count;
    }
}
