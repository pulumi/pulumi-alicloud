// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.alicloud.alb.inputs.ListenerDefaultActionForwardGroupConfigServerGroupTupleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;


public final class ListenerDefaultActionForwardGroupConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionForwardGroupConfigArgs Empty = new ListenerDefaultActionForwardGroupConfigArgs();

    @Import(name="serverGroupTuples", required=true)
    private Output<List<ListenerDefaultActionForwardGroupConfigServerGroupTupleArgs>> serverGroupTuples;

    public Output<List<ListenerDefaultActionForwardGroupConfigServerGroupTupleArgs>> serverGroupTuples() {
        return this.serverGroupTuples;
    }

    private ListenerDefaultActionForwardGroupConfigArgs() {}

    private ListenerDefaultActionForwardGroupConfigArgs(ListenerDefaultActionForwardGroupConfigArgs $) {
        this.serverGroupTuples = $.serverGroupTuples;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerDefaultActionForwardGroupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerDefaultActionForwardGroupConfigArgs $;

        public Builder() {
            $ = new ListenerDefaultActionForwardGroupConfigArgs();
        }

        public Builder(ListenerDefaultActionForwardGroupConfigArgs defaults) {
            $ = new ListenerDefaultActionForwardGroupConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder serverGroupTuples(Output<List<ListenerDefaultActionForwardGroupConfigServerGroupTupleArgs>> serverGroupTuples) {
            $.serverGroupTuples = serverGroupTuples;
            return this;
        }

        public Builder serverGroupTuples(List<ListenerDefaultActionForwardGroupConfigServerGroupTupleArgs> serverGroupTuples) {
            return serverGroupTuples(Output.of(serverGroupTuples));
        }

        public Builder serverGroupTuples(ListenerDefaultActionForwardGroupConfigServerGroupTupleArgs... serverGroupTuples) {
            return serverGroupTuples(List.of(serverGroupTuples));
        }

        public ListenerDefaultActionForwardGroupConfigArgs build() {
            if ($.serverGroupTuples == null) {
                throw new MissingRequiredPropertyException("ListenerDefaultActionForwardGroupConfigArgs", "serverGroupTuples");
            }
            return $;
        }
    }

}