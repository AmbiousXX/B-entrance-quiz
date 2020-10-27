package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.common.Members;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class MemberOperationServiceTest {
    @Test
    void shouldInvokeMethodInGroupDivisionWhenDivideMembersIntoDifferentGroups() {
        Members members = new Members();
        GroupDivision groupDivision = Mockito.mock(GroupDivision.class);
        MemberOperationService memberOperationService = new MemberOperationService(members, groupDivision);

        memberOperationService.groupDivisionService();

        verify(groupDivision).divideMembersIntoGroupsRandomly();
    }

    @Test
    void shouldInvokeMethodInMembersWhenAddNewMember() {
        Members members = Mockito.mock(Members.class);
        GroupDivision groupDivision = Mockito.mock(GroupDivision.class);
        MemberOperationService memberOperationService = new MemberOperationService(members, groupDivision);

        memberOperationService.addNewMemberService("姜子牙");

        verify(members).addNewMember("姜子牙");
    }
}
