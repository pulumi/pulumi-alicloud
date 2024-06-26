// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.arms.inputs;

import com.pulumi.alicloud.arms.inputs.SyntheticTaskCommonSettingCustomHostArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SyntheticTaskCommonSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final SyntheticTaskCommonSettingArgs Empty = new SyntheticTaskCommonSettingArgs();

    /**
     * Custom host. See `custom_host` below.
     * 
     */
    @Import(name="customHost")
    private @Nullable Output<SyntheticTaskCommonSettingCustomHostArgs> customHost;

    /**
     * @return Custom host. See `custom_host` below.
     * 
     */
    public Optional<Output<SyntheticTaskCommonSettingCustomHostArgs>> customHost() {
        return Optional.ofNullable(this.customHost);
    }

    /**
     * IpType.
     * 
     */
    @Import(name="ipType")
    private @Nullable Output<Integer> ipType;

    /**
     * @return IpType.
     * 
     */
    public Optional<Output<Integer>> ipType() {
        return Optional.ofNullable(this.ipType);
    }

    /**
     * Whether to enable link tracking.
     * 
     */
    @Import(name="isOpenTrace")
    private @Nullable Output<Boolean> isOpenTrace;

    /**
     * @return Whether to enable link tracking.
     * 
     */
    public Optional<Output<Boolean>> isOpenTrace() {
        return Optional.ofNullable(this.isOpenTrace);
    }

    /**
     * Whether the monitoring samples are evenly distributed:
     * - 0: No
     *   1: Yes.
     * 
     */
    @Import(name="monitorSamples")
    private @Nullable Output<Integer> monitorSamples;

    /**
     * @return Whether the monitoring samples are evenly distributed:
     * - 0: No
     *   1: Yes.
     * 
     */
    public Optional<Output<Integer>> monitorSamples() {
        return Optional.ofNullable(this.monitorSamples);
    }

    /**
     * Link trace client type:
     * - 0:ARMS Agent
     * - 1:OpenTelemetry
     * - 2:Jaeger.
     * 
     */
    @Import(name="traceClientType")
    private @Nullable Output<Integer> traceClientType;

    /**
     * @return Link trace client type:
     * - 0:ARMS Agent
     * - 1:OpenTelemetry
     * - 2:Jaeger.
     * 
     */
    public Optional<Output<Integer>> traceClientType() {
        return Optional.ofNullable(this.traceClientType);
    }

    /**
     * The link data is reported to the region.
     * 
     */
    @Import(name="xtraceRegion")
    private @Nullable Output<String> xtraceRegion;

    /**
     * @return The link data is reported to the region.
     * 
     */
    public Optional<Output<String>> xtraceRegion() {
        return Optional.ofNullable(this.xtraceRegion);
    }

    private SyntheticTaskCommonSettingArgs() {}

    private SyntheticTaskCommonSettingArgs(SyntheticTaskCommonSettingArgs $) {
        this.customHost = $.customHost;
        this.ipType = $.ipType;
        this.isOpenTrace = $.isOpenTrace;
        this.monitorSamples = $.monitorSamples;
        this.traceClientType = $.traceClientType;
        this.xtraceRegion = $.xtraceRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SyntheticTaskCommonSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SyntheticTaskCommonSettingArgs $;

        public Builder() {
            $ = new SyntheticTaskCommonSettingArgs();
        }

        public Builder(SyntheticTaskCommonSettingArgs defaults) {
            $ = new SyntheticTaskCommonSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customHost Custom host. See `custom_host` below.
         * 
         * @return builder
         * 
         */
        public Builder customHost(@Nullable Output<SyntheticTaskCommonSettingCustomHostArgs> customHost) {
            $.customHost = customHost;
            return this;
        }

        /**
         * @param customHost Custom host. See `custom_host` below.
         * 
         * @return builder
         * 
         */
        public Builder customHost(SyntheticTaskCommonSettingCustomHostArgs customHost) {
            return customHost(Output.of(customHost));
        }

        /**
         * @param ipType IpType.
         * 
         * @return builder
         * 
         */
        public Builder ipType(@Nullable Output<Integer> ipType) {
            $.ipType = ipType;
            return this;
        }

        /**
         * @param ipType IpType.
         * 
         * @return builder
         * 
         */
        public Builder ipType(Integer ipType) {
            return ipType(Output.of(ipType));
        }

        /**
         * @param isOpenTrace Whether to enable link tracking.
         * 
         * @return builder
         * 
         */
        public Builder isOpenTrace(@Nullable Output<Boolean> isOpenTrace) {
            $.isOpenTrace = isOpenTrace;
            return this;
        }

        /**
         * @param isOpenTrace Whether to enable link tracking.
         * 
         * @return builder
         * 
         */
        public Builder isOpenTrace(Boolean isOpenTrace) {
            return isOpenTrace(Output.of(isOpenTrace));
        }

        /**
         * @param monitorSamples Whether the monitoring samples are evenly distributed:
         * - 0: No
         *   1: Yes.
         * 
         * @return builder
         * 
         */
        public Builder monitorSamples(@Nullable Output<Integer> monitorSamples) {
            $.monitorSamples = monitorSamples;
            return this;
        }

        /**
         * @param monitorSamples Whether the monitoring samples are evenly distributed:
         * - 0: No
         *   1: Yes.
         * 
         * @return builder
         * 
         */
        public Builder monitorSamples(Integer monitorSamples) {
            return monitorSamples(Output.of(monitorSamples));
        }

        /**
         * @param traceClientType Link trace client type:
         * - 0:ARMS Agent
         * - 1:OpenTelemetry
         * - 2:Jaeger.
         * 
         * @return builder
         * 
         */
        public Builder traceClientType(@Nullable Output<Integer> traceClientType) {
            $.traceClientType = traceClientType;
            return this;
        }

        /**
         * @param traceClientType Link trace client type:
         * - 0:ARMS Agent
         * - 1:OpenTelemetry
         * - 2:Jaeger.
         * 
         * @return builder
         * 
         */
        public Builder traceClientType(Integer traceClientType) {
            return traceClientType(Output.of(traceClientType));
        }

        /**
         * @param xtraceRegion The link data is reported to the region.
         * 
         * @return builder
         * 
         */
        public Builder xtraceRegion(@Nullable Output<String> xtraceRegion) {
            $.xtraceRegion = xtraceRegion;
            return this;
        }

        /**
         * @param xtraceRegion The link data is reported to the region.
         * 
         * @return builder
         * 
         */
        public Builder xtraceRegion(String xtraceRegion) {
            return xtraceRegion(Output.of(xtraceRegion));
        }

        public SyntheticTaskCommonSettingArgs build() {
            return $;
        }
    }

}
