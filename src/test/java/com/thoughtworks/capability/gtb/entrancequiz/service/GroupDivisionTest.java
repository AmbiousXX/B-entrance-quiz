package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.common.Members;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(MockitoExtension.class)
class GroupDivisionTest {
    @Test
    void shouldGetDifferentMemberNameWhenDivideMembersRandomlyGivenDivideMembersRequestTwice() {
        Members members = new Members();
        GroupDivision groupDivision = new GroupDivision(members);

        groupDivision.divideMembersIntoGroupsRandomly();
        String memberNameForFirstDivision = groupDivision.getMemberNameAfterDivision(1, 0);

        groupDivision.divideMembersIntoGroupsRandomly();
        String memberNameForSecondDivision = groupDivision.getMemberNameAfterDivision(1, 0);

        assertNotEquals(memberNameForFirstDivision, memberNameForSecondDivision);
    }
}
