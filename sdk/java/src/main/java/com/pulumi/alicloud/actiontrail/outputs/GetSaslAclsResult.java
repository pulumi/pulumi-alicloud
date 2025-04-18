// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.actiontrail.outputs;

import com.pulumi.alicloud.actiontrail.outputs.GetSaslAclsAcl;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSaslAclsResult {
    /**
     * @return The resource name of the sasl acl.
     * 
     */
    private String aclResourceName;
    /**
     * @return The resource type of the sasl acl.
     * 
     */
    private String aclResourceType;
    /**
     * @return A list of sasl acls. Each element contains the following attributes:
     * 
     */
    private List<GetSaslAclsAcl> acls;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instanceId;
    private @Nullable String outputFile;
    /**
     * @return The username of the sasl acl.
     * 
     */
    private String username;

    private GetSaslAclsResult() {}
    /**
     * @return The resource name of the sasl acl.
     * 
     */
    public String aclResourceName() {
        return this.aclResourceName;
    }
    /**
     * @return The resource type of the sasl acl.
     * 
     */
    public String aclResourceType() {
        return this.aclResourceType;
    }
    /**
     * @return A list of sasl acls. Each element contains the following attributes:
     * 
     */
    public List<GetSaslAclsAcl> acls() {
        return this.acls;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceId() {
        return this.instanceId;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    /**
     * @return The username of the sasl acl.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSaslAclsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String aclResourceName;
        private String aclResourceType;
        private List<GetSaslAclsAcl> acls;
        private String id;
        private String instanceId;
        private @Nullable String outputFile;
        private String username;
        public Builder() {}
        public Builder(GetSaslAclsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclResourceName = defaults.aclResourceName;
    	      this.aclResourceType = defaults.aclResourceType;
    	      this.acls = defaults.acls;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.outputFile = defaults.outputFile;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder aclResourceName(String aclResourceName) {
            if (aclResourceName == null) {
              throw new MissingRequiredPropertyException("GetSaslAclsResult", "aclResourceName");
            }
            this.aclResourceName = aclResourceName;
            return this;
        }
        @CustomType.Setter
        public Builder aclResourceType(String aclResourceType) {
            if (aclResourceType == null) {
              throw new MissingRequiredPropertyException("GetSaslAclsResult", "aclResourceType");
            }
            this.aclResourceType = aclResourceType;
            return this;
        }
        @CustomType.Setter
        public Builder acls(List<GetSaslAclsAcl> acls) {
            if (acls == null) {
              throw new MissingRequiredPropertyException("GetSaslAclsResult", "acls");
            }
            this.acls = acls;
            return this;
        }
        public Builder acls(GetSaslAclsAcl... acls) {
            return acls(List.of(acls));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSaslAclsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            if (instanceId == null) {
              throw new MissingRequiredPropertyException("GetSaslAclsResult", "instanceId");
            }
            this.instanceId = instanceId;
            return this;
        }
        @CustomType.Setter
        public Builder outputFile(@Nullable String outputFile) {

            this.outputFile = outputFile;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetSaslAclsResult", "username");
            }
            this.username = username;
            return this;
        }
        public GetSaslAclsResult build() {
            final var _resultValue = new GetSaslAclsResult();
            _resultValue.aclResourceName = aclResourceName;
            _resultValue.aclResourceType = aclResourceType;
            _resultValue.acls = acls;
            _resultValue.id = id;
            _resultValue.instanceId = instanceId;
            _resultValue.outputFile = outputFile;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
