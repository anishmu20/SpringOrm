package SpringORM.com.service;


import SpringORM.com.entites.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> getAll();

    User updateUser(User user,int id);
    User getSingle(int id);
    void deleteUser(int id);


}
