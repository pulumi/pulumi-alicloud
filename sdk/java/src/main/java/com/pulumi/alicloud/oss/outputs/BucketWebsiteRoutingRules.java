// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.outputs;

import com.pulumi.alicloud.oss.outputs.BucketWebsiteRoutingRulesRoutingRule;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BucketWebsiteRoutingRules {
    /**
     * @return Specify a jump rule or a mirroring back-to-origin rule, with a maximum of 20 routing rules. See `routing_rule` below.
     * 
     */
    private @Nullable List<BucketWebsiteRoutingRulesRoutingRule> routingRules;

    private BucketWebsiteRoutingRules() {}
    /**
     * @return Specify a jump rule or a mirroring back-to-origin rule, with a maximum of 20 routing rules. See `routing_rule` below.
     * 
     */
    public List<BucketWebsiteRoutingRulesRoutingRule> routingRules() {
        return this.routingRules == null ? List.of() : this.routingRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketWebsiteRoutingRules defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<BucketWebsiteRoutingRulesRoutingRule> routingRules;
        public Builder() {}
        public Builder(BucketWebsiteRoutingRules defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routingRules = defaults.routingRules;
        }

        @CustomType.Setter
        public Builder routingRules(@Nullable List<BucketWebsiteRoutingRulesRoutingRule> routingRules) {

            this.routingRules = routingRules;
            return this;
        }
        public Builder routingRules(BucketWebsiteRoutingRulesRoutingRule... routingRules) {
            return routingRules(List.of(routingRules));
        }
        public BucketWebsiteRoutingRules build() {
            final var _resultValue = new BucketWebsiteRoutingRules();
            _resultValue.routingRules = routingRules;
            return _resultValue;
        }
    }
}
