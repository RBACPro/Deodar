package com.rbacpro.deodar.serde;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Struct;
import com.google.protobuf.Struct.Builder;
import com.google.protobuf.util.JsonFormat;

public class Serialization {

    public static Message serialize(String json) throws InvalidProtocolBufferException {
        Builder structBuilder = Struct.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(json, structBuilder);
        return structBuilder.build();
    }
}
