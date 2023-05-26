package repo;
import domain.User_;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepo extends JpaRepository<User_, Long>  {

}
