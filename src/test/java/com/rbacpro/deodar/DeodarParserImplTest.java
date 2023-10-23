package com.rbacpro.deodar;

import com.google.common.io.Resources;
import com.rbacpro.deodar.model.DeodarParseResult;
import com.rbacpro.deodar.parser.DeodarParserFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.Charset;

import static com.google.common.truth.Truth.assertThat;

public class DeodarParserImplTest {

    @Test
    public void testExample() throws IOException {
        String policy = Resources.toString(Resources.getResource("parser/policy1.json"), Charset.defaultCharset());
        DeodarParseResult res = DeodarParserFactory.standardDeodarParserBuilder().build().parse(policy);
        assertThat(res.getPolicy()).isNotNull();
        assertThat(res.isHasError()).isFalse();
    }
}
