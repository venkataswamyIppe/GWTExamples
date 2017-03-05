package com.gwt.client.service;

import com.gwt.client.model.User;
import com.google.gwt.user.client.rpc.AsyncCallback;
import java.util.List;


public interface UserServiceAsync   {

    public void getAllUsers(AsyncCallback<List<User>> callback);
    public void getById(long id, AsyncCallback<User> callback);
    public void deleteUser(User user, AsyncCallback<Void> callback);
    public void addUser(User user, AsyncCallback<Void> asyncCallback);

}
