package co.tinode.tinodesdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Container for a generic invitation.
 */
public class Invitation<Pu,T> implements Serializable {

    // Topic that user wants to subscribe to or is invited to
    public String topic;
    // User being subscribed
    public String user;
    // Public data of the acting user, could be null
    @JsonProperty("public")
    public Pu pub;
    // Type of this invite - InvJoin, InvAppr
    public String act;
    // Current state of the access mode
    public Acs acs;
    // Free-form payload
    public T info;

    public Invitation() {}
}
