// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ess.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlbServerGroupAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final AlbServerGroupAttachmentState Empty = new AlbServerGroupAttachmentState();

    /**
     * ID of Alb Server Group.
     * 
     */
    @Import(name="albServerGroupId")
    private @Nullable Output<String> albServerGroupId;

    /**
     * @return ID of Alb Server Group.
     * 
     */
    public Optional<Output<String>> albServerGroupId() {
        return Optional.ofNullable(this.albServerGroupId);
    }

    /**
     * If instances of scaling group are attached/removed from slb backend server when attach/detach alb
     * server group from scaling group. Default to false.
     * 
     */
    @Import(name="forceAttach")
    private @Nullable Output<Boolean> forceAttach;

    /**
     * @return If instances of scaling group are attached/removed from slb backend server when attach/detach alb
     * server group from scaling group. Default to false.
     * 
     */
    public Optional<Output<Boolean>> forceAttach() {
        return Optional.ofNullable(this.forceAttach);
    }

    /**
     * The port will be used for Alb Server Group backend server.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port will be used for Alb Server Group backend server.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * ID of the scaling group.
     * 
     */
    @Import(name="scalingGroupId")
    private @Nullable Output<String> scalingGroupId;

    /**
     * @return ID of the scaling group.
     * 
     */
    public Optional<Output<String>> scalingGroupId() {
        return Optional.ofNullable(this.scalingGroupId);
    }

    /**
     * The weight of an ECS instance attached to the Alb Server Group.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return The weight of an ECS instance attached to the Alb Server Group.
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private AlbServerGroupAttachmentState() {}

    private AlbServerGroupAttachmentState(AlbServerGroupAttachmentState $) {
        this.albServerGroupId = $.albServerGroupId;
        this.forceAttach = $.forceAttach;
        this.port = $.port;
        this.scalingGroupId = $.scalingGroupId;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlbServerGroupAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlbServerGroupAttachmentState $;

        public Builder() {
            $ = new AlbServerGroupAttachmentState();
        }

        public Builder(AlbServerGroupAttachmentState defaults) {
            $ = new AlbServerGroupAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param albServerGroupId ID of Alb Server Group.
         * 
         * @return builder
         * 
         */
        public Builder albServerGroupId(@Nullable Output<String> albServerGroupId) {
            $.albServerGroupId = albServerGroupId;
            return this;
        }

        /**
         * @param albServerGroupId ID of Alb Server Group.
         * 
         * @return builder
         * 
         */
        public Builder albServerGroupId(String albServerGroupId) {
            return albServerGroupId(Output.of(albServerGroupId));
        }

        /**
         * @param forceAttach If instances of scaling group are attached/removed from slb backend server when attach/detach alb
         * server group from scaling group. Default to false.
         * 
         * @return builder
         * 
         */
        public Builder forceAttach(@Nullable Output<Boolean> forceAttach) {
            $.forceAttach = forceAttach;
            return this;
        }

        /**
         * @param forceAttach If instances of scaling group are attached/removed from slb backend server when attach/detach alb
         * server group from scaling group. Default to false.
         * 
         * @return builder
         * 
         */
        public Builder forceAttach(Boolean forceAttach) {
            return forceAttach(Output.of(forceAttach));
        }

        /**
         * @param port The port will be used for Alb Server Group backend server.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port will be used for Alb Server Group backend server.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param scalingGroupId ID of the scaling group.
         * 
         * @return builder
         * 
         */
        public Builder scalingGroupId(@Nullable Output<String> scalingGroupId) {
            $.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * @param scalingGroupId ID of the scaling group.
         * 
         * @return builder
         * 
         */
        public Builder scalingGroupId(String scalingGroupId) {
            return scalingGroupId(Output.of(scalingGroupId));
        }

        /**
         * @param weight The weight of an ECS instance attached to the Alb Server Group.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The weight of an ECS instance attached to the Alb Server Group.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public AlbServerGroupAttachmentState build() {
            return $;
        }
    }

}