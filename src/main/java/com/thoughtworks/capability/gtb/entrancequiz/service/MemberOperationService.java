package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.common.Members;

public class MemberOperationService {
    private final Members members;
    private final GroupDivision groupDivision;

    public MemberOperationService(Members members, GroupDivision groupDivision) {
        this.members = members;
        this.groupDivision = groupDivision;
    }

    public void groupDivisionService() {
        groupDivision.divideMembersIntoGroupsRandomly();
    }

    public void addNewMemberService(String name) {
        members.addNewMember(name);
    }
}
