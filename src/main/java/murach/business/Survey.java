package murach.business;

import java.io.Serializable;
import murach.business.User;

public class Survey implements Serializable {
    private User user;
    private String hearAbout;
    private Boolean receiveAnnouncements;
    private Boolean receiveOffers;
    private String contactType;

    public Survey() {
        this.user = new User();
        this.hearAbout = "";
        this.receiveAnnouncements = false;
        this.receiveOffers = false;
        this.contactType = "";
    }

    public Survey(User user, String hearAbout, Boolean receiveAnnouncements, Boolean receiveOffers, String contactType) {
        this.user = user;
        this.hearAbout = hearAbout;
        this.receiveAnnouncements = receiveAnnouncements;
        this.receiveOffers = receiveOffers;
        this.contactType = contactType;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getHearAbout() {
        return hearAbout;
    }
    public void setHearAbout(String hearAbout) {
        this.hearAbout = hearAbout;
    }
    public Boolean getReceiveAnnouncements() {
        return receiveAnnouncements;
    }
    public void setReceiveAnnouncements(Boolean receiveAnnouncements) {
        this.receiveAnnouncements = receiveAnnouncements;
    }
    public Boolean getReceiveOffers() {
        return receiveOffers;
    }
    public void setReceiveOffers(Boolean receiveOffers) {
        this.receiveOffers = receiveOffers;
    }
    public String getContactType() {
        return contactType;
    }
    public void setContactType(String contactType) {
        this.contactType = contactType;
    }
}
