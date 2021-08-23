package com.my.start;

import com.my.sqlstream.SQLStream;
import com.my.sqlstream.SelectStream;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static com.my.tableproxies.Tables.*;

public class MainTest {

    @Test
    public void testMockito(){
        SQLStream stream = Mockito.mock(SQLStream.class);
        Mockito.when(stream.execute())
                .then(invocationOnMock ->
                        new ArrayList<Map<String, Object>>(){{
                            add(new HashMap<String, Object>(){{
                                put("name", "ivan");
                            }});
                    }}
                );
    }
}