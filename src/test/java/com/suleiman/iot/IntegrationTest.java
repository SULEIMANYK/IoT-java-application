package com.suleiman.iot;

import com.suleiman.iot.config.AsyncSyncConfiguration;
import com.suleiman.iot.config.EmbeddedElasticsearch;
import com.suleiman.iot.config.EmbeddedKafka;
import com.suleiman.iot.config.EmbeddedRedis;
import com.suleiman.iot.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { IotApplicationApp.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@EmbeddedKafka
public @interface IntegrationTest {
}
