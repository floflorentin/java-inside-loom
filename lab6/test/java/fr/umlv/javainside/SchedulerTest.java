import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchedulerTest {

    @Test
    public void testStackNull() {
        var scope = new ContinuationScope("scope");
        //var scheduler = new Scheduler("STACK");
        var continuation1 = new Continuation(scope, () -> {
            System.out.println("1");
            scheduler.enqueue(scope);
        });
        var continuation2 = new Continuation(scope, () -> {
            System.out.println("2");
            scheduler.enqueue(scope);
        });
        var list = List.of(continuation1, continuation2);
        var test = List.of("1","2");
        Assertions.assertAll(
           //     () -> assertEquals(test, scheduler.runLoop())
        );
        // assertThrows(NullPointerException.class, scheduler.enqueue());
    }
}