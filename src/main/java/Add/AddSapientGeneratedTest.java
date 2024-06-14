package Add;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.hamcrest.Matchers.closeTo;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class AddSapientGeneratedTest {

    //Sapient generated method id: ${c171c54c-6269-3c0b-b712-82c3caeff653}, hash: D8D33512DB169E342CB0CA9D492DCF9D
    @Test()
    void add1Test() {
        //Arrange Statement(s)
        Add target = new Add();
        
        //Act Statement(s)
        double result = target.add1(Double.parseDouble("0.0"), Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${d8788c7f-e64b-394d-b7b1-751bcdf7386e}, hash: 3E2D3D8FA9821DDDC3A026DDF0394A4B
    @Test()
    void add2Test() {
        //Arrange Statement(s)
        Add target = new Add();
        
        //Act Statement(s)
        double result = target.add2(Double.parseDouble("1.0"), Double.parseDouble("1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("1.0"), 0.00001)));
    }

    //Sapient generated method id: ${bcbfaae0-fa02-35c3-881a-4b5e4cb18fcb}, hash: A1422D8B2A1E03718ADACB0C1B459216
    @Test()
    void add3WhenAGreaterThanB() {
        /* Branches:
         * (a > b) : true
         */
         //Arrange Statement(s)
        Add target = new Add();
        
        //Act Statement(s)
        double result = target.add3(Double.parseDouble("0.5"), Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.5"), 0.00001)));
    }

    //Sapient generated method id: ${34cfff01-ded8-33bb-8984-e28df1bbc934}, hash: 6B358D052AF77448E58C96BE36C03BB6
    @Test()
    void add3WhenANotGreaterThanB() {
        /* Branches:
         * (a > b) : false
         */
         //Arrange Statement(s)
        Add target = new Add();
        
        //Act Statement(s)
        double result = target.add3(Double.parseDouble("1.0"), Double.parseDouble("1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }

    //Sapient generated method id: ${cebb8a49-3a73-3255-8d1a-fa3e8744ae47}, hash: D4EA9D4F69A47AA4788D5F2A413D34A2
    @Test()
    void add4WhenALessThanB() {
        /* Branches:
         * (a < b) : true
         */
         //Arrange Statement(s)
        Add target = new Add();
        
        //Act Statement(s)
        double result = target.add4(Double.parseDouble("-0.5"), Double.parseDouble("0.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("-0.5"), 0.00001)));
    }

    //Sapient generated method id: ${fe29645d-4364-3050-8919-3bf41fcb743a}, hash: 0B46597E118535137C6E4AB94C16FE1D
    @Test()
    void add4WhenANotLessThanB() {
        /* Branches:
         * (a < b) : false
         */
         //Arrange Statement(s)
        Add target = new Add();
        
        //Act Statement(s)
        double result = target.add4(Double.parseDouble("2.0"), Double.parseDouble("1.0"));
        
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, closeTo(Double.parseDouble("0.0"), 0.00001)));
    }
}
