// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AclRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AclRuleArgs Empty = new AclRuleArgs();

    /**
     * The ID of the ACL.
     * 
     */
    @Import(name="aclId", required=true)
    private Output<String> aclId;

    /**
     * @return The ID of the ACL.
     * 
     */
    public Output<String> aclId() {
        return this.aclId;
    }

    /**
     * The description of the ACL rule. It must be 1 to 512 characters in length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the ACL rule. It must be 1 to 512 characters in length.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
     * 
     */
    @Import(name="destCidr", required=true)
    private Output<String> destCidr;

    /**
     * @return The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
     * 
     */
    public Output<String> destCidr() {
        return this.destCidr;
    }

    /**
     * The range of the destination port. Valid value: 80/80.
     * 
     */
    @Import(name="destPortRange", required=true)
    private Output<String> destPortRange;

    /**
     * @return The range of the destination port. Valid value: 80/80.
     * 
     */
    public Output<String> destPortRange() {
        return this.destPortRange;
    }

    /**
     * The direction of the ACL rule. Valid values: in|out.
     * 
     */
    @Import(name="direction", required=true)
    private Output<String> direction;

    /**
     * @return The direction of the ACL rule. Valid values: in|out.
     * 
     */
    public Output<String> direction() {
        return this.direction;
    }

    /**
     * The protocol used by the ACL rule. The value is not case sensitive.
     * 
     */
    @Import(name="ipProtocol", required=true)
    private Output<String> ipProtocol;

    /**
     * @return The protocol used by the ACL rule. The value is not case sensitive.
     * 
     */
    public Output<String> ipProtocol() {
        return this.ipProtocol;
    }

    /**
     * The policy used by the ACL rule. Valid values: accept|drop.
     * 
     */
    @Import(name="policy", required=true)
    private Output<String> policy;

    /**
     * @return The policy used by the ACL rule. Valid values: accept|drop.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     * The priority of the ACL rule. Value range: 1 to 100.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return The priority of the ACL rule. Value range: 1 to 100.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
     * 
     */
    @Import(name="sourceCidr", required=true)
    private Output<String> sourceCidr;

    /**
     * @return The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
     * 
     */
    public Output<String> sourceCidr() {
        return this.sourceCidr;
    }

    /**
     * The range of the source port. Valid value: 80/80.
     * 
     */
    @Import(name="sourcePortRange", required=true)
    private Output<String> sourcePortRange;

    /**
     * @return The range of the source port. Valid value: 80/80.
     * 
     */
    public Output<String> sourcePortRange() {
        return this.sourcePortRange;
    }

    private AclRuleArgs() {}

    private AclRuleArgs(AclRuleArgs $) {
        this.aclId = $.aclId;
        this.description = $.description;
        this.destCidr = $.destCidr;
        this.destPortRange = $.destPortRange;
        this.direction = $.direction;
        this.ipProtocol = $.ipProtocol;
        this.policy = $.policy;
        this.priority = $.priority;
        this.sourceCidr = $.sourceCidr;
        this.sourcePortRange = $.sourcePortRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AclRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AclRuleArgs $;

        public Builder() {
            $ = new AclRuleArgs();
        }

        public Builder(AclRuleArgs defaults) {
            $ = new AclRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclId The ID of the ACL.
         * 
         * @return builder
         * 
         */
        public Builder aclId(Output<String> aclId) {
            $.aclId = aclId;
            return this;
        }

        /**
         * @param aclId The ID of the ACL.
         * 
         * @return builder
         * 
         */
        public Builder aclId(String aclId) {
            return aclId(Output.of(aclId));
        }

        /**
         * @param description The description of the ACL rule. It must be 1 to 512 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the ACL rule. It must be 1 to 512 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destCidr The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
         * 
         * @return builder
         * 
         */
        public Builder destCidr(Output<String> destCidr) {
            $.destCidr = destCidr;
            return this;
        }

        /**
         * @param destCidr The destination address. It is an IPv4 address range in CIDR format. Default value: 0.0.0.0/0.
         * 
         * @return builder
         * 
         */
        public Builder destCidr(String destCidr) {
            return destCidr(Output.of(destCidr));
        }

        /**
         * @param destPortRange The range of the destination port. Valid value: 80/80.
         * 
         * @return builder
         * 
         */
        public Builder destPortRange(Output<String> destPortRange) {
            $.destPortRange = destPortRange;
            return this;
        }

        /**
         * @param destPortRange The range of the destination port. Valid value: 80/80.
         * 
         * @return builder
         * 
         */
        public Builder destPortRange(String destPortRange) {
            return destPortRange(Output.of(destPortRange));
        }

        /**
         * @param direction The direction of the ACL rule. Valid values: in|out.
         * 
         * @return builder
         * 
         */
        public Builder direction(Output<String> direction) {
            $.direction = direction;
            return this;
        }

        /**
         * @param direction The direction of the ACL rule. Valid values: in|out.
         * 
         * @return builder
         * 
         */
        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        /**
         * @param ipProtocol The protocol used by the ACL rule. The value is not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocol(Output<String> ipProtocol) {
            $.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * @param ipProtocol The protocol used by the ACL rule. The value is not case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocol(String ipProtocol) {
            return ipProtocol(Output.of(ipProtocol));
        }

        /**
         * @param policy The policy used by the ACL rule. Valid values: accept|drop.
         * 
         * @return builder
         * 
         */
        public Builder policy(Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The policy used by the ACL rule. Valid values: accept|drop.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param priority The priority of the ACL rule. Value range: 1 to 100.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority The priority of the ACL rule. Value range: 1 to 100.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param sourceCidr The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
         * 
         * @return builder
         * 
         */
        public Builder sourceCidr(Output<String> sourceCidr) {
            $.sourceCidr = sourceCidr;
            return this;
        }

        /**
         * @param sourceCidr The source address. It is an IPv4 address range in the CIDR format. Default value: 0.0.0.0/0.
         * 
         * @return builder
         * 
         */
        public Builder sourceCidr(String sourceCidr) {
            return sourceCidr(Output.of(sourceCidr));
        }

        /**
         * @param sourcePortRange The range of the source port. Valid value: 80/80.
         * 
         * @return builder
         * 
         */
        public Builder sourcePortRange(Output<String> sourcePortRange) {
            $.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * @param sourcePortRange The range of the source port. Valid value: 80/80.
         * 
         * @return builder
         * 
         */
        public Builder sourcePortRange(String sourcePortRange) {
            return sourcePortRange(Output.of(sourcePortRange));
        }

        public AclRuleArgs build() {
            if ($.aclId == null) {
                throw new MissingRequiredPropertyException("AclRuleArgs", "aclId");
            }
            if ($.destCidr == null) {
                throw new MissingRequiredPropertyException("AclRuleArgs", "destCidr");
            }
            if ($.destPortRange == null) {
                throw new MissingRequiredPropertyException("AclRuleArgs", "destPortRange");
            }
            if ($.direction == null) {
                throw new MissingRequiredPropertyException("AclRuleArgs", "direction");
            }
            if ($.ipProtocol == null) {
                throw new MissingRequiredPropertyException("AclRuleArgs", "ipProtocol");
            }
            if ($.policy == null) {
                throw new MissingRequiredPropertyException("AclRuleArgs", "policy");
            }
            if ($.sourceCidr == null) {
                throw new MissingRequiredPropertyException("AclRuleArgs", "sourceCidr");
            }
            if ($.sourcePortRange == null) {
                throw new MissingRequiredPropertyException("AclRuleArgs", "sourcePortRange");
            }
            return $;
        }
    }

}