// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetIpv6EgressRulesRule;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIpv6EgressRulesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String instanceId;
    private @Nullable String ipv6EgressRuleName;
    private String ipv6GatewayId;
    private @Nullable String nameRegex;
    private List<String> names;
    private @Nullable String outputFile;
    private List<GetIpv6EgressRulesRule> rules;
    private @Nullable String status;

    private GetIpv6EgressRulesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    public Optional<String> ipv6EgressRuleName() {
        return Optional.ofNullable(this.ipv6EgressRuleName);
    }
    public String ipv6GatewayId() {
        return this.ipv6GatewayId;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetIpv6EgressRulesRule> rules() {
        return this.rules;
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpv6EgressRulesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String instanceId;
        private @Nullable String ipv6EgressRuleName;
        private String ipv6GatewayId;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetIpv6EgressRulesRule> rules;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetIpv6EgressRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.instanceId = defaults.instanceId;
    	      this.ipv6EgressRuleName = defaults.ipv6EgressRuleName;
    	      this.ipv6GatewayId = defaults.ipv6GatewayId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.rules = defaults.rules;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetIpv6EgressRulesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetIpv6EgressRulesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder instanceId(@Nullable String instanceId) {

            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6EgressRuleName(@Nullable String ipv6EgressRuleName) {

            this.ipv6EgressRuleName = ipv6EgressRuleName;
            return this;
        }
        @CustomType.Setter
        public Builder ipv6GatewayId(String ipv6GatewayId) {
            if (ipv6GatewayId == null) {
              throw new MissingRequiredPropertyException("GetIpv6EgressRulesResult", "ipv6GatewayId");
            }
            this.ipv6GatewayId = ipv6GatewayId;
            return this;
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetIpv6EgressRulesResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<GetIpv6EgressRulesRule> rules) {
            if (rules == null) {
              throw new MissingRequiredPropertyException("GetIpv6EgressRulesResult", "rules");
            }
            this.rules = rules;
            return this;
        }
        public Builder rules(GetIpv6EgressRulesRule... rules) {
            return rules(List.of(rules));
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetIpv6EgressRulesResult build() {
            final var _resultValue = new GetIpv6EgressRulesResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.instanceId = instanceId;
            _resultValue.ipv6EgressRuleName = ipv6EgressRuleName;
            _resultValue.ipv6GatewayId = ipv6GatewayId;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.rules = rules;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}