package pl.joannamakalowska.movieLibrary2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/test")
    public Object test() {
        return "I hope it's working now...";
    }
}
