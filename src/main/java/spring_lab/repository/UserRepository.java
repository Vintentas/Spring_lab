package spring_lab.repository;

import org.springframework.stereotype.Component;
import spring_lab.model.User;

import java.awt.image.renderable.ParameterBlock;
import java.util.List;

@Component
public class UserRepository {

    private List<User> users;

    public List<User> getAll(){
        setUsers();
        return  users;
    }

    private void setUsers(){
        User user = new User(1,"Pavel","Petrov");
        user.addOrder("order123");
        users.add(user);

        user = new User(2,"Anna","Serova");
        user.addOrder("order151");
        user.addOrder("order154");
        users.add(user);

        user = new User(3,"Alex","");
        user.addOrder("order114");
        user.addOrder("order115");
        user.addOrder("order116");
        users.add(user);

        user = new User(4,"Viktoria","Orlova");
        users.add(user);

        user = new User(5,"Anton","");
        user.addOrder("order176");
        user.addOrder("order177");
        users.add(user);

    }
}
