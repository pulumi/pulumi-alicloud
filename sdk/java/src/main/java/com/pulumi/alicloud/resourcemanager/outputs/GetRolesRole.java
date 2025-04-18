// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRolesRole {
    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the RAM role.
     * 
     */
    private String arn;
    /**
     * @return (Available in v1.114.0+) The assume role policy document.
     * 
     */
    private String assumeRolePolicyDocument;
    /**
     * @return The description of the RAM role.
     * 
     */
    private String description;
    /**
     * @return The ID of the role.
     * 
     */
    private String id;
    /**
     * @return The maximum session duration of the RAM role.
     * 
     */
    private Integer maxSessionDuration;
    /**
     * @return The ID of the role.
     * 
     */
    private String roleId;
    /**
     * @return The name of the role.
     * 
     */
    private String roleName;
    /**
     * @return The time when the RAM role was updated.
     * 
     */
    private String updateDate;

    private GetRolesRole() {}
    /**
     * @return The Alibaba Cloud Resource Name (ARN) of the RAM role.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return (Available in v1.114.0+) The assume role policy document.
     * 
     */
    public String assumeRolePolicyDocument() {
        return this.assumeRolePolicyDocument;
    }
    /**
     * @return The description of the RAM role.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the role.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The maximum session duration of the RAM role.
     * 
     */
    public Integer maxSessionDuration() {
        return this.maxSessionDuration;
    }
    /**
     * @return The ID of the role.
     * 
     */
    public String roleId() {
        return this.roleId;
    }
    /**
     * @return The name of the role.
     * 
     */
    public String roleName() {
        return this.roleName;
    }
    /**
     * @return The time when the RAM role was updated.
     * 
     */
    public String updateDate() {
        return this.updateDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolesRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String assumeRolePolicyDocument;
        private String description;
        private String id;
        private Integer maxSessionDuration;
        private String roleId;
        private String roleName;
        private String updateDate;
        public Builder() {}
        public Builder(GetRolesRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assumeRolePolicyDocument = defaults.assumeRolePolicyDocument;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.maxSessionDuration = defaults.maxSessionDuration;
    	      this.roleId = defaults.roleId;
    	      this.roleName = defaults.roleName;
    	      this.updateDate = defaults.updateDate;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            if (arn == null) {
              throw new MissingRequiredPropertyException("GetRolesRole", "arn");
            }
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder assumeRolePolicyDocument(String assumeRolePolicyDocument) {
            if (assumeRolePolicyDocument == null) {
              throw new MissingRequiredPropertyException("GetRolesRole", "assumeRolePolicyDocument");
            }
            this.assumeRolePolicyDocument = assumeRolePolicyDocument;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetRolesRole", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRolesRole", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder maxSessionDuration(Integer maxSessionDuration) {
            if (maxSessionDuration == null) {
              throw new MissingRequiredPropertyException("GetRolesRole", "maxSessionDuration");
            }
            this.maxSessionDuration = maxSessionDuration;
            return this;
        }
        @CustomType.Setter
        public Builder roleId(String roleId) {
            if (roleId == null) {
              throw new MissingRequiredPropertyException("GetRolesRole", "roleId");
            }
            this.roleId = roleId;
            return this;
        }
        @CustomType.Setter
        public Builder roleName(String roleName) {
            if (roleName == null) {
              throw new MissingRequiredPropertyException("GetRolesRole", "roleName");
            }
            this.roleName = roleName;
            return this;
        }
        @CustomType.Setter
        public Builder updateDate(String updateDate) {
            if (updateDate == null) {
              throw new MissingRequiredPropertyException("GetRolesRole", "updateDate");
            }
            this.updateDate = updateDate;
            return this;
        }
        public GetRolesRole build() {
            final var _resultValue = new GetRolesRole();
            _resultValue.arn = arn;
            _resultValue.assumeRolePolicyDocument = assumeRolePolicyDocument;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.maxSessionDuration = maxSessionDuration;
            _resultValue.roleId = roleId;
            _resultValue.roleName = roleName;
            _resultValue.updateDate = updateDate;
            return _resultValue;
        }
    }
}
