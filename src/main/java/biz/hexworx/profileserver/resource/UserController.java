package biz.hexworx.profileserver.resource;

import biz.hexworx.profileserver.model.User;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class UserController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/register")
    public User getUser(@RequestParam(value="name", required = true) String name,
                        @RequestParam(value="password", required = true) String password){

        return new User(counter.incrementAndGet(), name, password);
    }


}
