package net.raymondjxu.ftc.dashboard.message.redux;

import net.raymondjxu.ftc.dashboard.config.variable.CustomVariable;
import net.raymondjxu.ftc.dashboard.message.Message;
import net.raymondjxu.ftc.dashboard.message.MessageType;

public class SaveConfig extends Message {
    private CustomVariable configDiff;

    public SaveConfig(CustomVariable configDiff) {
        super(MessageType.SAVE_CONFIG);

        this.configDiff = configDiff;
    }

    public CustomVariable getConfigDiff() {
        return configDiff;
    }
}
