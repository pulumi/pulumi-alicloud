// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oos.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetApplicationsApplication {
    /**
     * @return The name of the application.
     * 
     */
    private final String applicationName;
    /**
     * @return The Created time of the application.
     * 
     */
    private final String createTime;
    /**
     * @return Application group description information.
     * 
     */
    private final String description;
    /**
     * @return The ID of the Application. The value is formate as &lt;application_name&gt;.
     * 
     */
    private final String id;
    /**
     * @return The ID of the resource group.
     * 
     */
    private final String resourceGroupId;
    /**
     * @return The tag of the resource.
     * 
     */
    private final Map<String,Object> tags;
    /**
     * @return The Updated time of the application.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetApplicationsApplication(
        @CustomType.Parameter("applicationName") String applicationName,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("resourceGroupId") String resourceGroupId,
        @CustomType.Parameter("tags") Map<String,Object> tags,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.applicationName = applicationName;
        this.createTime = createTime;
        this.description = description;
        this.id = id;
        this.resourceGroupId = resourceGroupId;
        this.tags = tags;
        this.updateTime = updateTime;
    }

    /**
     * @return The name of the application.
     * 
     */
    public String applicationName() {
        return this.applicationName;
    }
    /**
     * @return The Created time of the application.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Application group description information.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Application. The value is formate as &lt;application_name&gt;.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the resource group.
     * 
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }
    /**
     * @return The tag of the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags;
    }
    /**
     * @return The Updated time of the application.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationsApplication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationName;
        private String createTime;
        private String description;
        private String id;
        private String resourceGroupId;
        private Map<String,Object> tags;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationsApplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.tags = defaults.tags;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder applicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetApplicationsApplication build() {
            return new GetApplicationsApplication(applicationName, createTime, description, id, resourceGroupId, tags, updateTime);
        }
    }
}