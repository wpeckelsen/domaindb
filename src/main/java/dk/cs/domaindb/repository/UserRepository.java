package dk.cs.domaindb.repository;

import dk.cs.domaindb.models.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findUserByEmail(String email);
}
