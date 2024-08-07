// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.realtimecompute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VvpInstanceResourceSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final VvpInstanceResourceSpecArgs Empty = new VvpInstanceResourceSpecArgs();

    /**
     * CPU number.
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<Integer> cpu;

    /**
     * @return CPU number.
     * 
     */
    public Optional<Output<Integer>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * Memory size.
     * 
     */
    @Import(name="memoryGb")
    private @Nullable Output<Integer> memoryGb;

    /**
     * @return Memory size.
     * 
     */
    public Optional<Output<Integer>> memoryGb() {
        return Optional.ofNullable(this.memoryGb);
    }

    private VvpInstanceResourceSpecArgs() {}

    private VvpInstanceResourceSpecArgs(VvpInstanceResourceSpecArgs $) {
        this.cpu = $.cpu;
        this.memoryGb = $.memoryGb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VvpInstanceResourceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VvpInstanceResourceSpecArgs $;

        public Builder() {
            $ = new VvpInstanceResourceSpecArgs();
        }

        public Builder(VvpInstanceResourceSpecArgs defaults) {
            $ = new VvpInstanceResourceSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cpu CPU number.
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable Output<Integer> cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param cpu CPU number.
         * 
         * @return builder
         * 
         */
        public Builder cpu(Integer cpu) {
            return cpu(Output.of(cpu));
        }

        /**
         * @param memoryGb Memory size.
         * 
         * @return builder
         * 
         */
        public Builder memoryGb(@Nullable Output<Integer> memoryGb) {
            $.memoryGb = memoryGb;
            return this;
        }

        /**
         * @param memoryGb Memory size.
         * 
         * @return builder
         * 
         */
        public Builder memoryGb(Integer memoryGb) {
            return memoryGb(Output.of(memoryGb));
        }

        public VvpInstanceResourceSpecArgs build() {
            return $;
        }
    }

}
