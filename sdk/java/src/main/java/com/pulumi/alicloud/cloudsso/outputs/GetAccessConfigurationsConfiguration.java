// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso.outputs;

import com.pulumi.alicloud.cloudsso.outputs.GetAccessConfigurationsConfigurationPermissionPolicy;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAccessConfigurationsConfiguration {
    /**
     * @return The AccessConfigurationId of the Access Configuration.
     * 
     */
    private String accessConfigurationId;
    /**
     * @return The AccessConfigurationName of the Access Configuration.
     * 
     */
    private String accessConfigurationName;
    /**
     * @return The Created Time of the Directory.
     * 
     */
    private String createTime;
    /**
     * @return The Description of the Directory.
     * 
     */
    private String description;
    /**
     * @return The ID of the Directory.
     * 
     */
    private String directoryId;
    /**
     * @return The ID of the Access Configuration.
     * 
     */
    private String id;
    /**
     * @return The Policy List.
     * 
     */
    private List<GetAccessConfigurationsConfigurationPermissionPolicy> permissionPolicies;
    /**
     * @return The RelayState of the Access Configuration.
     * 
     */
    private String relayState;
    /**
     * @return The SessionDuration of the Access Configuration.
     * 
     */
    private Integer sessionDuration;
    /**
     * @return The StatusNotifications of the Access Configuration.
     * 
     */
    private List<String> statusNotifications;

    private GetAccessConfigurationsConfiguration() {}
    /**
     * @return The AccessConfigurationId of the Access Configuration.
     * 
     */
    public String accessConfigurationId() {
        return this.accessConfigurationId;
    }
    /**
     * @return The AccessConfigurationName of the Access Configuration.
     * 
     */
    public String accessConfigurationName() {
        return this.accessConfigurationName;
    }
    /**
     * @return The Created Time of the Directory.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The Description of the Directory.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Directory.
     * 
     */
    public String directoryId() {
        return this.directoryId;
    }
    /**
     * @return The ID of the Access Configuration.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Policy List.
     * 
     */
    public List<GetAccessConfigurationsConfigurationPermissionPolicy> permissionPolicies() {
        return this.permissionPolicies;
    }
    /**
     * @return The RelayState of the Access Configuration.
     * 
     */
    public String relayState() {
        return this.relayState;
    }
    /**
     * @return The SessionDuration of the Access Configuration.
     * 
     */
    public Integer sessionDuration() {
        return this.sessionDuration;
    }
    /**
     * @return The StatusNotifications of the Access Configuration.
     * 
     */
    public List<String> statusNotifications() {
        return this.statusNotifications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessConfigurationsConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessConfigurationId;
        private String accessConfigurationName;
        private String createTime;
        private String description;
        private String directoryId;
        private String id;
        private List<GetAccessConfigurationsConfigurationPermissionPolicy> permissionPolicies;
        private String relayState;
        private Integer sessionDuration;
        private List<String> statusNotifications;
        public Builder() {}
        public Builder(GetAccessConfigurationsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigurationId = defaults.accessConfigurationId;
    	      this.accessConfigurationName = defaults.accessConfigurationName;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.directoryId = defaults.directoryId;
    	      this.id = defaults.id;
    	      this.permissionPolicies = defaults.permissionPolicies;
    	      this.relayState = defaults.relayState;
    	      this.sessionDuration = defaults.sessionDuration;
    	      this.statusNotifications = defaults.statusNotifications;
        }

        @CustomType.Setter
        public Builder accessConfigurationId(String accessConfigurationId) {
            if (accessConfigurationId == null) {
              throw new MissingRequiredPropertyException("GetAccessConfigurationsConfiguration", "accessConfigurationId");
            }
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder accessConfigurationName(String accessConfigurationName) {
            if (accessConfigurationName == null) {
              throw new MissingRequiredPropertyException("GetAccessConfigurationsConfiguration", "accessConfigurationName");
            }
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetAccessConfigurationsConfiguration", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetAccessConfigurationsConfiguration", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder directoryId(String directoryId) {
            if (directoryId == null) {
              throw new MissingRequiredPropertyException("GetAccessConfigurationsConfiguration", "directoryId");
            }
            this.directoryId = directoryId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAccessConfigurationsConfiguration", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder permissionPolicies(List<GetAccessConfigurationsConfigurationPermissionPolicy> permissionPolicies) {
            if (permissionPolicies == null) {
              throw new MissingRequiredPropertyException("GetAccessConfigurationsConfiguration", "permissionPolicies");
            }
            this.permissionPolicies = permissionPolicies;
            return this;
        }
        public Builder permissionPolicies(GetAccessConfigurationsConfigurationPermissionPolicy... permissionPolicies) {
            return permissionPolicies(List.of(permissionPolicies));
        }
        @CustomType.Setter
        public Builder relayState(String relayState) {
            if (relayState == null) {
              throw new MissingRequiredPropertyException("GetAccessConfigurationsConfiguration", "relayState");
            }
            this.relayState = relayState;
            return this;
        }
        @CustomType.Setter
        public Builder sessionDuration(Integer sessionDuration) {
            if (sessionDuration == null) {
              throw new MissingRequiredPropertyException("GetAccessConfigurationsConfiguration", "sessionDuration");
            }
            this.sessionDuration = sessionDuration;
            return this;
        }
        @CustomType.Setter
        public Builder statusNotifications(List<String> statusNotifications) {
            if (statusNotifications == null) {
              throw new MissingRequiredPropertyException("GetAccessConfigurationsConfiguration", "statusNotifications");
            }
            this.statusNotifications = statusNotifications;
            return this;
        }
        public Builder statusNotifications(String... statusNotifications) {
            return statusNotifications(List.of(statusNotifications));
        }
        public GetAccessConfigurationsConfiguration build() {
            final var _resultValue = new GetAccessConfigurationsConfiguration();
            _resultValue.accessConfigurationId = accessConfigurationId;
            _resultValue.accessConfigurationName = accessConfigurationName;
            _resultValue.createTime = createTime;
            _resultValue.description = description;
            _resultValue.directoryId = directoryId;
            _resultValue.id = id;
            _resultValue.permissionPolicies = permissionPolicies;
            _resultValue.relayState = relayState;
            _resultValue.sessionDuration = sessionDuration;
            _resultValue.statusNotifications = statusNotifications;
            return _resultValue;
        }
    }
}