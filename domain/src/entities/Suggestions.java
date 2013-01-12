package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Suggestions implements Serializable {

    Venue location;

    Date date;

    List<Meetup> acceptedUserIds;

    List<Meetup> rejectedUserIds;

    public Venue getLocation() {
        return location;
    }

    public void setLocation(Venue location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Meetup> getAcceptedUserIds() {
        return acceptedUserIds;
    }

    public void setAcceptedUserIds(List<Meetup> acceptedUserIds) {
        this.acceptedUserIds = acceptedUserIds;
    }

    public List<Meetup> getRejectedUserIds() {
        return rejectedUserIds;
    }

    public void setRejectedUserIds(List<Meetup> rejectedUserIds) {
        this.rejectedUserIds = rejectedUserIds;
    }
}
