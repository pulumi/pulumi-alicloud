// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.alicloud.alb.outputs.ListenerDefaultActionForwardGroupConfigServerGroupTuple;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ListenerDefaultActionForwardGroupConfig {
    /**
     * @return The destination server group to which requests are forwarded.
     * 
     */
    private final List<ListenerDefaultActionForwardGroupConfigServerGroupTuple> serverGroupTuples;

    @CustomType.Constructor
    private ListenerDefaultActionForwardGroupConfig(@CustomType.Parameter("serverGroupTuples") List<ListenerDefaultActionForwardGroupConfigServerGroupTuple> serverGroupTuples) {
        this.serverGroupTuples = serverGroupTuples;
    }

    /**
     * @return The destination server group to which requests are forwarded.
     * 
     */
    public List<ListenerDefaultActionForwardGroupConfigServerGroupTuple> serverGroupTuples() {
        return this.serverGroupTuples;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionForwardGroupConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ListenerDefaultActionForwardGroupConfigServerGroupTuple> serverGroupTuples;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionForwardGroupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverGroupTuples = defaults.serverGroupTuples;
        }

        public Builder serverGroupTuples(List<ListenerDefaultActionForwardGroupConfigServerGroupTuple> serverGroupTuples) {
            this.serverGroupTuples = Objects.requireNonNull(serverGroupTuples);
            return this;
        }
        public Builder serverGroupTuples(ListenerDefaultActionForwardGroupConfigServerGroupTuple... serverGroupTuples) {
            return serverGroupTuples(List.of(serverGroupTuples));
        }        public ListenerDefaultActionForwardGroupConfig build() {
            return new ListenerDefaultActionForwardGroupConfig(serverGroupTuples);
        }
    }
}