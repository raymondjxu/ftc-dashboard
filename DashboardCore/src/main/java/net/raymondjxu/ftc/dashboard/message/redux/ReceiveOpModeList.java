package net.raymondjxu.ftc.dashboard.message.redux;

import net.raymondjxu.ftc.dashboard.message.Message;
import net.raymondjxu.ftc.dashboard.message.MessageType;
import java.util.List;

public class ReceiveOpModeList extends Message {
    private List<String> opModeList;

    public ReceiveOpModeList(List<String> opModeList) {
        super(MessageType.RECEIVE_OP_MODE_LIST);

        this.opModeList = opModeList;
    }
}
