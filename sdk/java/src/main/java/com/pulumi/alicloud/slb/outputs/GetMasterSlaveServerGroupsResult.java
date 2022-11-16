// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.slb.outputs;

import com.pulumi.alicloud.slb.outputs.GetMasterSlaveServerGroupsGroup;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMasterSlaveServerGroupsResult {
    /**
     * @return A list of SLB master slave server groups. Each element contains the following attributes:
     * 
     */
    private final List<GetMasterSlaveServerGroupsGroup> groups;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return A list of SLB master slave server groups IDs.
     * 
     */
    private final List<String> ids;
    private final String loadBalancerId;
    private final @Nullable String nameRegex;
    /**
     * @return A list of SLB master slave server groups names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;

    @CustomType.Constructor
    private GetMasterSlaveServerGroupsResult(
        @CustomType.Parameter("groups") List<GetMasterSlaveServerGroupsGroup> groups,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("loadBalancerId") String loadBalancerId,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile) {
        this.groups = groups;
        this.id = id;
        this.ids = ids;
        this.loadBalancerId = loadBalancerId;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
    }

    /**
     * @return A list of SLB master slave server groups. Each element contains the following attributes:
     * 
     */
    public List<GetMasterSlaveServerGroupsGroup> groups() {
        return this.groups;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of SLB master slave server groups IDs.
     * 
     */
    public List<String> ids() {
        return this.ids;
    }
    public String loadBalancerId() {
        return this.loadBalancerId;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of SLB master slave server groups names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMasterSlaveServerGroupsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetMasterSlaveServerGroupsGroup> groups;
        private String id;
        private List<String> ids;
        private String loadBalancerId;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMasterSlaveServerGroupsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.loadBalancerId = defaults.loadBalancerId;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
        }

        public Builder groups(List<GetMasterSlaveServerGroupsGroup> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public Builder groups(GetMasterSlaveServerGroupsGroup... groups) {
            return groups(List.of(groups));
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
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = Objects.requireNonNull(loadBalancerId);
            return this;
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
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }        public GetMasterSlaveServerGroupsResult build() {
            return new GetMasterSlaveServerGroupsResult(groups, id, ids, loadBalancerId, nameRegex, names, outputFile);
        }
    }
}