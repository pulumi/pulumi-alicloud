// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.brain.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndustrialPidLoopState extends com.pulumi.resources.ResourceArgs {

    public static final IndustrialPidLoopState Empty = new IndustrialPidLoopState();

    /**
     * The Pid Loop Configuration.
     * 
     */
    @Import(name="pidLoopConfiguration")
    private @Nullable Output<String> pidLoopConfiguration;

    /**
     * @return The Pid Loop Configuration.
     * 
     */
    public Optional<Output<String>> pidLoopConfiguration() {
        return Optional.ofNullable(this.pidLoopConfiguration);
    }

    /**
     * The dcs type of Pid Loop. Valid values: `standard`.
     * 
     */
    @Import(name="pidLoopDcsType")
    private @Nullable Output<String> pidLoopDcsType;

    /**
     * @return The dcs type of Pid Loop. Valid values: `standard`.
     * 
     */
    public Optional<Output<String>> pidLoopDcsType() {
        return Optional.ofNullable(this.pidLoopDcsType);
    }

    /**
     * The desc of Pid Loop.
     * 
     */
    @Import(name="pidLoopDesc")
    private @Nullable Output<String> pidLoopDesc;

    /**
     * @return The desc of Pid Loop.
     * 
     */
    public Optional<Output<String>> pidLoopDesc() {
        return Optional.ofNullable(this.pidLoopDesc);
    }

    /**
     * Whether is crucial Pid Loop.
     * 
     */
    @Import(name="pidLoopIsCrucial")
    private @Nullable Output<Boolean> pidLoopIsCrucial;

    /**
     * @return Whether is crucial Pid Loop.
     * 
     */
    public Optional<Output<Boolean>> pidLoopIsCrucial() {
        return Optional.ofNullable(this.pidLoopIsCrucial);
    }

    /**
     * The name of Pid Loop.
     * 
     */
    @Import(name="pidLoopName")
    private @Nullable Output<String> pidLoopName;

    /**
     * @return The name of Pid Loop.
     * 
     */
    public Optional<Output<String>> pidLoopName() {
        return Optional.ofNullable(this.pidLoopName);
    }

    /**
     * The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
     * 
     */
    @Import(name="pidLoopType")
    private @Nullable Output<String> pidLoopType;

    /**
     * @return The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
     * 
     */
    public Optional<Output<String>> pidLoopType() {
        return Optional.ofNullable(this.pidLoopType);
    }

    /**
     * The pid project id.
     * 
     */
    @Import(name="pidProjectId")
    private @Nullable Output<String> pidProjectId;

    /**
     * @return The pid project id.
     * 
     */
    public Optional<Output<String>> pidProjectId() {
        return Optional.ofNullable(this.pidProjectId);
    }

    /**
     * The status of Pid Loop.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of Pid Loop.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private IndustrialPidLoopState() {}

    private IndustrialPidLoopState(IndustrialPidLoopState $) {
        this.pidLoopConfiguration = $.pidLoopConfiguration;
        this.pidLoopDcsType = $.pidLoopDcsType;
        this.pidLoopDesc = $.pidLoopDesc;
        this.pidLoopIsCrucial = $.pidLoopIsCrucial;
        this.pidLoopName = $.pidLoopName;
        this.pidLoopType = $.pidLoopType;
        this.pidProjectId = $.pidProjectId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IndustrialPidLoopState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IndustrialPidLoopState $;

        public Builder() {
            $ = new IndustrialPidLoopState();
        }

        public Builder(IndustrialPidLoopState defaults) {
            $ = new IndustrialPidLoopState(Objects.requireNonNull(defaults));
        }

        /**
         * @param pidLoopConfiguration The Pid Loop Configuration.
         * 
         * @return builder
         * 
         */
        public Builder pidLoopConfiguration(@Nullable Output<String> pidLoopConfiguration) {
            $.pidLoopConfiguration = pidLoopConfiguration;
            return this;
        }

        /**
         * @param pidLoopConfiguration The Pid Loop Configuration.
         * 
         * @return builder
         * 
         */
        public Builder pidLoopConfiguration(String pidLoopConfiguration) {
            return pidLoopConfiguration(Output.of(pidLoopConfiguration));
        }

        /**
         * @param pidLoopDcsType The dcs type of Pid Loop. Valid values: `standard`.
         * 
         * @return builder
         * 
         */
        public Builder pidLoopDcsType(@Nullable Output<String> pidLoopDcsType) {
            $.pidLoopDcsType = pidLoopDcsType;
            return this;
        }

        /**
         * @param pidLoopDcsType The dcs type of Pid Loop. Valid values: `standard`.
         * 
         * @return builder
         * 
         */
        public Builder pidLoopDcsType(String pidLoopDcsType) {
            return pidLoopDcsType(Output.of(pidLoopDcsType));
        }

        /**
         * @param pidLoopDesc The desc of Pid Loop.
         * 
         * @return builder
         * 
         */
        public Builder pidLoopDesc(@Nullable Output<String> pidLoopDesc) {
            $.pidLoopDesc = pidLoopDesc;
            return this;
        }

        /**
         * @param pidLoopDesc The desc of Pid Loop.
         * 
         * @return builder
         * 
         */
        public Builder pidLoopDesc(String pidLoopDesc) {
            return pidLoopDesc(Output.of(pidLoopDesc));
        }

        /**
         * @param pidLoopIsCrucial Whether is crucial Pid Loop.
         * 
         * @return builder
         * 
         */
        public Builder pidLoopIsCrucial(@Nullable Output<Boolean> pidLoopIsCrucial) {
            $.pidLoopIsCrucial = pidLoopIsCrucial;
            return this;
        }

        /**
         * @param pidLoopIsCrucial Whether is crucial Pid Loop.
         * 
         * @return builder
         * 
         */
        public Builder pidLoopIsCrucial(Boolean pidLoopIsCrucial) {
            return pidLoopIsCrucial(Output.of(pidLoopIsCrucial));
        }

        /**
         * @param pidLoopName The name of Pid Loop.
         * 
         * @return builder
         * 
         */
        public Builder pidLoopName(@Nullable Output<String> pidLoopName) {
            $.pidLoopName = pidLoopName;
            return this;
        }

        /**
         * @param pidLoopName The name of Pid Loop.
         * 
         * @return builder
         * 
         */
        public Builder pidLoopName(String pidLoopName) {
            return pidLoopName(Output.of(pidLoopName));
        }

        /**
         * @param pidLoopType The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
         * 
         * @return builder
         * 
         */
        public Builder pidLoopType(@Nullable Output<String> pidLoopType) {
            $.pidLoopType = pidLoopType;
            return this;
        }

        /**
         * @param pidLoopType The type of Pid Loop. Valid values: `0`, `1`, `2`, `3`, `4`, `5`.
         * 
         * @return builder
         * 
         */
        public Builder pidLoopType(String pidLoopType) {
            return pidLoopType(Output.of(pidLoopType));
        }

        /**
         * @param pidProjectId The pid project id.
         * 
         * @return builder
         * 
         */
        public Builder pidProjectId(@Nullable Output<String> pidProjectId) {
            $.pidProjectId = pidProjectId;
            return this;
        }

        /**
         * @param pidProjectId The pid project id.
         * 
         * @return builder
         * 
         */
        public Builder pidProjectId(String pidProjectId) {
            return pidProjectId(Output.of(pidProjectId));
        }

        /**
         * @param status The status of Pid Loop.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of Pid Loop.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public IndustrialPidLoopState build() {
            return $;
        }
    }

}
