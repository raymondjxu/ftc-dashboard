package net.raymondjxu.ftc.dashboard.message.redux;

import net.raymondjxu.ftc.dashboard.message.Message;
import net.raymondjxu.ftc.dashboard.message.MessageType;

public class GetRobotStatus extends Message {

    public GetRobotStatus() {
        super(MessageType.GET_ROBOT_STATUS);
    }
}
