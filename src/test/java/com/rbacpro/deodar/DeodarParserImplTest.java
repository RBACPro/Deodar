package com.rbacpro.deodar;

import com.google.common.io.Resources;
import com.rbacpro.deodar.evaluator.DeodarEvaluatorFactory;
import com.rbacpro.deodar.model.DeodarParseResult;
import com.rbacpro.deodar.parser.DeodarParserFactory;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Map;

import static com.google.common.truth.Truth.assertThat;

public class DeodarParserImplTest {


    @Test
    public void testGoodExamples() throws IOException {

        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(classloader);
            Resource[] resources = resolver.getResources("classpath:parser/good/*.json");
            System.out.println("The size of policy files is "+ resources.length);
            for (Resource resource : resources) {
                System.out.println("Loading the content of the reference file:" + resource.getFilename());
                String policy = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
                DeodarParseResult res = DeodarParserFactory.standardDeodarParserBuilder().build().parse(policy);
                assertThat(res.getPolicy()).isNotNull();
                assertThat(res.isHasError()).isFalse();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Test
    public void testBadExamples() throws IOException {

        try {
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(classloader);
            Resource[] resources = resolver.getResources("classpath:parser/bad/*.json");
            System.out.println("The size of policy files is "+ resources.length);
            for (Resource resource : resources) {
                System.out.println("Loading the content of the reference file: "+ resource.getFilename());
                String policy = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
                DeodarParseResult res = DeodarParserFactory.standardDeodarParserBuilder().build().parse(policy);
                assertThat(res.getPolicy()).isNull();
                assertThat(res.isHasError()).isTrue();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
