package demo.mockito;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UserServiceSapientGeneratedTest {

    private final UserRepository userRepositoryMock = mock(UserRepository.class, "userRepository");

    //Sapient generated method id: ${1616d276-1b10-3ada-92b4-df741e16e6f6}
    @Test()
    void findAllTest() {
        //Arrange Statement(s)
        PasswordEncoder passwordEncoderMock = mock(PasswordEncoder.class);
        UserService target = new UserService(userRepositoryMock, passwordEncoderMock);
        List<User> userList = new ArrayList<>();
        doReturn(userList).when(userRepositoryMock).findAll();

        //Act Statement(s)
        List<User> result = target.findAll();

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(userList));
            verify(userRepositoryMock).findAll();
        });
    }
}
