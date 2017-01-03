package com.dwk.sample.user.ws;

import java.util.List;
import java.util.UUID;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.dwk.sample.user.model.AppUser;
import com.dwk.sample.user.persistence.api.AppUserRemote;

@Path("user")
public class AppUserWS {
    @Context
    private UriInfo context;

    @EJB
    private AppUserRemote aur;

    public AppUserWS() {

    }

    /**
     * Simple example of REST endpoint.
     *
     * @return
     */
    @GET
    @Path("helloDetroit")
    @Produces("text/html")
    public String helloDetroit() {
        return "<html lang\"en\"> <body> <h1> Wat Up Tho!! </h1></body></html> ";
    }

    @POST
    @Path("saveUser")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UUID saveUser(final AppUser user) {
        return aur.saveUser(user);
    }

    @GET
    @Path("getUser")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public AppUser getUser(@QueryParam("uuid") final UUID uuid) {
        return aur.getAppUser(uuid);
    }

    @POST
    @Path("deleteUser")
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteUser(@QueryParam("uuid") final UUID uuid) {
        aur.deleteUser(uuid);
    }

    @GET
    @Path("getAllUsers")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<AppUser> getAllUsers() {
        return aur.getAllUsers();
    }
}
