// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eflo.outputs;

import com.pulumi.alicloud.eflo.outputs.ClusterNodeGroupNode;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNodeGroup {
    /**
     * @return System Image ID
     * 
     */
    private @Nullable String imageId;
    /**
     * @return Model
     * 
     */
    private @Nullable String machineType;
    /**
     * @return Node Group Description
     * 
     */
    private @Nullable String nodeGroupDescription;
    /**
     * @return Node Group Name
     * 
     */
    private @Nullable String nodeGroupName;
    /**
     * @return Node List See `nodes` below.
     * 
     */
    private @Nullable List<ClusterNodeGroupNode> nodes;
    /**
     * @return Instance custom data. It needs to be encoded in Base64 mode, and the original data is at most 16KB.
     * 
     */
    private @Nullable String userData;
    /**
     * @return Zone ID
     * 
     */
    private @Nullable String zoneId;

    private ClusterNodeGroup() {}
    /**
     * @return System Image ID
     * 
     */
    public Optional<String> imageId() {
        return Optional.ofNullable(this.imageId);
    }
    /**
     * @return Model
     * 
     */
    public Optional<String> machineType() {
        return Optional.ofNullable(this.machineType);
    }
    /**
     * @return Node Group Description
     * 
     */
    public Optional<String> nodeGroupDescription() {
        return Optional.ofNullable(this.nodeGroupDescription);
    }
    /**
     * @return Node Group Name
     * 
     */
    public Optional<String> nodeGroupName() {
        return Optional.ofNullable(this.nodeGroupName);
    }
    /**
     * @return Node List See `nodes` below.
     * 
     */
    public List<ClusterNodeGroupNode> nodes() {
        return this.nodes == null ? List.of() : this.nodes;
    }
    /**
     * @return Instance custom data. It needs to be encoded in Base64 mode, and the original data is at most 16KB.
     * 
     */
    public Optional<String> userData() {
        return Optional.ofNullable(this.userData);
    }
    /**
     * @return Zone ID
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String imageId;
        private @Nullable String machineType;
        private @Nullable String nodeGroupDescription;
        private @Nullable String nodeGroupName;
        private @Nullable List<ClusterNodeGroupNode> nodes;
        private @Nullable String userData;
        private @Nullable String zoneId;
        public Builder() {}
        public Builder(ClusterNodeGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageId = defaults.imageId;
    	      this.machineType = defaults.machineType;
    	      this.nodeGroupDescription = defaults.nodeGroupDescription;
    	      this.nodeGroupName = defaults.nodeGroupName;
    	      this.nodes = defaults.nodes;
    	      this.userData = defaults.userData;
    	      this.zoneId = defaults.zoneId;
        }

        @CustomType.Setter
        public Builder imageId(@Nullable String imageId) {

            this.imageId = imageId;
            return this;
        }
        @CustomType.Setter
        public Builder machineType(@Nullable String machineType) {

            this.machineType = machineType;
            return this;
        }
        @CustomType.Setter
        public Builder nodeGroupDescription(@Nullable String nodeGroupDescription) {

            this.nodeGroupDescription = nodeGroupDescription;
            return this;
        }
        @CustomType.Setter
        public Builder nodeGroupName(@Nullable String nodeGroupName) {

            this.nodeGroupName = nodeGroupName;
            return this;
        }
        @CustomType.Setter
        public Builder nodes(@Nullable List<ClusterNodeGroupNode> nodes) {

            this.nodes = nodes;
            return this;
        }
        public Builder nodes(ClusterNodeGroupNode... nodes) {
            return nodes(List.of(nodes));
        }
        @CustomType.Setter
        public Builder userData(@Nullable String userData) {

            this.userData = userData;
            return this;
        }
        @CustomType.Setter
        public Builder zoneId(@Nullable String zoneId) {

            this.zoneId = zoneId;
            return this;
        }
        public ClusterNodeGroup build() {
            final var _resultValue = new ClusterNodeGroup();
            _resultValue.imageId = imageId;
            _resultValue.machineType = machineType;
            _resultValue.nodeGroupDescription = nodeGroupDescription;
            _resultValue.nodeGroupName = nodeGroupName;
            _resultValue.nodes = nodes;
            _resultValue.userData = userData;
            _resultValue.zoneId = zoneId;
            return _resultValue;
        }
    }
}
