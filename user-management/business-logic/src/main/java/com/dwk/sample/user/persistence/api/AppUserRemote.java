package com.dwk.sample.user.persistence.api;

import java.util.List;
import java.util.UUID;

import javax.ejb.Remote;

import com.dwk.sample.user.model.AppUser;

@Remote
public interface AppUserRemote {

    AppUser getAppUser(UUID uuid);

    UUID saveUser(AppUser appUser);

    void deleteUser(UUID uuid);

    List<AppUser> getAllUsers();

}
