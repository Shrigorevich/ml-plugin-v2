package org.shrigorevich.ml.domain.services;

import org.shrigorevich.ml.domain.callbacks.IAccessCheckCallback;
import org.shrigorevich.ml.domain.models.User;

import java.util.Optional;

public interface IUserService {
    void accessCheck(String userName, String ip, IAccessCheckCallback cb);

    Optional<User> getFromOnlineList(String name);

    void addInOnlineList(User user);
    void removeFromOnlineList(String name);

}
