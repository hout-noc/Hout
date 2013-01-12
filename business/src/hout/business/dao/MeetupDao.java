package hout.business.dao;

import entities.Meetup;
import java.util.List;

public interface MeetupDao {

    public void removeMeetupById(long id);

    public void removeMeetup(Meetup user);

    public List<Meetup> getAllMeetups();

    public Meetup getMeetupById(long id);

    public void save(Meetup user);
}
