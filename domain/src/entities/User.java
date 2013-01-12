package entities;


import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    long id;

    String name;

    String profilePictureLocation;

    List<java.lang.Long> contactIds;

    List<Meetup> currentMeetupIds;

    List<Meetup> pastMeetupIds;

    long contactNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProfilePictureLocation() {
        return profilePictureLocation;
    }

    public void setProfilePictureLocation(String profilePictureLocation) {
        this.profilePictureLocation = profilePictureLocation;
    }

    public List<java.lang.Long> getContactIds() {
        return contactIds;
    }

    public void setContactIds(List<java.lang.Long> contactIds) {
        this.contactIds = contactIds;
    }

    public List<Meetup> getCurrentMeetupIds() {
        return currentMeetupIds;
    }

    public void setCurrentMeetupIds(List<Meetup> currentMeetupIds) {
        this.currentMeetupIds = currentMeetupIds;
    }

    public List<Meetup> getPastMeetupIds() {
        return pastMeetupIds;
    }

    public void setPastMeetupIds(List<Meetup> pastMeetupIds) {
        this.pastMeetupIds = pastMeetupIds;
    }


    public void addContact(long contactId) {
        contactIds.add(contactId);
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }


}
