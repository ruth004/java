package datastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    @Test
   public void testThatMethodPushWorks(){
        MyStack stack = new MyStack();
        stack.push("jayda");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testThatIAddedTwoValuesAndMethodPopGetsTheLastOneIn(){
        MyStack stack = new MyStack();
        stack.push("jahson");
        stack.push("precious");

        assertEquals("precious", stack.pop());
    }
    @Test
    public void testThatMethodpeekWorks(){
        MyStack stack = new MyStack();

    }
}

