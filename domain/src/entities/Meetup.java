package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Meetup implements Serializable {

    long id;

    String description;

    Venue finalizedLocation;

    Date finalizedDate;

    List<Suggestions> suggestions;

    Map<java.lang.Long, Status> inviteeStatus;

    List<String> pictureLocations;

    boolean isFacebookSharing;

    boolean isTwitterSharing;

    public Meetup()  {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Venue getFinalizedLocation() {
        return finalizedLocation;
    }

    public void setFinalizedLocation(Venue finalizedLocation) {
        this.finalizedLocation = finalizedLocation;
    }

    public Date getFinalizedDate() {
        return finalizedDate;
    }

    public void setFinalizedDate(Date finalizedDate) {
        this.finalizedDate = finalizedDate;
    }

    public List<Suggestions> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<Suggestions> suggestions) {
        this.suggestions = suggestions;
    }

    public Map<java.lang.Long, Status> getInviteeStatus() {
        return inviteeStatus;
    }

    public void setInviteeStatus(Map<java.lang.Long, Status> inviteeStatus) {
        this.inviteeStatus = inviteeStatus;
    }

    public List<String> getPictureLocations() {
        return pictureLocations;
    }

    public void setPictureLocations(List<String> pictureLocations) {
        this.pictureLocations = pictureLocations;
    }

    public boolean isFacebookSharing() {
        return isFacebookSharing;
    }

    public void setFacebookSharing(boolean facebookSharing) {
        isFacebookSharing = facebookSharing;
    }

    public boolean isTwitterSharing() {
        return isTwitterSharing;
    }

    public void setTwitterSharing(boolean twitterSharing) {
        isTwitterSharing = twitterSharing;
    }



}
