package poe;

import static org.junit.jupiter.api.Assertions.assertEquals; 
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.Test;


public class MessageTest {
   
    Message message = new Message();
    public MessageTest() {
        
    }

    @Test
    public void testgetMessage() {
        String expected="I have arrived";
        String actual = message.getMessage();
        
        assertEquals(expected,actual);
    }
    
}
