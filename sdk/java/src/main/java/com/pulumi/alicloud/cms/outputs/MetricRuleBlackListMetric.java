// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricRuleBlackListMetric {
    /**
     * @return The name of the monitoring indicator.
     * 
     */
    private String metricName;
    /**
     * @return The extended dimension information of the instance. For example, &#39;{&#34;device&#34;:&#34;C:&#34;}&#39; indicates that the blacklist policy is applied to all C disks under the ECS instance.
     * 
     */
    private @Nullable String resource;

    private MetricRuleBlackListMetric() {}
    /**
     * @return The name of the monitoring indicator.
     * 
     */
    public String metricName() {
        return this.metricName;
    }
    /**
     * @return The extended dimension information of the instance. For example, &#39;{&#34;device&#34;:&#34;C:&#34;}&#39; indicates that the blacklist policy is applied to all C disks under the ECS instance.
     * 
     */
    public Optional<String> resource() {
        return Optional.ofNullable(this.resource);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricRuleBlackListMetric defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String metricName;
        private @Nullable String resource;
        public Builder() {}
        public Builder(MetricRuleBlackListMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.resource = defaults.resource;
        }

        @CustomType.Setter
        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        @CustomType.Setter
        public Builder resource(@Nullable String resource) {
            this.resource = resource;
            return this;
        }
        public MetricRuleBlackListMetric build() {
            final var o = new MetricRuleBlackListMetric();
            o.metricName = metricName;
            o.resource = resource;
            return o;
        }
    }
}