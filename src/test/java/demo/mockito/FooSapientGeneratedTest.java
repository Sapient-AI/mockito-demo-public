package demo.mockito;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class FooSapientGeneratedTest {

    //Sapient generated method id: ${exampleWhenA1Equals10}, hash: D11320F316964E62D3F0C2299D468829
    @Test()
    void exampleWhenA1Equals10() {
        /* Branches:
         * (a != b) : true
         * (a1 == 10) : true
         */
         //Arrange Statement(s)
        Foo target = new Foo();
        
        //Act Statement(s)
        target.example(2, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    //Sapient generated method id: ${exampleWhenA2EqualsB2}, hash: 97EFB7752B5E5F9892D072FDBEDF1702
    @Test()
    void exampleWhenA2EqualsB2() {
        /* Branches:
         * (a != b) : true
         * (a1 == 10) : false
         * (a2 == b2) : true
         */
         //Arrange Statement(s)
        Foo target = new Foo();
        
        //Act Statement(s)
        target.example(-1, 0, -1, 0, 0, 0, -1, -1, 0, 0, 0, 0, 0);
    }

    //Sapient generated method id: ${exampleWhenA2NotEqualsB2}, hash: CEB3337CB2938E8D10249DAD4AB55667
    @Test()
    void exampleWhenA2NotEqualsB2() {
        /* Branches:
         * (a != b) : true
         * (a1 == 10) : false
         * (a2 == b2) : false
         */
         //Arrange Statement(s)
        Foo target = new Foo();
        
        //Act Statement(s)
        target.example(1, 2, 1, 0, 0, 0, 1, 2, 0, 0, 0, 0, 0);
    }

    //Sapient generated method id: ${exampleWhenCGreaterThan0}, hash: 25EDE48D51A62D301743899ED21497DA
    @Test()
    void exampleWhenCGreaterThan0() {
        /* Branches:
         * (a != b) : false
         * (c != d) : true
         * (c != d) : true
         * (c > 0) : true
         */
         //Arrange Statement(s)
        Foo target = new Foo();
        
        //Act Statement(s)
        target.example(1, 1, 0, 0, 1, 2, 0, 0, 0, 0, 0, 0, 0);
    }

    //Sapient generated method id: ${exampleWhenNLessThanHAndSwitchZCase1}, hash: 9476D31B79FFA1F2DA8B9FE35A5485F1
    @Test()
    void exampleWhenNLessThanHAndSwitchZCase1() {
        /* Branches:
         * (a != b) : false
         * (c != d) : false
         * (e == f) : true
         * (n < h) : true
         * (switch(z) = 1) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Foo target = new Foo();
        
        //Act Statement(s)
        target.example(1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1);
    }

    //Sapient generated method id: ${exampleWhenNLessThanHAndSwitchZCase2}, hash: E4F2A0F8B2F459FC69E1717582DAF397
    @Test()
    void exampleWhenNLessThanHAndSwitchZCase2() {
        /* Branches:
         * (a != b) : false
         * (c != d) : false
         * (e == f) : true
         * (n < h) : true
         * (switch(z) = 2) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Foo target = new Foo();
        
        //Act Statement(s)
        target.example(1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 2);
    }

    //Sapient generated method id: ${exampleWhenNLessThanHAndSwitchZCase3}, hash: 2976414E082358BE00F69991F5AD1D47
    @Test()
    void exampleWhenNLessThanHAndSwitchZCase3() {
        /* Branches:
         * (a != b) : false
         * (c != d) : false
         * (e == f) : true
         * (n < h) : true
         * (switch(z) = 3) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Foo target = new Foo();
        
        //Act Statement(s)
        target.example(1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 3);
    }

    //Sapient generated method id: ${exampleWhenNLessThanHAndSwitchZCase4}, hash: BE53A74817163981F513644C2EDDF1DE
    @Test()
    void exampleWhenNLessThanHAndSwitchZCase4() {
        /* Branches:
         * (a != b) : false
         * (c != d) : false
         * (e == f) : true
         * (n < h) : true
         * (switch(z) = 4) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Foo target = new Foo();
        
        //Act Statement(s)
        target.example(1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 4);
    }

    //Sapient generated method id: ${exampleWhenNLessThanHAndSwitchZCaseDefault}, hash: EF27E13B1B44F632D1FC59B0E9EB17FA
    @Test()
    void exampleWhenNLessThanHAndSwitchZCaseDefault() {
        /* Branches:
         * (a != b) : false
         * (c != d) : false
         * (e == f) : true
         * (n < h) : true
         * (switch(z) = default) : true
         *
         * TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.
         *  The test code, including the assertion statements, has been successfully generated.
         */
         //Arrange Statement(s)
        Foo target = new Foo();
        
        //Act Statement(s)
        target.example(1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0);
    }
}
