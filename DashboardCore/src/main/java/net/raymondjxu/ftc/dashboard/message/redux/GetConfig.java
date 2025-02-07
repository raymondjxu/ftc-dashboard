package net.raymondjxu.ftc.dashboard.message.redux;

import net.raymondjxu.ftc.dashboard.message.Message;
import net.raymondjxu.ftc.dashboard.message.MessageType;

public class GetConfig extends Message {
    public GetConfig() {
        super(MessageType.GET_CONFIG);
    }
}
