package datastructure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {
    @Test
    public void testThatMethodAddWorks() {
        MyQueue queue = new MyQueue();
        queue.add(10);

        assertEquals(10, queue.element());
    }

        @Test
        public void testAddReturnsTrueAndInsertsElementsInOrder() {
            MyQueue queue= new MyQueue();
            assertTrue(queue.add(10));
            

            assertEquals(10, queue.peek());
        }

        

        @Test
        public void testPeekReturnsFirstElementWithoutRemovingIt() {
            MyQueue  queue = new MyQueue();
            queue.add(10);
            queue.add(20);

            assertEquals(10, queue.peek());
            assertEquals(10, queue.peek()); 
        }

        @Test
        public void testPeekOnEmptyQueueReturnsNull() {
            MyQueue queue = new MyQueue();

            assertNull(queue.peek());
        }

        

        @Test
        public void testElementReturnsFirstElement() {
            MyQueue queue = new MyQueue();
            queue.add(10);
            queue.add(20);

            assertEquals(10, queue.element());
        }


        @Test
        public void testPollReturnsAndRemovesFirstElement() {
            MyQueue queue = new MyQueue();

            queue.add(10);
            queue.add(20);
            queue.add(30);

            assertEquals(10, queue.poll());
            assertEquals(20, queue.poll());
            assertEquals(30, queue.peek());
            assertNotNull(queue.poll());
        }

        @Test
        public void testPollOnEmptyQueueReturnsNull(){
            MyQueue queue = new MyQueue();

            assertNull(queue.poll());
        }

        

        @Test
        public void testRemoveReturnsAndRemovesFirstElement() {
            MyQueue queue = new MyQueue();

            queue.add(5);
            queue.add(15);

            assertEquals(5, queue.remove());

            assertEquals(15, queue.peek());
        }

        @Test
        public void testRemoveOnEmptyQueueReturnsZero() {
            MyQueue queue = new MyQueue();


            assertEquals(0, queue.remove());
        }
    }

