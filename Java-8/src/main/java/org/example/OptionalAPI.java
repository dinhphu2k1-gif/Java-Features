package org.example;

import java.util.Optional;

public class OptionalAPI {
    private class Event{
        private Location getLocation(){
            return new Location();
        }
    }

    private class Location{
        private String getCity(){
            return "HN";
        }
    }

    public String getCityForEvent(int id) {
        // có thể null tại bất kỳ hàm nào
        return getEventWithId(id).getLocation().getCity();
    }

    public String getCityForEventWithCheck(int id) {
        Event event = getEventWithId(id);
        if(event != null) {
            Location location = event.getLocation();
            if(location != null) {
                return location.getCity();
            }
        }
        return "TBC";
    }

    public String getCityForEventWithOptinal(int id) {
        return Optional.ofNullable(getEventWithId(id))
                .map(event -> event.getLocation())
                .map(location -> location.getCity())
                .orElse("TBC");
    }

    private Event getEventWithId(int id) {
        return new Event();
    }
}
