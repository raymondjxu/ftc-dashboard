package net.raymondjxu.ftc.dashboard.message.redux;

import net.raymondjxu.ftc.dashboard.message.Message;
import net.raymondjxu.ftc.dashboard.message.MessageType;

public class InitOpMode extends Message {
    private String opModeName;

    public InitOpMode(String opModeName) {
        super(MessageType.INIT_OP_MODE);

        this.opModeName = opModeName;
    }

    public String getOpModeName() {
        return opModeName;
    }
}
