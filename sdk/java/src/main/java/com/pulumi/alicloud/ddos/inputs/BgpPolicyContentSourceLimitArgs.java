// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BgpPolicyContentSourceLimitArgs extends com.pulumi.resources.ResourceArgs {

    public static final BgpPolicyContentSourceLimitArgs Empty = new BgpPolicyContentSourceLimitArgs();

    /**
     * bps range 1024~268435456.
     * 
     */
    @Import(name="bps")
    private @Nullable Output<Integer> bps;

    /**
     * @return bps range 1024~268435456.
     * 
     */
    public Optional<Output<Integer>> bps() {
        return Optional.ofNullable(this.bps);
    }

    /**
     * Pps range 32~500000.
     * 
     */
    @Import(name="pps")
    private @Nullable Output<Integer> pps;

    /**
     * @return Pps range 32~500000.
     * 
     */
    public Optional<Output<Integer>> pps() {
        return Optional.ofNullable(this.pps);
    }

    /**
     * SynBps range 1024~268435456.
     * 
     */
    @Import(name="synBps")
    private @Nullable Output<Integer> synBps;

    /**
     * @return SynBps range 1024~268435456.
     * 
     */
    public Optional<Output<Integer>> synBps() {
        return Optional.ofNullable(this.synBps);
    }

    /**
     * SynPps range 1~100000.
     * 
     */
    @Import(name="synPps")
    private @Nullable Output<Integer> synPps;

    /**
     * @return SynPps range 1~100000.
     * 
     */
    public Optional<Output<Integer>> synPps() {
        return Optional.ofNullable(this.synPps);
    }

    private BgpPolicyContentSourceLimitArgs() {}

    private BgpPolicyContentSourceLimitArgs(BgpPolicyContentSourceLimitArgs $) {
        this.bps = $.bps;
        this.pps = $.pps;
        this.synBps = $.synBps;
        this.synPps = $.synPps;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BgpPolicyContentSourceLimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BgpPolicyContentSourceLimitArgs $;

        public Builder() {
            $ = new BgpPolicyContentSourceLimitArgs();
        }

        public Builder(BgpPolicyContentSourceLimitArgs defaults) {
            $ = new BgpPolicyContentSourceLimitArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bps bps range 1024~268435456.
         * 
         * @return builder
         * 
         */
        public Builder bps(@Nullable Output<Integer> bps) {
            $.bps = bps;
            return this;
        }

        /**
         * @param bps bps range 1024~268435456.
         * 
         * @return builder
         * 
         */
        public Builder bps(Integer bps) {
            return bps(Output.of(bps));
        }

        /**
         * @param pps Pps range 32~500000.
         * 
         * @return builder
         * 
         */
        public Builder pps(@Nullable Output<Integer> pps) {
            $.pps = pps;
            return this;
        }

        /**
         * @param pps Pps range 32~500000.
         * 
         * @return builder
         * 
         */
        public Builder pps(Integer pps) {
            return pps(Output.of(pps));
        }

        /**
         * @param synBps SynBps range 1024~268435456.
         * 
         * @return builder
         * 
         */
        public Builder synBps(@Nullable Output<Integer> synBps) {
            $.synBps = synBps;
            return this;
        }

        /**
         * @param synBps SynBps range 1024~268435456.
         * 
         * @return builder
         * 
         */
        public Builder synBps(Integer synBps) {
            return synBps(Output.of(synBps));
        }

        /**
         * @param synPps SynPps range 1~100000.
         * 
         * @return builder
         * 
         */
        public Builder synPps(@Nullable Output<Integer> synPps) {
            $.synPps = synPps;
            return this;
        }

        /**
         * @param synPps SynPps range 1~100000.
         * 
         * @return builder
         * 
         */
        public Builder synPps(Integer synPps) {
            return synPps(Output.of(synPps));
        }

        public BgpPolicyContentSourceLimitArgs build() {
            return $;
        }
    }

}