// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccountDeletionCheckTaskNotAllowReason {
    /**
     * @return The ID of the check item.
     * 
     */
    private String checkId;
    /**
     * @return The name of the cloud service to which the check item belongs.
     * 
     */
    private String checkName;
    /**
     * @return The description of the check item.
     * 
     */
    private String description;

    private GetAccountDeletionCheckTaskNotAllowReason() {}
    /**
     * @return The ID of the check item.
     * 
     */
    public String checkId() {
        return this.checkId;
    }
    /**
     * @return The name of the cloud service to which the check item belongs.
     * 
     */
    public String checkName() {
        return this.checkName;
    }
    /**
     * @return The description of the check item.
     * 
     */
    public String description() {
        return this.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountDeletionCheckTaskNotAllowReason defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String checkId;
        private String checkName;
        private String description;
        public Builder() {}
        public Builder(GetAccountDeletionCheckTaskNotAllowReason defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkId = defaults.checkId;
    	      this.checkName = defaults.checkName;
    	      this.description = defaults.description;
        }

        @CustomType.Setter
        public Builder checkId(String checkId) {
            if (checkId == null) {
              throw new MissingRequiredPropertyException("GetAccountDeletionCheckTaskNotAllowReason", "checkId");
            }
            this.checkId = checkId;
            return this;
        }
        @CustomType.Setter
        public Builder checkName(String checkName) {
            if (checkName == null) {
              throw new MissingRequiredPropertyException("GetAccountDeletionCheckTaskNotAllowReason", "checkName");
            }
            this.checkName = checkName;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAccountDeletionCheckTaskNotAllowReason", "description");
            }
            this.description = description;
            return this;
        }
        public GetAccountDeletionCheckTaskNotAllowReason build() {
            final var _resultValue = new GetAccountDeletionCheckTaskNotAllowReason();
            _resultValue.checkId = checkId;
            _resultValue.checkName = checkName;
            _resultValue.description = description;
            return _resultValue;
        }
    }
}