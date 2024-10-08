// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.alicloud.cms.outputs.GetSlsGroupsGroupSlsGroupConfig;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSlsGroupsGroup {
    /**
     * @return The creation time of the resource.
     * 
     */
    private String createTime;
    /**
     * @return The ID of the Sls Group. Its value is same as Queue Name.
     * 
     */
    private String id;
    /**
     * @return The Config of the Sls Group.
     * 
     */
    private List<GetSlsGroupsGroupSlsGroupConfig> slsGroupConfigs;
    /**
     * @return The Description of the Sls Group.
     * 
     */
    private String slsGroupDescription;
    /**
     * @return The name of the resource.
     * 
     */
    private String slsGroupName;

    private GetSlsGroupsGroup() {}
    /**
     * @return The creation time of the resource.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The ID of the Sls Group. Its value is same as Queue Name.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Config of the Sls Group.
     * 
     */
    public List<GetSlsGroupsGroupSlsGroupConfig> slsGroupConfigs() {
        return this.slsGroupConfigs;
    }
    /**
     * @return The Description of the Sls Group.
     * 
     */
    public String slsGroupDescription() {
        return this.slsGroupDescription;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String slsGroupName() {
        return this.slsGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSlsGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String id;
        private List<GetSlsGroupsGroupSlsGroupConfig> slsGroupConfigs;
        private String slsGroupDescription;
        private String slsGroupName;
        public Builder() {}
        public Builder(GetSlsGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.id = defaults.id;
    	      this.slsGroupConfigs = defaults.slsGroupConfigs;
    	      this.slsGroupDescription = defaults.slsGroupDescription;
    	      this.slsGroupName = defaults.slsGroupName;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetSlsGroupsGroup", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSlsGroupsGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder slsGroupConfigs(List<GetSlsGroupsGroupSlsGroupConfig> slsGroupConfigs) {
            if (slsGroupConfigs == null) {
              throw new MissingRequiredPropertyException("GetSlsGroupsGroup", "slsGroupConfigs");
            }
            this.slsGroupConfigs = slsGroupConfigs;
            return this;
        }
        public Builder slsGroupConfigs(GetSlsGroupsGroupSlsGroupConfig... slsGroupConfigs) {
            return slsGroupConfigs(List.of(slsGroupConfigs));
        }
        @CustomType.Setter
        public Builder slsGroupDescription(String slsGroupDescription) {
            if (slsGroupDescription == null) {
              throw new MissingRequiredPropertyException("GetSlsGroupsGroup", "slsGroupDescription");
            }
            this.slsGroupDescription = slsGroupDescription;
            return this;
        }
        @CustomType.Setter
        public Builder slsGroupName(String slsGroupName) {
            if (slsGroupName == null) {
              throw new MissingRequiredPropertyException("GetSlsGroupsGroup", "slsGroupName");
            }
            this.slsGroupName = slsGroupName;
            return this;
        }
        public GetSlsGroupsGroup build() {
            final var _resultValue = new GetSlsGroupsGroup();
            _resultValue.createTime = createTime;
            _resultValue.id = id;
            _resultValue.slsGroupConfigs = slsGroupConfigs;
            _resultValue.slsGroupDescription = slsGroupDescription;
            _resultValue.slsGroupName = slsGroupName;
            return _resultValue;
        }
    }
}
