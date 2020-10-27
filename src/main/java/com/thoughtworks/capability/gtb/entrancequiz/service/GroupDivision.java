package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.common.Members;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

@Component
public class GroupDivision {
    private final Members members;

    private static final int GROUP_NUM = 6;

    private LinkedHashMap<Integer, List<Integer>> groups = new LinkedHashMap<>();

    public GroupDivision(Members members) {
        this.members = members;
    }

    public void divideMembersIntoGroupsRandomly() {
        for (int i = 0; i < GROUP_NUM; i++) {
            List<Integer> listForEachGroup = new ArrayList<>();
            groups.put(i + 1, listForEachGroup);
        }

        members.randomIdOrder();

        int minGroupMemberNum = members.getMembersNum() / GROUP_NUM;
        int extraGroupMemberNum = members.getMembersNum() % GROUP_NUM;

        for (int i = 0; i < GROUP_NUM; i++) {
            for (int j = 0; j < minGroupMemberNum; j++) {
                groups.get(i + 1).add(members.getIdFromIdList(i * (minGroupMemberNum) + j));
            }
        }

        for (int i = 0; i < extraGroupMemberNum; i++) {
            groups.get(i + 1).add(minGroupMemberNum * GROUP_NUM + i);
        }
    }

    public String getMemberNameAfterDivision(int sequence, int index) {
        return members.getMemberName(groups.get(sequence).get(index));
    }
}
