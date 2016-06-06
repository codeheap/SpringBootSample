package ch.froorider.samples;

import ch.froorider.samples.domain.*;
import org.junit.Assert;
import org.junit.Test;

public class GreetingTests{
    
    @Test
    public void greetingIsCreated(){
        long id = 12345;
        String content = "This is a test content.";
        
        Greeting greeting = new Greeting(id,content);
        
        Assert.assertNotNull("Greeting object should not be null", greeting);
        Assert.assertEquals("Content should be the same", content, greeting.getContent());
    }
    
    @Test
    public void idIsTheSame(){
        long id = 12345;
        String content = "This is a test content.";
        
        Greeting greeting = new Greeting(id,content);
        Assert.assertEquals("ID must be the same",id,greeting.getId());
    }
}