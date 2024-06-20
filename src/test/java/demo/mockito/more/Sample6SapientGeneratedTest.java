package demo.mockito.more;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.text.SimpleDateFormat;
import java.util.Queue;
import java.util.Date;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInRelativeOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class Sample6SapientGeneratedTest {

    //Sapient generated method id: ${addElementsTest}, hash: F84E8FF9BED13B15A3857511B61E5C72
    @Test()
    void addElementsTest() {
        //Arrange Statement(s)
        Sample6 target = new Sample6();
        Queue<String> stringQueue = new ArrayDeque<>();
        //Act Statement(s)
        Queue<String> result = target.addElements(stringQueue);
        Queue<String> stringResultQueue = new ArrayDeque<>();
        stringResultQueue.add("aaaa");
        stringResultQueue.add("bbbb");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result.size(), equalTo(2));
            assertThat(result, containsInRelativeOrder(stringResultQueue.toArray()));
        });
    }

    //Sapient generated method id: ${formatTest}, hash: 7FFCCB67D36F7A576B6F519C61FE3A2B
    @Disabled()
    @Test()
    void formatTest() throws ParseException {
        //Arrange Statement(s)
        Sample6 target = new Sample6();
        //Act Statement(s)
        Date result = target.format("A");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = simpleDateFormat.parse("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(date)));
    }
}
