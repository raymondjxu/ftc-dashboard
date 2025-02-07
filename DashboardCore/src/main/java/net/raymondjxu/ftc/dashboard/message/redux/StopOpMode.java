package net.raymondjxu.ftc.dashboard.message.redux;

import net.raymondjxu.ftc.dashboard.message.Message;
import net.raymondjxu.ftc.dashboard.message.MessageType;

public class StopOpMode extends Message {
    public StopOpMode() {
        super(MessageType.STOP_OP_MODE);
    }
}
