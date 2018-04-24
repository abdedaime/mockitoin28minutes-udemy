package ma.mocktio.mockitoin28minutes.business;

import ma.mocktio.mockitoin28minutes.data.api.TodoService;
import ma.mocktio.mockitoin28minutes.data.api.TodoServiceStub;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplMockTest {


    // What is mocking?
    // mocking is creating objects that simulate the behavior of real objects.
    // Unlike stubs, mocks can be dynamically created from code - at runtime.
    // Mocks offer more functionality than stubbing.
    // You can verify method calls and a lot of other things.


    @Test
    public void testretrieveTodosRelatedToSpring_Stub() {
        TodoService   mockTodoService= mock(TodoService.class);
     //   stub(mockTodoService.retrieveTodos('parametre')).return("list);
        when(mockTodoService.retrieveTodos("udummy")).thenReturn(Arrays.asList("Learn Spring MVC", "Learn Spring",
                "Learn to Dance"));
      //  Collections.sort();

     //   assertEquals(2, todoBusinessImpl.retrieveTodosRelatedToSpring("users").size());
    }

}
