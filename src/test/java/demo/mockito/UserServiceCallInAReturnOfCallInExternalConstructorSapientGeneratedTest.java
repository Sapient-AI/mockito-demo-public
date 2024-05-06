package demo.mockito;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class UserServiceCallInAReturnOfCallInExternalConstructorSapientGeneratedTest {

    //Sapient generated method id: ${39561a4e-0bbd-3eea-abca-20d3b284d84c}
    @Disabled()
    @Test()
    void getPasswordHashTest() {
        /**
         * TODO: Help needed! This method is not unit testable!
         *  Following variables could not be isolated/mocked: dependency
         *  Suggestions:
         *  You can change the initialization of above variables and make it injectable or
         *  adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        UserRepository userRepositoryMock = mock(UserRepository.class);
        UserServiceCallInAReturnOfCallInExternalConstructor target = new UserServiceCallInAReturnOfCallInExternalConstructor(userRepositoryMock);
        //Act Statement(s)
        String result = target.getPasswordHash();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("return_of_getPasswordHash1")));
    }
}
