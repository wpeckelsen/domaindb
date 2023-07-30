package dk.cs.domaindb.repository;

import dk.cs.domaindb.models.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
