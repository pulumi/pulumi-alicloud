// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetNetworkAclsAcl;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkAclsResult {
    private final List<GetNetworkAclsAcl> acls;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    private final @Nullable String nameRegex;
    private final List<String> names;
    private final @Nullable String networkAclName;
    private final @Nullable String outputFile;
    private final @Nullable String resourceId;
    private final @Nullable String resourceType;
    private final @Nullable String status;
    private final @Nullable String vpcId;

    @CustomType.Constructor
    private GetNetworkAclsResult(
        @CustomType.Parameter("acls") List<GetNetworkAclsAcl> acls,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("networkAclName") @Nullable String networkAclName,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("resourceId") @Nullable String resourceId,
        @CustomType.Parameter("resourceType") @Nullable String resourceType,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("vpcId") @Nullable String vpcId) {
        this.acls = acls;
        this.id = id;
        this.ids = ids;
        this.nameRegex = nameRegex;
        this.names = names;
        this.networkAclName = networkAclName;
        this.outputFile = outputFile;
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.status = status;
        this.vpcId = vpcId;
    }

    public List<GetNetworkAclsAcl> acls() {
        return this.acls;
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
    public List<String> names() {
        return this.names;
    }
    public Optional<String> networkAclName() {
        return Optional.ofNullable(this.networkAclName);
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkAclsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetNetworkAclsAcl> acls;
        private String id;
        private List<String> ids;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String networkAclName;
        private @Nullable String outputFile;
        private @Nullable String resourceId;
        private @Nullable String resourceType;
        private @Nullable String status;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkAclsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acls = defaults.acls;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.networkAclName = defaults.networkAclName;
    	      this.outputFile = defaults.outputFile;
    	      this.resourceId = defaults.resourceId;
    	      this.resourceType = defaults.resourceType;
    	      this.status = defaults.status;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder acls(List<GetNetworkAclsAcl> acls) {
            this.acls = Objects.requireNonNull(acls);
            return this;
        }
        public Builder acls(GetNetworkAclsAcl... acls) {
            return acls(List.of(acls));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder networkAclName(@Nullable String networkAclName) {
            this.networkAclName = networkAclName;
            return this;
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }        public GetNetworkAclsResult build() {
            return new GetNetworkAclsResult(acls, id, ids, nameRegex, names, networkAclName, outputFile, resourceId, resourceType, status, vpcId);
        }
    }
}