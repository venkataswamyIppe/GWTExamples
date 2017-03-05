package com.gwt.client.service;

import com.gwt.client.model.User;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import java.util.List;

@RemoteServiceRelativePath("userService")
public interface UserService extends RemoteService {

    public List<User> getAllUsers();
    public User getById(long id);
    public void addUser(User user);
    public void deleteUser(User user);

    public static class App {
        private static UserServiceAsync ourInstance = GWT.create(UserService.class);
        public static synchronized UserServiceAsync getInstance() {
            return ourInstance;
        }
    }

}
