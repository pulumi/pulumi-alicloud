// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga.outputs;

import com.pulumi.alicloud.ga.outputs.GetAclsAcl;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAclsResult {
    /**
     * @return The name of the acl.
     * 
     */
    private @Nullable String aclName;
    /**
     * @return A list of Ga Acls. Each element contains the following attributes:
     * 
     */
    private List<GetAclsAcl> acls;
    private @Nullable Boolean enableDetails;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> ids;
    private @Nullable String nameRegex;
    /**
     * @return A list of Acl names.
     * 
     */
    private List<String> names;
    private @Nullable String outputFile;
    /**
     * @return The status of the resource.
     * 
     */
    private @Nullable String status;

    private GetAclsResult() {}
    /**
     * @return The name of the acl.
     * 
     */
    public Optional<String> aclName() {
        return Optional.ofNullable(this.aclName);
    }
    /**
     * @return A list of Ga Acls. Each element contains the following attributes:
     * 
     */
    public List<GetAclsAcl> acls() {
        return this.acls;
    }
    public Optional<Boolean> enableDetails() {
        return Optional.ofNullable(this.enableDetails);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of Acl names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The status of the resource.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAclsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aclName;
        private List<GetAclsAcl> acls;
        private @Nullable Boolean enableDetails;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private @Nullable String status;
        public Builder() {}
        public Builder(GetAclsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclName = defaults.aclName;
    	      this.acls = defaults.acls;
    	      this.enableDetails = defaults.enableDetails;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder aclName(@Nullable String aclName) {

            this.aclName = aclName;
            return this;
        }
        @CustomType.Setter
        public Builder acls(List<GetAclsAcl> acls) {
            if (acls == null) {
              throw new MissingRequiredPropertyException("GetAclsResult", "acls");
            }
            this.acls = acls;
            return this;
        }
        public Builder acls(GetAclsAcl... acls) {
            return acls(List.of(acls));
        }
        @CustomType.Setter
        public Builder enableDetails(@Nullable Boolean enableDetails) {

            this.enableDetails = enableDetails;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetAclsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ids(List<String> ids) {
            if (ids == null) {
              throw new MissingRequiredPropertyException("GetAclsResult", "ids");
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
              throw new MissingRequiredPropertyException("GetAclsResult", "names");
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
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        public GetAclsResult build() {
            final var _resultValue = new GetAclsResult();
            _resultValue.aclName = aclName;
            _resultValue.acls = acls;
            _resultValue.enableDetails = enableDetails;
            _resultValue.id = id;
            _resultValue.ids = ids;
            _resultValue.nameRegex = nameRegex;
            _resultValue.names = names;
            _resultValue.outputFile = outputFile;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
