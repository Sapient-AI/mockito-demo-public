package demo.mockito;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
@WebMvcTest()
@ContextConfiguration(classes = UserController.class)
class UserControllerSapientGeneratedTest {

    @Autowired()
    private MockMvc mockMvc;

    @MockBean(name = "service")
    private UserService serviceMock;

    private AutoCloseable autoCloseableMocks;

    @BeforeEach()
    public void beforeTest() {
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
    }

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${greetingTest}, hash: E47DC6E490802FE1D28F89C7C9652121
    @Test()
    void greetingTest() throws Exception {
        //Arrange Statement(s)
        doReturn("return_of_greet1").when(serviceMock).greet();
        
        //Act Statement(s)
        ResultActions resultActions = this.mockMvc.perform(get("/user/greeting").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
        
        //Assert statement(s)
        assertAll("result", () -> {
            resultActions.andExpect(status().isOk());
            resultActions.andExpect(content().string(containsString("return_of_greet1")));
        });
    }

    //Sapient generated method id: ${findByIdWhenUserIsNullThrowsUserNotFoundException}, hash: 003EFA02F5AA37B64DDD56F1A028196F
    @Test()
    void findByIdWhenUserIsNullThrowsUserNotFoundException() {
        /* Branches:
         * (user == null) : true
         */
         //Arrange Statement(s)
        doReturn(null).when(serviceMock).findById("id1");
        UserNotFoundException userNotFoundException = new UserNotFoundException();
        //Act Statement(s)
        final Exception result = assertThrows(Exception.class, () -> {
            ResultActions resultActions = this.mockMvc.perform(get("/user/findById/id1").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), is(instanceOf(userNotFoundException.getClass())));
        });
    }

    //Sapient generated method id: ${findByIdWhenUserIsNotNull}, hash: 4FDBBBDC67B862AA1135B040DBB9DB46
    @Test()
    void findByIdWhenUserIsNotNull() throws Exception {
        /* Branches:
         * (user == null) : false
         */
         //Arrange Statement(s)
        User user = new User();
        user.setId("id1");
        user.setPasswordHash("passwordHash1");
        user.setEnabled(false);
        doReturn(user).when(serviceMock).findById("id1");
        
        //Act Statement(s)
        ResultActions resultActions = this.mockMvc.perform(get("/user/findById/id1").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
        
        //Assert statement(s)
        assertAll("result", () -> {
            resultActions.andExpect(status().isOk());
            resultActions.andExpect(jsonPath("$.id", is("id1")));
            resultActions.andExpect(jsonPath("$.passwordHash", is("passwordHash1")));
            resultActions.andExpect(jsonPath("$.enabled", is(false)));
        });
    }

    //Sapient generated method id: ${throwsNotTreatedExceptionThrowsIllegalArgumentException}, hash: 9E40CC9F29FA33710ABBD6D8E50E00B7
    @Test()
    void throwsNotTreatedExceptionThrowsIllegalArgumentException() {
        //Arrange Statement(s)
        Exception exception = new Exception("Not Treated Exception");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Illegal Argument", exception);
        //Act Statement(s)
        final Exception result = assertThrows(Exception.class, () -> {
            ResultActions resultActions = this.mockMvc.perform(get("/user/throwsNotTreatedException").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
        });
        
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(notNullValue()));
            assertThat(result.getCause(), is(instanceOf(illegalArgumentException.getClass())));
            assertThat(result.getCause().getMessage(), equalTo(illegalArgumentException.getMessage()));
            assertThat(result.getCause().getCause(), is(instanceOf(exception.getClass())));
        });
    }

    //Sapient generated method id: ${findByIdWithMoreParametersTest}, hash: 22586C0A83930388137C6F5DE850FD25
    @Test()
    void findByIdWithMoreParametersTest() throws Exception {
        //Act Statement(s)
        //ResultActions resultActions = this.mockMvc.perform(get("/user/findById2/id1/id3").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
        //Assert statement(s)
        /*assertAll("result", () -> {
    resultActions.andExpect(status().isOk());
    MvcResult mvcResult = resultActions.andReturn();
    assertThat(mvcResult.getResponse().getContentAsString(), equalTo(""));
});*/
    }

    //Sapient generated method id: ${findAllTest}, hash: E19C622F69CD3153A50E20A35EBD752E
    @Test()
    void findAllTest() throws Exception {
        //Arrange Statement(s)
        List<User> userList = new ArrayList<>();
        doReturn(userList).when(serviceMock).findAll();
        
        //Act Statement(s)
        ResultActions resultActions = this.mockMvc.perform(get("/user/all").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
        
        //Assert statement(s)
        assertAll("result", () -> {
            resultActions.andExpect(status().isOk());
            resultActions.andExpect(jsonPath("$", hasSize(0)));
        });
    }

    //Sapient generated method id: ${findAllIdsTest}, hash: A9CB7F51F6F47E41C162FE57E0CE1978
    @Test()
    void findAllIdsTest() throws Exception {
        //Arrange Statement(s)
        List<String> stringList = new ArrayList<>();
        doReturn(stringList).when(serviceMock).findAllIds();
        
        //Act Statement(s)
        ResultActions resultActions = this.mockMvc.perform(get("/user/allIds").contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
        
        //Assert statement(s)
        assertAll("result", () -> {
            resultActions.andExpect(status().isOk());
            resultActions.andExpect(jsonPath("$", hasSize(0)));
        });
    }

    //Sapient generated method id: ${createTest}, hash: 9769A94B022DA8B4AD9AA0E13E441380
    @Test()
    void createTest() throws Exception {
        //Arrange Statement(s)
        User user = new User();
        doNothing().when(serviceMock).create(user);
        String contentStr = new ObjectMapper().writeValueAsString(user);
        
        //Act Statement(s)
        ResultActions resultActions = this.mockMvc.perform(post("/user/create").content(contentStr).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
        
        //Assert statement(s)
        assertAll("result", () -> resultActions.andExpect(status().isOk()));
    }

    //Sapient generated method id: ${updateTest}, hash: 7E9CBFE773DA9B6F9CEE484C4B0474CD
    @Test()
    void updateTest() throws Exception {
        //Arrange Statement(s)
        User user = new User();
        doNothing().when(serviceMock).update(user);
        String contentStr = new ObjectMapper().writeValueAsString(user);
        
        //Act Statement(s)
        ResultActions resultActions = this.mockMvc.perform(post("/user/update").content(contentStr).contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
        
        //Assert statement(s)
        assertAll("result", () -> resultActions.andExpect(status().isOk()));
    }

    @SpringBootApplication(scanBasePackageClasses = UserController.class)
    static class UserControllerSapientGeneratedTestConfig {
    }
}