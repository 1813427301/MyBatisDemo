package entriy;

import java.util.List;

public interface AddressMapper {
    List<Address> findAll();
    List<Address> findAllByJoin();
    List<Address> findAllBySubSelect();
}
