package common;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MembersTest {

    @Test
    void shouldReturnSpecificMemberWhenGetMemberNameGivenSpecificId() {
        Members members = new Members();
        String actualMemberName = members.getMemberName(10);
        assertEquals("庄周", actualMemberName);
    }
}
