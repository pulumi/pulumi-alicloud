// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCallerIdentityResult {
    /**
     * @return Account ID.
     * 
     */
    private String accountId;
    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the user making the call.
     * 
     */
    private String arn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The type of the princiapal. RAMUser for users.
     * 
     */
    private String identityType;

    private GetCallerIdentityResult() {}
    /**
     * @return Account ID.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the user making the call.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The type of the princiapal. RAMUser for users.
     * 
     */
    public String identityType() {
        return this.identityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCallerIdentityResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String arn;
        private String id;
        private String identityType;
        public Builder() {}
        public Builder(GetCallerIdentityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.identityType = defaults.identityType;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            if (accountId == null) {
              throw new MissingRequiredPropertyException("GetCallerIdentityResult", "accountId");
            }
            this.accountId = accountId;
            return this;
        }
        @CustomType.Setter
        public Builder arn(String arn) {
            if (arn == null) {
              throw new MissingRequiredPropertyException("GetCallerIdentityResult", "arn");
            }
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetCallerIdentityResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder identityType(String identityType) {
            if (identityType == null) {
              throw new MissingRequiredPropertyException("GetCallerIdentityResult", "identityType");
            }
            this.identityType = identityType;
            return this;
        }
        public GetCallerIdentityResult build() {
            final var _resultValue = new GetCallerIdentityResult();
            _resultValue.accountId = accountId;
            _resultValue.arn = arn;
            _resultValue.id = id;
            _resultValue.identityType = identityType;
            return _resultValue;
        }
    }
}