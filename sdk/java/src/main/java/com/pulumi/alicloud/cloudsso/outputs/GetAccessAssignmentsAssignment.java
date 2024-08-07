// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAccessAssignmentsAssignment {
    /**
     * @return Access configuration ID.
     * 
     */
    private String accessConfigurationId;
    /**
     * @return The name of the access configuration.
     * 
     */
    private String accessConfigurationName;
    /**
     * @return Directory ID.
     * 
     */
    private String directoryId;
    /**
     * @return The ID of the Access Assignment.
     * 
     */
    private String id;
    /**
     * @return The ID of the access assignment.
     * 
     */
    private String principalId;
    /**
     * @return Cloud SSO identity name.
     * 
     */
    private String principalName;
    /**
     * @return Create the identity type of the access assignment, which can be a user or a user group.
     * 
     */
    private String principalType;
    /**
     * @return The ID of the target to create the resource range.
     * 
     */
    private String targetId;
    /**
     * @return Task target name.
     * 
     */
    private String targetName;
    /**
     * @return The path name of the task target in the resource directory.
     * 
     */
    private String targetPathName;
    /**
     * @return The type of the resource range target to be accessed. Only a single RD primary account or member account can be specified in the first phase.
     * 
     */
    private String targetType;

    private GetAccessAssignmentsAssignment() {}
    /**
     * @return Access configuration ID.
     * 
     */
    public String accessConfigurationId() {
        return this.accessConfigurationId;
    }
    /**
     * @return The name of the access configuration.
     * 
     */
    public String accessConfigurationName() {
        return this.accessConfigurationName;
    }
    /**
     * @return Directory ID.
     * 
     */
    public String directoryId() {
        return this.directoryId;
    }
    /**
     * @return The ID of the Access Assignment.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the access assignment.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return Cloud SSO identity name.
     * 
     */
    public String principalName() {
        return this.principalName;
    }
    /**
     * @return Create the identity type of the access assignment, which can be a user or a user group.
     * 
     */
    public String principalType() {
        return this.principalType;
    }
    /**
     * @return The ID of the target to create the resource range.
     * 
     */
    public String targetId() {
        return this.targetId;
    }
    /**
     * @return Task target name.
     * 
     */
    public String targetName() {
        return this.targetName;
    }
    /**
     * @return The path name of the task target in the resource directory.
     * 
     */
    public String targetPathName() {
        return this.targetPathName;
    }
    /**
     * @return The type of the resource range target to be accessed. Only a single RD primary account or member account can be specified in the first phase.
     * 
     */
    public String targetType() {
        return this.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessAssignmentsAssignment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessConfigurationId;
        private String accessConfigurationName;
        private String directoryId;
        private String id;
        private String principalId;
        private String principalName;
        private String principalType;
        private String targetId;
        private String targetName;
        private String targetPathName;
        private String targetType;
        public Builder() {}
        public Builder(GetAccessAssignmentsAssignment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigurationId = defaults.accessConfigurationId;
    	      this.accessConfigurationName = defaults.accessConfigurationName;
    	      this.directoryId = defaults.directoryId;
    	      this.id = defaults.id;
    	      this.principalId = defaults.principalId;
    	      this.principalName = defaults.principalName;
    	      this.principalType = defaults.principalType;
    	      this.targetId = defaults.targetId;
    	      this.targetName = defaults.targetName;
    	      this.targetPathName = defaults.targetPathName;
    	      this.targetType = defaults.targetType;
        }

        @CustomType.Setter
        public Builder accessConfigurationId(String accessConfigurationId) {
            if (accessConfigurationId == null) {
              throw new MissingRequiredPropertyException("GetAccessAssignmentsAssignment", "accessConfigurationId");
            }
            this.accessConfigurationId = accessConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder accessConfigurationName(String accessConfigurationName) {
            if (accessConfigurationName == null) {
              throw new MissingRequiredPropertyException("GetAccessAssignmentsAssignment", "accessConfigurationName");
            }
            this.accessConfigurationName = accessConfigurationName;
            return this;
        }
        @CustomType.Setter
        public Builder directoryId(String directoryId) {
            if (directoryId == null) {
              throw new MissingRequiredPropertyException("GetAccessAssignmentsAssignment", "directoryId");
            }
            this.directoryId = directoryId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAccessAssignmentsAssignment", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder principalId(String principalId) {
            if (principalId == null) {
              throw new MissingRequiredPropertyException("GetAccessAssignmentsAssignment", "principalId");
            }
            this.principalId = principalId;
            return this;
        }
        @CustomType.Setter
        public Builder principalName(String principalName) {
            if (principalName == null) {
              throw new MissingRequiredPropertyException("GetAccessAssignmentsAssignment", "principalName");
            }
            this.principalName = principalName;
            return this;
        }
        @CustomType.Setter
        public Builder principalType(String principalType) {
            if (principalType == null) {
              throw new MissingRequiredPropertyException("GetAccessAssignmentsAssignment", "principalType");
            }
            this.principalType = principalType;
            return this;
        }
        @CustomType.Setter
        public Builder targetId(String targetId) {
            if (targetId == null) {
              throw new MissingRequiredPropertyException("GetAccessAssignmentsAssignment", "targetId");
            }
            this.targetId = targetId;
            return this;
        }
        @CustomType.Setter
        public Builder targetName(String targetName) {
            if (targetName == null) {
              throw new MissingRequiredPropertyException("GetAccessAssignmentsAssignment", "targetName");
            }
            this.targetName = targetName;
            return this;
        }
        @CustomType.Setter
        public Builder targetPathName(String targetPathName) {
            if (targetPathName == null) {
              throw new MissingRequiredPropertyException("GetAccessAssignmentsAssignment", "targetPathName");
            }
            this.targetPathName = targetPathName;
            return this;
        }
        @CustomType.Setter
        public Builder targetType(String targetType) {
            if (targetType == null) {
              throw new MissingRequiredPropertyException("GetAccessAssignmentsAssignment", "targetType");
            }
            this.targetType = targetType;
            return this;
        }
        public GetAccessAssignmentsAssignment build() {
            final var _resultValue = new GetAccessAssignmentsAssignment();
            _resultValue.accessConfigurationId = accessConfigurationId;
            _resultValue.accessConfigurationName = accessConfigurationName;
            _resultValue.directoryId = directoryId;
            _resultValue.id = id;
            _resultValue.principalId = principalId;
            _resultValue.principalName = principalName;
            _resultValue.principalType = principalType;
            _resultValue.targetId = targetId;
            _resultValue.targetName = targetName;
            _resultValue.targetPathName = targetPathName;
            _resultValue.targetType = targetType;
            return _resultValue;
        }
    }
}
