package com.dwk.sample.user.persistence.impl;

import java.util.List;
import java.util.UUID;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.dwk.sample.user.model.AppUser;
import com.dwk.sample.user.persistence.api.AppUserRemote;

@Stateless
public class AppUserBean implements AppUserRemote {

    @PersistenceContext // (unitName = "dwk-sample-app-ds")
    EntityManager em;

    @Override
    public AppUser getAppUser(final UUID uuid) {
        return uuid == null ? null : em.find(AppUser.class, uuid);
    }

    @Override
    public UUID saveUser(final AppUser appUser) {
        final AppUser newUser = em.merge(appUser);
        return newUser == null ? null : newUser.getAppUserId();
    }

    @Override
    public void deleteUser(final UUID uuid) {
        final AppUser user = getAppUser(uuid);
        if (user != null)
            em.remove(user);
    }

    @Override
    public List<AppUser> getAllUsers() {
        final TypedQuery<AppUser> query = (TypedQuery<AppUser>) em.createQuery("select a from AppUser a");
        return query.getResultList();
    }

}
