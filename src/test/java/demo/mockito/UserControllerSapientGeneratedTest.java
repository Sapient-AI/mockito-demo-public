package demo.mockito;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.Matchers.closeTo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UserControllerSapientGeneratedTest {

    private final UserService serviceMock = mock(UserService.class, "service");

    private final User userMock = mock(User.class);

    private final UserService userServiceMock = mock(UserService.class);

    //Sapient generated method id: ${bhuvanFinalTestWhenALessThanB}, hash: 9FE779B8AF319A968182E5200D2DCFCB
    @Test()
    void bhuvanFinalTestWhenALessThanB() {
        /* Branches:
         * (a < b) : true
         */
         //Arrange Statement(s)
        UserController target = new UserController(userServiceMock);
        
        //Act Statement(s)
        Object result = target.bhuvanFinalTest(Double.parseDouble("1.0"), Double.parseDouble("2.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat((Double) result, closeTo(Double.parseDouble("1.0"), 0.00001)));
    }

    //Sapient generated method id: ${bhuvanFinalTestWhenBGreaterThanA}, hash: 23868E86E08060701F721A4A24CFD379
    @Test()
    void bhuvanFinalTestWhenBGreaterThanA() {
        /* Branches:
         * (a < b) : false
         * (b > a) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        UserController target = new UserController(userServiceMock);
        
        //Act Statement(s)
        Object result = target.bhuvanFinalTest(Double.parseDouble("0.0"), Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat((Double) result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${bhuvanFinalTestWhenBNotGreaterThanA}, hash: F6ABE29969E535E04D9F8D9F3BA123E8
    @Test()
    void bhuvanFinalTestWhenBNotGreaterThanA() {
        /* Branches:
         * (a < b) : false
         * (b > a) : false
         */
         //Arrange Statement(s)
        UserController target = new UserController(userServiceMock);
        
        //Act Statement(s)
        Object result = target.bhuvanFinalTest(Double.parseDouble("0.25"), Double.parseDouble("0.25"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat((Double) result, closeTo(Double.parseDouble("0.5"), 0.00001)));
    }
}
