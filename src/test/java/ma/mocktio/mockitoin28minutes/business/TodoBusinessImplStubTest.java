package ma.mocktio.mockitoin28minutes.business;

import ma.mocktio.mockitoin28minutes.data.api.TodoService;
import ma.mocktio.mockitoin28minutes.data.api.TodoServiceStub;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TodoBusinessImplStubTest {
    private TodoBusinessImpl todoBusinessImpl;

    @Before
    public void init() {
        todoBusinessImpl = new TodoBusinessImpl(new TodoServiceStub());
    }


    @Test
    public void testretrieveTodosRelatedToSpring_Stub() {

        assertEquals(2, todoBusinessImpl.retrieveTodosRelatedToSpring("users").size());
    }

}
