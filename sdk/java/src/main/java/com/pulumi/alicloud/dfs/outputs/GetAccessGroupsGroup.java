// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dfs.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccessGroupsGroup {
    /**
     * @return The length of `description` does not exceed 100 bytes.
     * 
     */
    private String accessGroupId;
    /**
     * @return The Name of Access Group. The length Of `access_group_name` does not exceed 100 bytes.
     * 
     */
    private String accessGroupName;
    /**
     * @return The CreateTime of Access Group.
     * 
     */
    private String createTime;
    /**
     * @return The Description of Access Group. The length Of `description` does not exceed 100 bytes.
     * 
     */
    private String description;
    /**
     * @return The ID of the Access Group.
     * 
     */
    private String id;
    /**
     * @return The Number of attached mountpoint.
     * 
     */
    private Integer mountPointCount;
    /**
     * @return The NetworkType of Access Group. Valid values: `VPC`.
     * 
     */
    private String networkType;
    /**
     * @return The Number of access rule.
     * 
     */
    private Integer ruleCount;

    private GetAccessGroupsGroup() {}
    /**
     * @return The length of `description` does not exceed 100 bytes.
     * 
     */
    public String accessGroupId() {
        return this.accessGroupId;
    }
    /**
     * @return The Name of Access Group. The length Of `access_group_name` does not exceed 100 bytes.
     * 
     */
    public String accessGroupName() {
        return this.accessGroupName;
    }
    /**
     * @return The CreateTime of Access Group.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The Description of Access Group. The length Of `description` does not exceed 100 bytes.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Access Group.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Number of attached mountpoint.
     * 
     */
    public Integer mountPointCount() {
        return this.mountPointCount;
    }
    /**
     * @return The NetworkType of Access Group. Valid values: `VPC`.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return The Number of access rule.
     * 
     */
    public Integer ruleCount() {
        return this.ruleCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessGroupId;
        private String accessGroupName;
        private String createTime;
        private String description;
        private String id;
        private Integer mountPointCount;
        private String networkType;
        private Integer ruleCount;
        public Builder() {}
        public Builder(GetAccessGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessGroupId = defaults.accessGroupId;
    	      this.accessGroupName = defaults.accessGroupName;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.mountPointCount = defaults.mountPointCount;
    	      this.networkType = defaults.networkType;
    	      this.ruleCount = defaults.ruleCount;
        }

        @CustomType.Setter
        public Builder accessGroupId(String accessGroupId) {
            if (accessGroupId == null) {
              throw new MissingRequiredPropertyException("GetAccessGroupsGroup", "accessGroupId");
            }
            this.accessGroupId = accessGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder accessGroupName(String accessGroupName) {
            if (accessGroupName == null) {
              throw new MissingRequiredPropertyException("GetAccessGroupsGroup", "accessGroupName");
            }
            this.accessGroupName = accessGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetAccessGroupsGroup", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAccessGroupsGroup", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAccessGroupsGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mountPointCount(Integer mountPointCount) {
            if (mountPointCount == null) {
              throw new MissingRequiredPropertyException("GetAccessGroupsGroup", "mountPointCount");
            }
            this.mountPointCount = mountPointCount;
            return this;
        }
        @CustomType.Setter
        public Builder networkType(String networkType) {
            if (networkType == null) {
              throw new MissingRequiredPropertyException("GetAccessGroupsGroup", "networkType");
            }
            this.networkType = networkType;
            return this;
        }
        @CustomType.Setter
        public Builder ruleCount(Integer ruleCount) {
            if (ruleCount == null) {
              throw new MissingRequiredPropertyException("GetAccessGroupsGroup", "ruleCount");
            }
            this.ruleCount = ruleCount;
            return this;
        }
        public GetAccessGroupsGroup build() {
            final var _resultValue = new GetAccessGroupsGroup();
            _resultValue.accessGroupId = accessGroupId;
            _resultValue.accessGroupName = accessGroupName;
            _resultValue.createTime = createTime;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.mountPointCount = mountPointCount;
            _resultValue.networkType = networkType;
            _resultValue.ruleCount = ruleCount;
            return _resultValue;
        }
    }
}
