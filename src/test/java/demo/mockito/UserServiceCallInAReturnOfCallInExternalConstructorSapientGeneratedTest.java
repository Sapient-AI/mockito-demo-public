package demo.mockito;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UserServiceCallInAReturnOfCallInExternalConstructorSapientGeneratedTest {

    private final UserRepository userRepositoryMock = mock(UserRepository.class);

    //Sapient generated method id: ${getPasswordHashTest}, hash: 545F6AAE7F48ABB7D35A4E7843BC9B26
    @Disabled()
    @Test()
    void getPasswordHashTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class demo.mockito.UserServiceDependency2
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UserServiceCallInAReturnOfCallInExternalConstructor target = new UserServiceCallInAReturnOfCallInExternalConstructor(userRepositoryMock);
        //Act Statement(s)
        String result = target.getPasswordHash();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("return_of_getPasswordHash1")));
    }

    //Sapient generated method id: ${returnMyStringNullTest}, hash: CE874A07449208D0552E264C0AE5F8A1
    @Disabled()
    @Test()
    void returnMyStringNullTest() {
        /*
         * TODO: Help needed! This method is not unit testable!
         *  No constructor found to create an object without any exception for class demo.mockito.UserServiceDependency2
         *  Suggestions:
         *  You can pass them as constructor arguments or create a setter for them (avoid new operator)
         *  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UserServiceCallInAReturnOfCallInExternalConstructor target = new UserServiceCallInAReturnOfCallInExternalConstructor(userRepositoryMock);
        //Act Statement(s)
        String result = target.returnMyStringNull();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }
}
