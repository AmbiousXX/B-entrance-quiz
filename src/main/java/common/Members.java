package common;

import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;

@Component
public class Members {
    // private List<Integer> IdList;

    private LinkedHashMap<Integer, String> memberList = new LinkedHashMap<>();

    public Members() {
        memberList.put(1, "成吉思汗");
        memberList.put(2, "鲁班七号");
        memberList.put(3, "太乙真人");
        memberList.put(4, "钟无艳");
        memberList.put(5, "花木兰");
        memberList.put(6, "雅典娜");
        memberList.put(7, "芈月");
        memberList.put(8, "白起");
        memberList.put(9, "刘禅");
        memberList.put(10, "庄周");
        memberList.put(11, "马超");
        memberList.put(12, "刘备");
        memberList.put(13, "哪吒");
        memberList.put(14, "大乔");
        memberList.put(15, "蔡文姬");

        // this.IdList = new ArrayList<>(memberList.keySet());
    }

    public String getMemberName(Integer Id) {

        return memberList.get(Id);
    }
}
