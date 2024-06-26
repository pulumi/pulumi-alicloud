// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection.inputs;

import com.pulumi.alicloud.threatdetection.inputs.SasTrailServiceTrailArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SasTrailState extends com.pulumi.resources.ResourceArgs {

    public static final SasTrailState Empty = new SasTrailState();

    /**
     * The service trace creation timestamp, in milliseconds.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<Integer> createTime;

    /**
     * @return The service trace creation timestamp, in milliseconds.
     * 
     */
    public Optional<Output<Integer>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Service trace configuration information.
     * 
     */
    @Import(name="serviceTrail")
    private @Nullable Output<SasTrailServiceTrailArgs> serviceTrail;

    /**
     * @return Service trace configuration information.
     * 
     */
    public Optional<Output<SasTrailServiceTrailArgs>> serviceTrail() {
        return Optional.ofNullable(this.serviceTrail);
    }

    private SasTrailState() {}

    private SasTrailState(SasTrailState $) {
        this.createTime = $.createTime;
        this.serviceTrail = $.serviceTrail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SasTrailState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SasTrailState $;

        public Builder() {
            $ = new SasTrailState();
        }

        public Builder(SasTrailState defaults) {
            $ = new SasTrailState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The service trace creation timestamp, in milliseconds.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<Integer> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The service trace creation timestamp, in milliseconds.
         * 
         * @return builder
         * 
         */
        public Builder createTime(Integer createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param serviceTrail Service trace configuration information.
         * 
         * @return builder
         * 
         */
        public Builder serviceTrail(@Nullable Output<SasTrailServiceTrailArgs> serviceTrail) {
            $.serviceTrail = serviceTrail;
            return this;
        }

        /**
         * @param serviceTrail Service trace configuration information.
         * 
         * @return builder
         * 
         */
        public Builder serviceTrail(SasTrailServiceTrailArgs serviceTrail) {
            return serviceTrail(Output.of(serviceTrail));
        }

        public SasTrailState build() {
            return $;
        }
    }

}
