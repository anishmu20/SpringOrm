package SpringORM.com.service.implement;

import SpringORM.com.entites.User;
import SpringORM.com.repositories.UserRepo;
import SpringORM.com.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImple  implements UserService {

    Logger logger= LoggerFactory.getLogger(UserServiceImple.class);

    @Autowired
    UserRepo userRepo;

    @Override
    public User save(User user) {
        User savedUser = userRepo.save(user);
        logger.info("User Saved {}",savedUser.getId());

        return savedUser;
    }

    @Override
    public List<User> getAll() {

        List<User> all = userRepo.findAll();
        return all;
    }

    @Override
    public User updateUser(User user, int userid) {
        User user1 = userRepo.findById(userid).orElseThrow(() -> new RuntimeException("User not found for given id"));
        user1.setCity(user.getCity());
        user1.setAge(user.getAge());
        user1.setName(user.getName());
        User user2 = userRepo.save(user1);
        return user2;
    }

    @Override
    public User getSingle(int id) {
        Optional<User> byId = userRepo.findById(id);
        User optionalid = byId.orElseThrow(() ->
            new RuntimeException("User id does not Found")
        );

        return optionalid;
    }

    @Override
    public void deleteUser(int id) {
        userRepo.deleteById(id);
        logger.info("User deleted {}",id);
    }
}
