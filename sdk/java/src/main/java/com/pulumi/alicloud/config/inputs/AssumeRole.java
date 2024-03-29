// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.config.inputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AssumeRole {
    private @Nullable String externalId;
    /**
     * @return The permissions applied when assuming a role. You cannot use, this policy to grant further permissions that are in excess to those of the, role that is being assumed.
     * 
     */
    private @Nullable String policy;
    /**
     * @return The ARN of a RAM role to assume prior to making API calls.
     * 
     */
    private String roleArn;
    /**
     * @return The time after which the established session for assuming role expires. Valid value range: [900-3600] seconds. Default to 0 (in this case Alicloud use own default value).
     * 
     */
    private @Nullable Integer sessionExpiration;
    private @Nullable String sessionName;

    private AssumeRole() {}
    public Optional<String> externalId() {
        return Optional.ofNullable(this.externalId);
    }
    /**
     * @return The permissions applied when assuming a role. You cannot use, this policy to grant further permissions that are in excess to those of the, role that is being assumed.
     * 
     */
    public Optional<String> policy() {
        return Optional.ofNullable(this.policy);
    }
    /**
     * @return The ARN of a RAM role to assume prior to making API calls.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The time after which the established session for assuming role expires. Valid value range: [900-3600] seconds. Default to 0 (in this case Alicloud use own default value).
     * 
     */
    public Optional<Integer> sessionExpiration() {
        return Optional.ofNullable(this.sessionExpiration);
    }
    public Optional<String> sessionName() {
        return Optional.ofNullable(this.sessionName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssumeRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String externalId;
        private @Nullable String policy;
        private String roleArn;
        private @Nullable Integer sessionExpiration;
        private @Nullable String sessionName;
        public Builder() {}
        public Builder(AssumeRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalId = defaults.externalId;
    	      this.policy = defaults.policy;
    	      this.roleArn = defaults.roleArn;
    	      this.sessionExpiration = defaults.sessionExpiration;
    	      this.sessionName = defaults.sessionName;
        }

        @CustomType.Setter
        public Builder externalId(@Nullable String externalId) {

            this.externalId = externalId;
            return this;
        }
        @CustomType.Setter
        public Builder policy(@Nullable String policy) {

            this.policy = policy;
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            if (roleArn == null) {
              throw new MissingRequiredPropertyException("AssumeRole", "roleArn");
            }
            this.roleArn = roleArn;
            return this;
        }
        @CustomType.Setter
        public Builder sessionExpiration(@Nullable Integer sessionExpiration) {

            this.sessionExpiration = sessionExpiration;
            return this;
        }
        @CustomType.Setter
        public Builder sessionName(@Nullable String sessionName) {

            this.sessionName = sessionName;
            return this;
        }
        public AssumeRole build() {
            final var _resultValue = new AssumeRole();
            _resultValue.externalId = externalId;
            _resultValue.policy = policy;
            _resultValue.roleArn = roleArn;
            _resultValue.sessionExpiration = sessionExpiration;
            _resultValue.sessionName = sessionName;
            return _resultValue;
        }
    }
}
