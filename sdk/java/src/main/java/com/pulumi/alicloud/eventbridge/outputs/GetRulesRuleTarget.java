// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eventbridge.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRulesRuleTarget {
    /**
     * @return The endpoint.
     * 
     */
    private String endpoint;
    /**
     * @return The id of target.
     * 
     */
    private String targetId;
    /**
     * @return The type of target.
     * 
     */
    private String type;

    private GetRulesRuleTarget() {}
    /**
     * @return The endpoint.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return The id of target.
     * 
     */
    public String targetId() {
        return this.targetId;
    }
    /**
     * @return The type of target.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesRuleTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endpoint;
        private String targetId;
        private String type;
        public Builder() {}
        public Builder(GetRulesRuleTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.targetId = defaults.targetId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder endpoint(String endpoint) {
            if (endpoint == null) {
              throw new MissingRequiredPropertyException("GetRulesRuleTarget", "endpoint");
            }
            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder targetId(String targetId) {
            if (targetId == null) {
              throw new MissingRequiredPropertyException("GetRulesRuleTarget", "targetId");
            }
            this.targetId = targetId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetRulesRuleTarget", "type");
            }
            this.type = type;
            return this;
        }
        public GetRulesRuleTarget build() {
            final var _resultValue = new GetRulesRuleTarget();
            _resultValue.endpoint = endpoint;
            _resultValue.targetId = targetId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}