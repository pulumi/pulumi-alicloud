// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTemplateScratchesScratchSourceResourceGroup {
    /**
     * @return The ID of the Source Resource Group.
     * 
     */
    private String resourceGroupId;
    /**
     * @return Source resource type filter list.
     * 
     */
    private List<String> resourceTypeFilters;

    private GetTemplateScratchesScratchSourceResourceGroup() {}
    /**
     * @return The ID of the Source Resource Group.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return Source resource type filter list.
     * 
     */
    public List<String> resourceTypeFilters() {
        return this.resourceTypeFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTemplateScratchesScratchSourceResourceGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resourceGroupId;
        private List<String> resourceTypeFilters;
        public Builder() {}
        public Builder(GetTemplateScratchesScratchSourceResourceGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.resourceTypeFilters = defaults.resourceTypeFilters;
        }

        @CustomType.Setter
        public Builder resourceGroupId(String resourceGroupId) {
            if (resourceGroupId == null) {
              throw new MissingRequiredPropertyException("GetTemplateScratchesScratchSourceResourceGroup", "resourceGroupId");
            }
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceTypeFilters(List<String> resourceTypeFilters) {
            if (resourceTypeFilters == null) {
              throw new MissingRequiredPropertyException("GetTemplateScratchesScratchSourceResourceGroup", "resourceTypeFilters");
            }
            this.resourceTypeFilters = resourceTypeFilters;
            return this;
        }
        public Builder resourceTypeFilters(String... resourceTypeFilters) {
            return resourceTypeFilters(List.of(resourceTypeFilters));
        }
        public GetTemplateScratchesScratchSourceResourceGroup build() {
            final var _resultValue = new GetTemplateScratchesScratchSourceResourceGroup();
            _resultValue.resourceGroupId = resourceGroupId;
            _resultValue.resourceTypeFilters = resourceTypeFilters;
            return _resultValue;
        }
    }
}
