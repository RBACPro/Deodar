package com.rbacpro.deodar.serde;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;

public class Deserialization {

    public static String deserealize(MessageOrBuilder mob) throws InvalidProtocolBufferException {
        return JsonFormat.printer().print(mob);
    }
}
