// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.maxcompute.outputs;

import com.pulumi.alicloud.maxcompute.outputs.ProjectSecurityPropertiesProjectProtection;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectSecurityProperties {
    /**
     * @return Whether to enable download permission check.
     * 
     */
    private @Nullable Boolean enableDownloadPrivilege;
    /**
     * @return Label authorization.
     * 
     */
    private @Nullable Boolean labelSecurity;
    /**
     * @return Project creator permissions.
     * 
     */
    private @Nullable Boolean objectCreatorHasAccessPermission;
    /**
     * @return Does the project creator have authorization rights.
     * 
     */
    private @Nullable Boolean objectCreatorHasGrantPermission;
    /**
     * @return Project protection. See `project_protection` below.
     * 
     */
    private @Nullable ProjectSecurityPropertiesProjectProtection projectProtection;
    /**
     * @return Whether to turn on ACL.
     * 
     */
    private @Nullable Boolean usingAcl;
    /**
     * @return Whether to enable Policy.
     * 
     */
    private @Nullable Boolean usingPolicy;

    private ProjectSecurityProperties() {}
    /**
     * @return Whether to enable download permission check.
     * 
     */
    public Optional<Boolean> enableDownloadPrivilege() {
        return Optional.ofNullable(this.enableDownloadPrivilege);
    }
    /**
     * @return Label authorization.
     * 
     */
    public Optional<Boolean> labelSecurity() {
        return Optional.ofNullable(this.labelSecurity);
    }
    /**
     * @return Project creator permissions.
     * 
     */
    public Optional<Boolean> objectCreatorHasAccessPermission() {
        return Optional.ofNullable(this.objectCreatorHasAccessPermission);
    }
    /**
     * @return Does the project creator have authorization rights.
     * 
     */
    public Optional<Boolean> objectCreatorHasGrantPermission() {
        return Optional.ofNullable(this.objectCreatorHasGrantPermission);
    }
    /**
     * @return Project protection. See `project_protection` below.
     * 
     */
    public Optional<ProjectSecurityPropertiesProjectProtection> projectProtection() {
        return Optional.ofNullable(this.projectProtection);
    }
    /**
     * @return Whether to turn on ACL.
     * 
     */
    public Optional<Boolean> usingAcl() {
        return Optional.ofNullable(this.usingAcl);
    }
    /**
     * @return Whether to enable Policy.
     * 
     */
    public Optional<Boolean> usingPolicy() {
        return Optional.ofNullable(this.usingPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSecurityProperties defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableDownloadPrivilege;
        private @Nullable Boolean labelSecurity;
        private @Nullable Boolean objectCreatorHasAccessPermission;
        private @Nullable Boolean objectCreatorHasGrantPermission;
        private @Nullable ProjectSecurityPropertiesProjectProtection projectProtection;
        private @Nullable Boolean usingAcl;
        private @Nullable Boolean usingPolicy;
        public Builder() {}
        public Builder(ProjectSecurityProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDownloadPrivilege = defaults.enableDownloadPrivilege;
    	      this.labelSecurity = defaults.labelSecurity;
    	      this.objectCreatorHasAccessPermission = defaults.objectCreatorHasAccessPermission;
    	      this.objectCreatorHasGrantPermission = defaults.objectCreatorHasGrantPermission;
    	      this.projectProtection = defaults.projectProtection;
    	      this.usingAcl = defaults.usingAcl;
    	      this.usingPolicy = defaults.usingPolicy;
        }

        @CustomType.Setter
        public Builder enableDownloadPrivilege(@Nullable Boolean enableDownloadPrivilege) {

            this.enableDownloadPrivilege = enableDownloadPrivilege;
            return this;
        }
        @CustomType.Setter
        public Builder labelSecurity(@Nullable Boolean labelSecurity) {

            this.labelSecurity = labelSecurity;
            return this;
        }
        @CustomType.Setter
        public Builder objectCreatorHasAccessPermission(@Nullable Boolean objectCreatorHasAccessPermission) {

            this.objectCreatorHasAccessPermission = objectCreatorHasAccessPermission;
            return this;
        }
        @CustomType.Setter
        public Builder objectCreatorHasGrantPermission(@Nullable Boolean objectCreatorHasGrantPermission) {

            this.objectCreatorHasGrantPermission = objectCreatorHasGrantPermission;
            return this;
        }
        @CustomType.Setter
        public Builder projectProtection(@Nullable ProjectSecurityPropertiesProjectProtection projectProtection) {

            this.projectProtection = projectProtection;
            return this;
        }
        @CustomType.Setter
        public Builder usingAcl(@Nullable Boolean usingAcl) {

            this.usingAcl = usingAcl;
            return this;
        }
        @CustomType.Setter
        public Builder usingPolicy(@Nullable Boolean usingPolicy) {

            this.usingPolicy = usingPolicy;
            return this;
        }
        public ProjectSecurityProperties build() {
            final var _resultValue = new ProjectSecurityProperties();
            _resultValue.enableDownloadPrivilege = enableDownloadPrivilege;
            _resultValue.labelSecurity = labelSecurity;
            _resultValue.objectCreatorHasAccessPermission = objectCreatorHasAccessPermission;
            _resultValue.objectCreatorHasGrantPermission = objectCreatorHasGrantPermission;
            _resultValue.projectProtection = projectProtection;
            _resultValue.usingAcl = usingAcl;
            _resultValue.usingPolicy = usingPolicy;
            return _resultValue;
        }
    }
}