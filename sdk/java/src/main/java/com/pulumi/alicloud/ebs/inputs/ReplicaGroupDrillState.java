// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ebs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReplicaGroupDrillState extends com.pulumi.resources.ResourceArgs {

    public static final ReplicaGroupDrillState Empty = new ReplicaGroupDrillState();

    /**
     * The ID of the replication group. You can use the describediskreplicaggroups interface to query the asynchronous replication group list to obtain the value of the replication group ID input parameter.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The ID of the replication group. You can use the describediskreplicaggroups interface to query the asynchronous replication group list to obtain the value of the replication group ID input parameter.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * The first ID of the resource.
     * 
     */
    @Import(name="replicaGroupDrillId")
    private @Nullable Output<String> replicaGroupDrillId;

    /**
     * @return The first ID of the resource.
     * 
     */
    public Optional<Output<String>> replicaGroupDrillId() {
        return Optional.ofNullable(this.replicaGroupDrillId);
    }

    /**
     * Walkthrough status. _failed: Execution failed._failed: Cleanup failed.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Walkthrough status. _failed: Execution failed._failed: Cleanup failed.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private ReplicaGroupDrillState() {}

    private ReplicaGroupDrillState(ReplicaGroupDrillState $) {
        this.groupId = $.groupId;
        this.replicaGroupDrillId = $.replicaGroupDrillId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReplicaGroupDrillState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReplicaGroupDrillState $;

        public Builder() {
            $ = new ReplicaGroupDrillState();
        }

        public Builder(ReplicaGroupDrillState defaults) {
            $ = new ReplicaGroupDrillState(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId The ID of the replication group. You can use the describediskreplicaggroups interface to query the asynchronous replication group list to obtain the value of the replication group ID input parameter.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The ID of the replication group. You can use the describediskreplicaggroups interface to query the asynchronous replication group list to obtain the value of the replication group ID input parameter.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param replicaGroupDrillId The first ID of the resource.
         * 
         * @return builder
         * 
         */
        public Builder replicaGroupDrillId(@Nullable Output<String> replicaGroupDrillId) {
            $.replicaGroupDrillId = replicaGroupDrillId;
            return this;
        }

        /**
         * @param replicaGroupDrillId The first ID of the resource.
         * 
         * @return builder
         * 
         */
        public Builder replicaGroupDrillId(String replicaGroupDrillId) {
            return replicaGroupDrillId(Output.of(replicaGroupDrillId));
        }

        /**
         * @param status Walkthrough status. _failed: Execution failed._failed: Cleanup failed.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Walkthrough status. _failed: Execution failed._failed: Cleanup failed.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public ReplicaGroupDrillState build() {
            return $;
        }
    }

}
