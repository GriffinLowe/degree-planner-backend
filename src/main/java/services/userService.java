import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import repositories.UserRepository;
import models.User;

@Service
public class UserService {

    private final UserRepository userRepo;

    @Autowired
    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public void saveUser(User user) {
        userRepo.save(user);
    }

    public void deleteUser(String userID) {
        userRepo.deleteById(userID);
    }

    public Optional<User> getUser(String userID) {
        return userRepo.findById(userID);
    }
}
