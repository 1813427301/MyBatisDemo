package entriy;



import java.util.List;

/**
 * User的Dao接口
 */
public interface UserMapper {
    int create(User user);
    int update(User user);
    int delete(int id);
    User findById(int id);
    List<User> findAll();
}
