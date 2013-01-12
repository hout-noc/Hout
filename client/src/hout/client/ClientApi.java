package hout.client;

import entities.Status;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: akshay
 * Date: 2013-01-12
 * Time: 17:34
 * To change this template use File | Settings | File Templates.
 */
public interface ClientApi {

    public void createNewMeetup(String description, String suggestedLocation, Date suggestedDate, List<Long> contactIds,
                                boolean isFacebookSharing, boolean isTwitterSharing);

    public void createNewUser(String name, String profilePictureLocation, List<Long> contacts);

    public void RVSPToMeetup(long meetupId, Status status);

    public void addNewSuggestion(String suggestedPlace, Date suggestedTime );
}
