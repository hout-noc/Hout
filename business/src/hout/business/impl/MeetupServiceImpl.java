package hout.business.impl;

import hout.business.MeetupService;
import hout.business.dao.MeetupDao;

public class MeetupServiceImpl implements MeetupService {

    private MeetupDao meetupDao;

    @Override
    public void removeInvitee(long meetupId, long userId) {
        meetupDao.getMeetupById(meetupId).getInviteeStatus().remove(userId);
    }
}
