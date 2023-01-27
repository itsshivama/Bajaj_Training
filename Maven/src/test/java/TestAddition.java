import AdditionService.AdditionService;
import Demo_Maven_Training.Addition;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestAddition {

    //JUnit5 Test Cases
    Addition ad = new Addition();
    @Test
    void test(){
        assertEquals(30, ad.add(10,20));
    }

    //Mockito Test Cases
    @Test
    void testAddition(){
        AdditionService service = mock(AdditionService.class);
        Addition obj = new Addition(service);
        when(service.addition(100,200)).thenReturn(300);
        assertEquals(300, obj.addition(100, 200));
    }
}
