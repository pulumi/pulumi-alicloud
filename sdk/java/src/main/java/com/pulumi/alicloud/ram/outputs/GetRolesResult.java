// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram.outputs;

import com.pulumi.alicloud.ram.outputs.GetRolesRole;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRolesResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return A list of ram role IDs.
     * 
     */
    private List<String> ids;
    private @Nullable String nameRegex;
    /**
     * @return A list of ram role names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    private @Nullable String policyName;
    private @Nullable String policyType;
    /**
     * @return A list of roles. Each element contains the following attributes:
     * 
     */
    private List<GetRolesRole> roles;

    private GetRolesResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of ram role IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of ram role names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> policyName() {
        return Optional.ofNullable(this.policyName);
    }
    public Optional<String> policyType() {
        return Optional.ofNullable(this.policyType);
    }
    /**
     * @return A list of roles. Each element contains the following attributes:
     * 
     */
    public List<GetRolesRole> roles() {
        return this.roles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRolesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String policyName;
        private @Nullable String policyType;
        private List<GetRolesRole> roles;
        public Builder() {}
        public Builder(GetRolesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.policyName = defaults.policyName;
    	      this.policyType = defaults.policyType;
    	      this.roles = defaults.roles;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRolesResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetRolesResult", "ids");
            }
            this.ids = ids;
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        @CustomType.Setter
        public Builder nameRegex(@Nullable String nameRegex) {

            this.nameRegex = nameRegex;
            return this;
        }
        @CustomType.Setter
        public Builder names(List<String> names) {
            if (names == null) {
              throw new MissingRequiredPropertyException("GetRolesResult", "names");
            }
            this.names = names;
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder policyName(@Nullable String policyName) {

            this.policyName = policyName;
            return this;
        }
        @CustomType.Setter
        public Builder policyType(@Nullable String policyType) {

            this.policyType = policyType;
            return this;
        }
        @CustomType.Setter
        public Builder roles(List<GetRolesRole> roles) {
            if (roles == null) {
              throw new MissingRequiredPropertyException("GetRolesResult", "roles");
            }
            this.roles = roles;
            return this;
        }
        public Builder roles(GetRolesRole... roles) {
            return roles(List.of(roles));
        }
        public GetRolesResult build() {
            final var _resultValue = new GetRolesResult();
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.policyName = policyName;
            _resultValue.policyType = policyType;
            _resultValue.roles = roles;
            return _resultValue;
        }
    }
}