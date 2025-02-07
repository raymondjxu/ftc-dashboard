package net.raymondjxu.ftc.dashboard.message.redux;

import net.raymondjxu.ftc.dashboard.config.variable.CustomVariable;
import net.raymondjxu.ftc.dashboard.message.Message;
import net.raymondjxu.ftc.dashboard.message.MessageType;

public class ReceiveConfig extends Message {
    private CustomVariable configRoot;

    public ReceiveConfig(CustomVariable configRoot) {
        super(MessageType.RECEIVE_CONFIG);

        this.configRoot = configRoot;
    }
}
