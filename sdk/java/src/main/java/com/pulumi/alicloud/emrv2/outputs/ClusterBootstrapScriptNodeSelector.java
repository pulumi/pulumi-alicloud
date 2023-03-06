// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emrv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterBootstrapScriptNodeSelector {
    /**
     * @return The configuration effected which node group id of emr cluster.
     * 
     */
    private @Nullable String nodeGroupId;
    /**
     * @return The configuration effected which node group name of emr cluster.
     * 
     */
    private @Nullable String nodeGroupName;
    /**
     * @return The bootstrap scripts execution target node group types.
     * 
     */
    private @Nullable List<String> nodeGroupTypes;
    /**
     * @return The bootstrap scripts execution target node names.
     * 
     */
    private @Nullable List<String> nodeNames;
    /**
     * @return The bootstrap scripts execution target node select type. Supported value: NODE, NODEGROUP or CLUSTER.
     * 
     */
    private String nodeSelectType;

    private ClusterBootstrapScriptNodeSelector() {}
    /**
     * @return The configuration effected which node group id of emr cluster.
     * 
     */
    public Optional<String> nodeGroupId() {
        return Optional.ofNullable(this.nodeGroupId);
    }
    /**
     * @return The configuration effected which node group name of emr cluster.
     * 
     */
    public Optional<String> nodeGroupName() {
        return Optional.ofNullable(this.nodeGroupName);
    }
    /**
     * @return The bootstrap scripts execution target node group types.
     * 
     */
    public List<String> nodeGroupTypes() {
        return this.nodeGroupTypes == null ? List.of() : this.nodeGroupTypes;
    }
    /**
     * @return The bootstrap scripts execution target node names.
     * 
     */
    public List<String> nodeNames() {
        return this.nodeNames == null ? List.of() : this.nodeNames;
    }
    /**
     * @return The bootstrap scripts execution target node select type. Supported value: NODE, NODEGROUP or CLUSTER.
     * 
     */
    public String nodeSelectType() {
        return this.nodeSelectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterBootstrapScriptNodeSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String nodeGroupId;
        private @Nullable String nodeGroupName;
        private @Nullable List<String> nodeGroupTypes;
        private @Nullable List<String> nodeNames;
        private String nodeSelectType;
        public Builder() {}
        public Builder(ClusterBootstrapScriptNodeSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeGroupId = defaults.nodeGroupId;
    	      this.nodeGroupName = defaults.nodeGroupName;
    	      this.nodeGroupTypes = defaults.nodeGroupTypes;
    	      this.nodeNames = defaults.nodeNames;
    	      this.nodeSelectType = defaults.nodeSelectType;
        }

        @CustomType.Setter
        public Builder nodeGroupId(@Nullable String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder nodeGroupName(@Nullable String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder nodeGroupTypes(@Nullable List<String> nodeGroupTypes) {
            this.nodeGroupTypes = nodeGroupTypes;
            return this;
        }
        public Builder nodeGroupTypes(String... nodeGroupTypes) {
            return nodeGroupTypes(List.of(nodeGroupTypes));
        }
        @CustomType.Setter
        public Builder nodeNames(@Nullable List<String> nodeNames) {
            this.nodeNames = nodeNames;
            return this;
        }
        public Builder nodeNames(String... nodeNames) {
            return nodeNames(List.of(nodeNames));
        }
        @CustomType.Setter
        public Builder nodeSelectType(String nodeSelectType) {
            this.nodeSelectType = Objects.requireNonNull(nodeSelectType);
            return this;
        }
        public ClusterBootstrapScriptNodeSelector build() {
            final var o = new ClusterBootstrapScriptNodeSelector();
            o.nodeGroupId = nodeGroupId;
            o.nodeGroupName = nodeGroupName;
            o.nodeGroupTypes = nodeGroupTypes;
            o.nodeNames = nodeNames;
            o.nodeSelectType = nodeSelectType;
            return o;
        }
    }
}