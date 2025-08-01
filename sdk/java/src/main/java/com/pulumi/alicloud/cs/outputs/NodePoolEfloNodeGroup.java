// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NodePoolEfloNodeGroup {
    /**
     * @return The ID of the associated Lingjun cluster is required when creating a Lingjun node pool.
     * 
     */
    private @Nullable String clusterId;
    /**
     * @return When creating a Lingjun node pool, you need the Lingjun group ID of the associated Lingjun cluster.
     * 
     */
    private @Nullable String groupId;

    private NodePoolEfloNodeGroup() {}
    /**
     * @return The ID of the associated Lingjun cluster is required when creating a Lingjun node pool.
     * 
     */
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    /**
     * @return When creating a Lingjun node pool, you need the Lingjun group ID of the associated Lingjun cluster.
     * 
     */
    public Optional<String> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolEfloNodeGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clusterId;
        private @Nullable String groupId;
        public Builder() {}
        public Builder(NodePoolEfloNodeGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.groupId = defaults.groupId;
        }

        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {

            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder groupId(@Nullable String groupId) {

            this.groupId = groupId;
            return this;
        }
        public NodePoolEfloNodeGroup build() {
            final var _resultValue = new NodePoolEfloNodeGroup();
            _resultValue.clusterId = clusterId;
            _resultValue.groupId = groupId;
            return _resultValue;
        }
    }
}
