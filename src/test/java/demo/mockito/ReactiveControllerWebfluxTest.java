package demo.mockito;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.test.StepVerifier;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.*;

@WebFluxTest(controllers = ReactiveController.class)
public class ReactiveControllerWebfluxTest {

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private UserService userService;

    @Test
    public void testGetUserById() {
        String userId = "123";
        User user = new User();
        user.setId("id");
        doReturn(user).when(userService).findById("123");

        webTestClient.get().uri("/api/user/{id}", userId)
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class)
                .value(body -> body.equals("User #" + user));

        assertAll("result", () -> verify(userService).findById("123"));
    }

    @Test
    public void testGetAllUsers() {

        User user1 = new User();
        User user2 = new User();
        when(userService.findAll()).thenReturn(Arrays.asList(user1, user2));
        webTestClient.get()
                .uri("/api/users")
                .exchange()
                .expectStatus().isOk()
                .returnResult(User.class)
                .getResponseBody()
                .as(StepVerifier::create)
                .expectNext(user1)
                .expectNext(user2)
                .verifyComplete();

        assertAll("result", () -> verify(userService).findAll());
    }

    @Test
    public void testStreamEvents() {
        webTestClient.get().uri("/api/events")
                .exchange()
                .expectStatus().isOk()
                .expectHeader().contentType("text/event-stream;charset=UTF-8")
                .returnResult(String.class)
                .getResponseBody()
                .take(3)
                .as(StepVerifier::create)
                .expectNext("Event #0")
                .expectNext("Event #1")
                .expectNext("Event #2")
                .thenCancel()
                .verify();
    }

    @Test
    void testCreateUser() {
        User newUser = new User();

        webTestClient.post()
                .uri("/api/create")
                .bodyValue(newUser)
                .exchange()
                .expectStatus().isOk();

        assertAll("result", () -> verify(userService).create(newUser));
    }

    @Test
    public void testGetDelayedResponse() {
        webTestClient.get().uri("/api/delayed")
                .exchange()
                .expectStatus().isOk()
                .expectBody(String.class)
                .isEqualTo("Delayed Response");
    }

    @SpringBootApplication(scanBasePackageClasses = ReactiveController.class)
    static class ReactiveControllerWebfluxTestConfig {
    }
}