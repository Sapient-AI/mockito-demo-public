package demo.mockito;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UserSapientGeneratedTest {

    //Sapient generated method id: ${compareToWhenIdIsNotNull}, hash: 093ED11E54ABAB665E8BA3DA9C9786D3
    @Test()
    void compareToWhenIdIsNotNull() {
        /* Branches:
         * (id != null) : true
         */
         //Arrange Statement(s)
        User target = new User("B", "passwordHash1", false);
        User user = new User();
        user.setId("A");
        
        //Act Statement(s)
        int result = target.compareTo(user);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${compareToWhenIdIsNull}, hash: C7852B0B812BB7690D46BAC583EEC194
    @Test()
    void compareToWhenIdIsNull() {
        /* Branches:
         * (id != null) : false
         */
         //Arrange Statement(s)
        User target = new User((String) null, "passwordHash1", false);
        User userMock = mock(User.class);
        
        //Act Statement(s)
        int result = target.compareTo(userMock);
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(0)));
    }

    //Sapient generated method id: ${generateRandomPasswordTest}, hash: 6F8F119A24BA874FDD53814F5DF9D529
    @Test()
    void generateRandomPasswordTest() {
        //Arrange Statement(s)
        User target = new User("id1", "passwordHash1", false);
        
        //Act Statement(s)
        String result = target.generateRandomPassword();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("ZZ")));
    }

    //Sapient generated method id: ${concatIdAndPasswordTest}, hash: 891F3B41C480C931CF408C29219C282E
    @Test()
    void concatIdAndPasswordTest() {
        //Arrange Statement(s)
        User target = new User("id1", "passwordHash1", false);
        
        //Act Statement(s)
        String result = target.concatIdAndPassword();
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("id1")));
    }
}
