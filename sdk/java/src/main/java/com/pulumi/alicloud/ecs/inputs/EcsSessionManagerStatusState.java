// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EcsSessionManagerStatusState extends com.pulumi.resources.ResourceArgs {

    public static final EcsSessionManagerStatusState Empty = new EcsSessionManagerStatusState();

    /**
     * The name of the resource. Valid values: `sessionManagerStatus`.
     * 
     */
    @Import(name="sessionManagerStatusName")
    private @Nullable Output<String> sessionManagerStatusName;

    /**
     * @return The name of the resource. Valid values: `sessionManagerStatus`.
     * 
     */
    public Optional<Output<String>> sessionManagerStatusName() {
        return Optional.ofNullable(this.sessionManagerStatusName);
    }

    /**
     * The status of the resource. Valid values: `Disabled`, `Enabled`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource. Valid values: `Disabled`, `Enabled`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private EcsSessionManagerStatusState() {}

    private EcsSessionManagerStatusState(EcsSessionManagerStatusState $) {
        this.sessionManagerStatusName = $.sessionManagerStatusName;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EcsSessionManagerStatusState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EcsSessionManagerStatusState $;

        public Builder() {
            $ = new EcsSessionManagerStatusState();
        }

        public Builder(EcsSessionManagerStatusState defaults) {
            $ = new EcsSessionManagerStatusState(Objects.requireNonNull(defaults));
        }

        /**
         * @param sessionManagerStatusName The name of the resource. Valid values: `sessionManagerStatus`.
         * 
         * @return builder
         * 
         */
        public Builder sessionManagerStatusName(@Nullable Output<String> sessionManagerStatusName) {
            $.sessionManagerStatusName = sessionManagerStatusName;
            return this;
        }

        /**
         * @param sessionManagerStatusName The name of the resource. Valid values: `sessionManagerStatus`.
         * 
         * @return builder
         * 
         */
        public Builder sessionManagerStatusName(String sessionManagerStatusName) {
            return sessionManagerStatusName(Output.of(sessionManagerStatusName));
        }

        /**
         * @param status The status of the resource. Valid values: `Disabled`, `Enabled`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource. Valid values: `Disabled`, `Enabled`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public EcsSessionManagerStatusState build() {
            return $;
        }
    }

}