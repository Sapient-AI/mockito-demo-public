package demo.mockito;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ReactiveController {

    private final UserService service;

    public ReactiveController(UserService service) {
        this.service = service;
    }

    // Returns a single user by ID (Mono for a single value)
    @GetMapping("/user/{id}")
    public Mono<String> getUserById(@PathVariable("id") String id) {
        User user = service.findById(id);
        return Mono.just("User #" + user);
    }

    // Returns a stream of users (Flux for multiple values)
    @GetMapping(value = "/users", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<User> getAllUsers() {
        List<User> users = service.findAll();
        return Flux.fromIterable(users)
                .delayElements(Duration.ofSeconds(1)); // Simulate streaming data
    }

    // Returns an infinite stream of events with Server-Sent Events (SSE)
    @GetMapping(value = "/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> streamEvents() {
        return Flux.interval(Duration.ofSeconds(1))
                .map(seq -> "Event #" + seq);
    }

    @PostMapping("/create")
    public void create(@RequestBody User userCreate) {
        service.create(userCreate);
    }

    // Returns an item with a delay (Mono with a delay for simulating async behavior)
    @GetMapping("/delayed")
    public Mono<String> getDelayedResponse() {
        return Mono.just("Delayed Response")
                .delayElement(Duration.ofSeconds(2)); // Simulate delay
    }

}