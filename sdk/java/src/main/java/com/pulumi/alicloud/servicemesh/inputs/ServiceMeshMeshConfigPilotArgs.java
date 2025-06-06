// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceMeshMeshConfigPilotArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceMeshMeshConfigPilotArgs Empty = new ServiceMeshMeshConfigPilotArgs();

    /**
     * Whether to support the HTTP1.0
     * 
     */
    @Import(name="http10Enabled")
    private @Nullable Output<Boolean> http10Enabled;

    /**
     * @return Whether to support the HTTP1.0
     * 
     */
    public Optional<Output<Boolean>> http10Enabled() {
        return Optional.ofNullable(this.http10Enabled);
    }

    /**
     * Link trace sampling percentage
     * 
     */
    @Import(name="traceSampling")
    private @Nullable Output<Double> traceSampling;

    /**
     * @return Link trace sampling percentage
     * 
     */
    public Optional<Output<Double>> traceSampling() {
        return Optional.ofNullable(this.traceSampling);
    }

    private ServiceMeshMeshConfigPilotArgs() {}

    private ServiceMeshMeshConfigPilotArgs(ServiceMeshMeshConfigPilotArgs $) {
        this.http10Enabled = $.http10Enabled;
        this.traceSampling = $.traceSampling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceMeshMeshConfigPilotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceMeshMeshConfigPilotArgs $;

        public Builder() {
            $ = new ServiceMeshMeshConfigPilotArgs();
        }

        public Builder(ServiceMeshMeshConfigPilotArgs defaults) {
            $ = new ServiceMeshMeshConfigPilotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param http10Enabled Whether to support the HTTP1.0
         * 
         * @return builder
         * 
         */
        public Builder http10Enabled(@Nullable Output<Boolean> http10Enabled) {
            $.http10Enabled = http10Enabled;
            return this;
        }

        /**
         * @param http10Enabled Whether to support the HTTP1.0
         * 
         * @return builder
         * 
         */
        public Builder http10Enabled(Boolean http10Enabled) {
            return http10Enabled(Output.of(http10Enabled));
        }

        /**
         * @param traceSampling Link trace sampling percentage
         * 
         * @return builder
         * 
         */
        public Builder traceSampling(@Nullable Output<Double> traceSampling) {
            $.traceSampling = traceSampling;
            return this;
        }

        /**
         * @param traceSampling Link trace sampling percentage
         * 
         * @return builder
         * 
         */
        public Builder traceSampling(Double traceSampling) {
            return traceSampling(Output.of(traceSampling));
        }

        public ServiceMeshMeshConfigPilotArgs build() {
            return $;
        }
    }

}
