// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oos.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationGroupsGroup {
    /**
     * @return The name of the Application group.
     * 
     */
    private String applicationGroupName;
    /**
     * @return The name of the Application.
     * 
     */
    private String applicationName;
    /**
     * @return The ID of the cloud monitor group.
     * 
     */
    private String cmsGroupId;
    /**
     * @return The Creation time of the resource.
     * 
     */
    private String createTime;
    /**
     * @return The region ID of the deployment.
     * 
     */
    private String deployRegionId;
    /**
     * @return Application group description information.
     * 
     */
    private String description;
    /**
     * @return The ID of the Application Group. Its value is same as Queue Name.
     * 
     */
    private String id;
    /**
     * @return Label key.
     * 
     */
    private String importTagKey;
    /**
     * @return Label value.
     * 
     */
    private String importTagValue;
    /**
     * @return The Update time of the resource.
     * 
     */
    private String updateTime;

    private GetApplicationGroupsGroup() {}
    /**
     * @return The name of the Application group.
     * 
     */
    public String applicationGroupName() {
        return this.applicationGroupName;
    }
    /**
     * @return The name of the Application.
     * 
     */
    public String applicationName() {
        return this.applicationName;
    }
    /**
     * @return The ID of the cloud monitor group.
     * 
     */
    public String cmsGroupId() {
        return this.cmsGroupId;
    }
    /**
     * @return The Creation time of the resource.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The region ID of the deployment.
     * 
     */
    public String deployRegionId() {
        return this.deployRegionId;
    }
    /**
     * @return Application group description information.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Application Group. Its value is same as Queue Name.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Label key.
     * 
     */
    public String importTagKey() {
        return this.importTagKey;
    }
    /**
     * @return Label value.
     * 
     */
    public String importTagValue() {
        return this.importTagValue;
    }
    /**
     * @return The Update time of the resource.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applicationGroupName;
        private String applicationName;
        private String cmsGroupId;
        private String createTime;
        private String deployRegionId;
        private String description;
        private String id;
        private String importTagKey;
        private String importTagValue;
        private String updateTime;
        public Builder() {}
        public Builder(GetApplicationGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGroupName = defaults.applicationGroupName;
    	      this.applicationName = defaults.applicationName;
    	      this.cmsGroupId = defaults.cmsGroupId;
    	      this.createTime = defaults.createTime;
    	      this.deployRegionId = defaults.deployRegionId;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.importTagKey = defaults.importTagKey;
    	      this.importTagValue = defaults.importTagValue;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder applicationGroupName(String applicationGroupName) {
            if (applicationGroupName == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupsGroup", "applicationGroupName");
            }
            this.applicationGroupName = applicationGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder applicationName(String applicationName) {
            if (applicationName == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupsGroup", "applicationName");
            }
            this.applicationName = applicationName;
            return this;
        }
        @CustomType.Setter
        public Builder cmsGroupId(String cmsGroupId) {
            if (cmsGroupId == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupsGroup", "cmsGroupId");
            }
            this.cmsGroupId = cmsGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupsGroup", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder deployRegionId(String deployRegionId) {
            if (deployRegionId == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupsGroup", "deployRegionId");
            }
            this.deployRegionId = deployRegionId;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupsGroup", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupsGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder importTagKey(String importTagKey) {
            if (importTagKey == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupsGroup", "importTagKey");
            }
            this.importTagKey = importTagKey;
            return this;
        }
        @CustomType.Setter
        public Builder importTagValue(String importTagValue) {
            if (importTagValue == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupsGroup", "importTagValue");
            }
            this.importTagValue = importTagValue;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            if (updateTime == null) {
              throw new MissingRequiredPropertyException("GetApplicationGroupsGroup", "updateTime");
            }
            this.updateTime = updateTime;
            return this;
        }
        public GetApplicationGroupsGroup build() {
            final var _resultValue = new GetApplicationGroupsGroup();
            _resultValue.applicationGroupName = applicationGroupName;
            _resultValue.applicationName = applicationName;
            _resultValue.cmsGroupId = cmsGroupId;
            _resultValue.createTime = createTime;
            _resultValue.deployRegionId = deployRegionId;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.importTagKey = importTagKey;
            _resultValue.importTagValue = importTagValue;
            _resultValue.updateTime = updateTime;
            return _resultValue;
        }
    }
}
