// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetSecurityGroupRulesRule;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSecurityGroupRulesResult {
    /**
     * @return Authorization direction, `ingress` or `egress`.
     * 
     */
    private @Nullable String direction;
    /**
     * @return The description of the security group that owns the rules.
     * 
     */
    private String groupDesc;
    private String groupId;
    /**
     * @return The name of the security group that owns the rules.
     * 
     */
    private String groupName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
     * 
     */
    private @Nullable String ipProtocol;
    /**
     * @return Network type, `internet` or `intranet`.
     * 
     */
    private @Nullable String nicType;
    private @Nullable String outputFile;
    /**
     * @return Authorization policy. Can be either `accept` or `drop`.
     * 
     */
    private @Nullable String policy;
    /**
     * @return A list of security group rules. Each element contains the following attributes:
     * 
     */
    private List<GetSecurityGroupRulesRule> rules;

    private GetSecurityGroupRulesResult() {}
    /**
     * @return Authorization direction, `ingress` or `egress`.
     * 
     */
    public Optional<String> direction() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * @return The description of the security group that owns the rules.
     * 
     */
    public String groupDesc() {
        return this.groupDesc;
    }
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The name of the security group that owns the rules.
     * 
     */
    public String groupName() {
        return this.groupName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
     * 
     */
    public Optional<String> ipProtocol() {
        return Optional.ofNullable(this.ipProtocol);
    }
    /**
     * @return Network type, `internet` or `intranet`.
     * 
     */
    public Optional<String> nicType() {
        return Optional.ofNullable(this.nicType);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return Authorization policy. Can be either `accept` or `drop`.
     * 
     */
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * @return A list of security group rules. Each element contains the following attributes:
     * 
     */
    public List<GetSecurityGroupRulesRule> rules() {
        return this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityGroupRulesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String direction;
        private String groupDesc;
        private String groupId;
        private String groupName;
        private String id;
        private @Nullable String ipProtocol;
        private @Nullable String nicType;
        private @Nullable String outputFile;
        private @Nullable String policy;
        private List<GetSecurityGroupRulesRule> rules;
        public Builder() {}
        public Builder(GetSecurityGroupRulesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.direction = defaults.direction;
    	      this.groupDesc = defaults.groupDesc;
    	      this.groupId = defaults.groupId;
    	      this.groupName = defaults.groupName;
    	      this.id = defaults.id;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.nicType = defaults.nicType;
    	      this.outputFile = defaults.outputFile;
    	      this.policy = defaults.policy;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder direction(@Nullable String direction) {

            this.direction = direction;
            return this;
        }
        @CustomType.Setter
        public Builder groupDesc(String groupDesc) {
            if (groupDesc == null) {
              throw new MissingRequiredPropertyException("GetSecurityGroupRulesResult", "groupDesc");
            }
            this.groupDesc = groupDesc;
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            if (groupId == null) {
              throw new MissingRequiredPropertyException("GetSecurityGroupRulesResult", "groupId");
            }
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder groupName(String groupName) {
            if (groupName == null) {
              throw new MissingRequiredPropertyException("GetSecurityGroupRulesResult", "groupName");
            }
            this.groupName = groupName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSecurityGroupRulesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ipProtocol(@Nullable String ipProtocol) {

            this.ipProtocol = ipProtocol;
            return this;
        }
        @CustomType.Setter
        public Builder nicType(@Nullable String nicType) {

            this.nicType = nicType;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder policy(@Nullable String policy) {

            this.policy = policy;
            return this;
        }
        @CustomType.Setter
        public Builder rules(List<GetSecurityGroupRulesRule> rules) {
            if (rules == null) {
              throw new MissingRequiredPropertyException("GetSecurityGroupRulesResult", "rules");
            }
            this.rules = rules;
            return this;
        }
        public Builder rules(GetSecurityGroupRulesRule... rules) {
            return rules(List.of(rules));
        }
        public GetSecurityGroupRulesResult build() {
            final var _resultValue = new GetSecurityGroupRulesResult();
            _resultValue.direction = direction;
            _resultValue.groupDesc = groupDesc;
            _resultValue.groupId = groupId;
            _resultValue.groupName = groupName;
            _resultValue.id = id;
            _resultValue.ipProtocol = ipProtocol;
            _resultValue.nicType = nicType;
            _resultValue.outputFile = outputFile;
            _resultValue.policy = policy;
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}
