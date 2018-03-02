package org.apache.kafka.common.metrics;

import org.apache.kafka.clients.CommonClientConfigs;
import org.junit.Assert;

import java.util.Map;

public class UserSpecifiedClientIdTestMetricsReporter extends FakeMetricsReporter {

    @Override
    public void configure(Map<String, ?> configs) {
        Assert.assertFalse(configs.get(CommonClientConfigs.CLIENT_ID_CONFIG).toString().contains("producer"));
        Assert.assertFalse(configs.get(CommonClientConfigs.CLIENT_ID_CONFIG).toString().contains("consumer"));
    }
}
