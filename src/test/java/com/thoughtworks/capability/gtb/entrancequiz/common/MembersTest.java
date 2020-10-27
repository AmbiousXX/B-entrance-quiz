package com.thoughtworks.capability.gtb.entrancequiz.common;

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

    @Test
    void shouldReturnDifferentNameWhenGetSpecificMemberNameGivenShuffledIdList() {
        Members members = new Members();
        Integer memberId = 10;
        String actualMemberName = members.getMemberName(members.getIdFromIdList(memberId - 1));
        assertEquals("庄周", actualMemberName);

        members.randomIdOrder();

        String actualMemberNameAfterShuffle = members.getMemberName(members.getIdFromIdList(memberId - 1));
        assertNotEquals("庄周", actualMemberNameAfterShuffle);
    }

    @Test
    void shouldExtendMemberListWhenAddNewMember() {
        Members members = new Members();
        members.addNewMember("姜子牙");
        members.addNewMember("项羽");

        assertEquals(17, members.getMembersNum());
        assertEquals("姜子牙", members.getMemberName(16));
        assertEquals("项羽", members.getMemberName(17));
    }
}
