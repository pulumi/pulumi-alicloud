// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bastionhost.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetUserGroupsGroup {
    /**
     * @return Specify the New Group of Remark Information. Supports up to 500 Characters.
     * 
     */
    private String comment;
    /**
     * @return The ID of the User Group.
     * 
     */
    private String id;
    /**
     * @return Specify the New Group of the Bastion Host of Instance Id.
     * 
     */
    private String instanceId;
    /**
     * @return The User Group ID.
     * 
     */
    private String userGroupId;
    /**
     * @return Specify the New Group Name. Supports up to 128 Characters.
     * 
     */
    private String userGroupName;

    private GetUserGroupsGroup() {}
    /**
     * @return Specify the New Group of Remark Information. Supports up to 500 Characters.
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return The ID of the User Group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Specify the New Group of the Bastion Host of Instance Id.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The User Group ID.
     * 
     */
    public String userGroupId() {
        return this.userGroupId;
    }
    /**
     * @return Specify the New Group Name. Supports up to 128 Characters.
     * 
     */
    public String userGroupName() {
        return this.userGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String id;
        private String instanceId;
        private String userGroupId;
        private String userGroupName;
        public Builder() {}
        public Builder(GetUserGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.userGroupId = defaults.userGroupId;
    	      this.userGroupName = defaults.userGroupName;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            if (comment == null) {
              throw new MissingRequiredPropertyException("GetUserGroupsGroup", "comment");
            }
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetUserGroupsGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetUserGroupsGroup", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder userGroupId(String userGroupId) {
            if (userGroupId == null) {
              throw new MissingRequiredPropertyException("GetUserGroupsGroup", "userGroupId");
            }
            this.userGroupId = userGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder userGroupName(String userGroupName) {
            if (userGroupName == null) {
              throw new MissingRequiredPropertyException("GetUserGroupsGroup", "userGroupName");
            }
            this.userGroupName = userGroupName;
            return this;
        }
        public GetUserGroupsGroup build() {
            final var _resultValue = new GetUserGroupsGroup();
            _resultValue.comment = comment;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.userGroupId = userGroupId;
            _resultValue.userGroupName = userGroupName;
            return _resultValue;
        }
    }
}
