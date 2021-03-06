package genericsInterfaceDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StacksTest {
    
    private LLStack<String> stack; // modify LLStack to ArrayListStack to test your code
    
    @Before
    public void setUp() {
        stack = new LLStack<String>(); // modify LLStack to ArrayListStack to test your code
    }

    @After
    public void tearDown() {
        stack = null;
    }

    // test for empty
    @Test
    public void testEmpty() {
        assertEquals(stack.isEmpty(), true);
    }
    
    // test for push
    @Test
    public void testPush() {
        stack.push("hi");
        assertEquals(stack.isEmpty(), false);
    }
    
    //test for push/pop
    @Test
    public void testPushPop() {
        stack.push("hi");
        assertEquals(stack.isEmpty(), false);
        String out = stack.pop();
        assertEquals(out, "hi");
        assertEquals(stack.isEmpty(), true);
    }

    // test for top
    @Test
    public void testPushTop() {
        stack.push("hi");
        assertEquals(stack.isEmpty(), false);
        assertEquals(stack.top(), "hi");
        assertEquals(stack.isEmpty(), false);
    }

    // exercise: add in a test for size below
    // test for size
    @Test
    public void testSize() {
        stack.push("hi");
        assertEquals(stack.size(), 1);
        stack.push("hi");
        assertEquals(stack.size(), 2);
    }
}

