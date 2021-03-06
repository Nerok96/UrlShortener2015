package urlshortener2015.eerieblack.repository;

import urlshortener2015.eerieblack.domain.User;

import java.util.List;

public interface UserRepository {
    User findByName(String name);
    User save(User user);
    User update(User user);
    User delete(User user);
    List<User> list(Long limit, Long offset);
    User validate(User user);
}
