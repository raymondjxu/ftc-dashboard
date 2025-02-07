package net.raymondjxu.ftc.dashboard.message.redux;

import net.raymondjxu.ftc.dashboard.message.Message;
import net.raymondjxu.ftc.dashboard.message.MessageType;

public class StartOpMode extends Message {
    public StartOpMode() {
        super(MessageType.START_OP_MODE);
    }
}
