// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cen.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGrantState extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGrantState Empty = new InstanceGrantState();

    /**
     * The ID of the CEN.
     * 
     */
    @Import(name="cenId")
    private @Nullable Output<String> cenId;

    /**
     * @return The ID of the CEN.
     * 
     */
    public Optional<Output<String>> cenId() {
        return Optional.ofNullable(this.cenId);
    }

    /**
     * The owner UID of the  CEN which the child instance granted to.
     * 
     */
    @Import(name="cenOwnerId")
    private @Nullable Output<String> cenOwnerId;

    /**
     * @return The owner UID of the  CEN which the child instance granted to.
     * 
     */
    public Optional<Output<String>> cenOwnerId() {
        return Optional.ofNullable(this.cenOwnerId);
    }

    /**
     * The ID of the child instance to grant.
     * 
     */
    @Import(name="childInstanceId")
    private @Nullable Output<String> childInstanceId;

    /**
     * @return The ID of the child instance to grant.
     * 
     */
    public Optional<Output<String>> childInstanceId() {
        return Optional.ofNullable(this.childInstanceId);
    }

    private InstanceGrantState() {}

    private InstanceGrantState(InstanceGrantState $) {
        this.cenId = $.cenId;
        this.cenOwnerId = $.cenOwnerId;
        this.childInstanceId = $.childInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGrantState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGrantState $;

        public Builder() {
            $ = new InstanceGrantState();
        }

        public Builder(InstanceGrantState defaults) {
            $ = new InstanceGrantState(Objects.requireNonNull(defaults));
        }

        /**
         * @param cenId The ID of the CEN.
         * 
         * @return builder
         * 
         */
        public Builder cenId(@Nullable Output<String> cenId) {
            $.cenId = cenId;
            return this;
        }

        /**
         * @param cenId The ID of the CEN.
         * 
         * @return builder
         * 
         */
        public Builder cenId(String cenId) {
            return cenId(Output.of(cenId));
        }

        /**
         * @param cenOwnerId The owner UID of the  CEN which the child instance granted to.
         * 
         * @return builder
         * 
         */
        public Builder cenOwnerId(@Nullable Output<String> cenOwnerId) {
            $.cenOwnerId = cenOwnerId;
            return this;
        }

        /**
         * @param cenOwnerId The owner UID of the  CEN which the child instance granted to.
         * 
         * @return builder
         * 
         */
        public Builder cenOwnerId(String cenOwnerId) {
            return cenOwnerId(Output.of(cenOwnerId));
        }

        /**
         * @param childInstanceId The ID of the child instance to grant.
         * 
         * @return builder
         * 
         */
        public Builder childInstanceId(@Nullable Output<String> childInstanceId) {
            $.childInstanceId = childInstanceId;
            return this;
        }

        /**
         * @param childInstanceId The ID of the child instance to grant.
         * 
         * @return builder
         * 
         */
        public Builder childInstanceId(String childInstanceId) {
            return childInstanceId(Output.of(childInstanceId));
        }

        public InstanceGrantState build() {
            return $;
        }
    }

}
