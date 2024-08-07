// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderAssumeRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderAssumeRoleArgs Empty = new ProviderAssumeRoleArgs();

    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * The permissions applied when assuming a role. You cannot use, this policy to grant further permissions that are in excess to those of the, role that is being assumed.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return The permissions applied when assuming a role. You cannot use, this policy to grant further permissions that are in excess to those of the, role that is being assumed.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * The ARN of a RAM role to assume prior to making API calls.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The ARN of a RAM role to assume prior to making API calls.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * The time after which the established session for assuming role expires. Valid value range: [900-3600] seconds. Default to 0 (in this case Alicloud use own default value).
     * 
     */
    @Import(name="sessionExpiration")
    private @Nullable Output<Integer> sessionExpiration;

    /**
     * @return The time after which the established session for assuming role expires. Valid value range: [900-3600] seconds. Default to 0 (in this case Alicloud use own default value).
     * 
     */
    public Optional<Output<Integer>> sessionExpiration() {
        return Optional.ofNullable(this.sessionExpiration);
    }

    @Import(name="sessionName")
    private @Nullable Output<String> sessionName;

    public Optional<Output<String>> sessionName() {
        return Optional.ofNullable(this.sessionName);
    }

    private ProviderAssumeRoleArgs() {}

    private ProviderAssumeRoleArgs(ProviderAssumeRoleArgs $) {
        this.externalId = $.externalId;
        this.policy = $.policy;
        this.roleArn = $.roleArn;
        this.sessionExpiration = $.sessionExpiration;
        this.sessionName = $.sessionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderAssumeRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderAssumeRoleArgs $;

        public Builder() {
            $ = new ProviderAssumeRoleArgs();
        }

        public Builder(ProviderAssumeRoleArgs defaults) {
            $ = new ProviderAssumeRoleArgs(Objects.requireNonNull(defaults));
        }

        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param policy The permissions applied when assuming a role. You cannot use, this policy to grant further permissions that are in excess to those of the, role that is being assumed.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The permissions applied when assuming a role. You cannot use, this policy to grant further permissions that are in excess to those of the, role that is being assumed.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param roleArn The ARN of a RAM role to assume prior to making API calls.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of a RAM role to assume prior to making API calls.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param sessionExpiration The time after which the established session for assuming role expires. Valid value range: [900-3600] seconds. Default to 0 (in this case Alicloud use own default value).
         * 
         * @return builder
         * 
         */
        public Builder sessionExpiration(@Nullable Output<Integer> sessionExpiration) {
            $.sessionExpiration = sessionExpiration;
            return this;
        }

        /**
         * @param sessionExpiration The time after which the established session for assuming role expires. Valid value range: [900-3600] seconds. Default to 0 (in this case Alicloud use own default value).
         * 
         * @return builder
         * 
         */
        public Builder sessionExpiration(Integer sessionExpiration) {
            return sessionExpiration(Output.of(sessionExpiration));
        }

        public Builder sessionName(@Nullable Output<String> sessionName) {
            $.sessionName = sessionName;
            return this;
        }

        public Builder sessionName(String sessionName) {
            return sessionName(Output.of(sessionName));
        }

        public ProviderAssumeRoleArgs build() {
            if ($.roleArn == null) {
                throw new MissingRequiredPropertyException("ProviderAssumeRoleArgs", "roleArn");
            }
            return $;
        }
    }

}
