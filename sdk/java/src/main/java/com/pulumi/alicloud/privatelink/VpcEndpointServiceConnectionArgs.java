// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcEndpointServiceConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointServiceConnectionArgs Empty = new VpcEndpointServiceConnectionArgs();

    /**
     * The bandwidth of the endpoint connection. Valid values: 100 to 10240. Unit: Mbit/s.Note: The bandwidth of an endpoint connection is in the range of 100 to 10,240 Mbit/s. The default bandwidth is 1,024 Mbit/s. When the endpoint is connected to the endpoint service, the default bandwidth is the minimum bandwidth. In this case, the connection bandwidth range is 1,024 to 10,240 Mbit/s.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<Integer> bandwidth;

    /**
     * @return The bandwidth of the endpoint connection. Valid values: 100 to 10240. Unit: Mbit/s.Note: The bandwidth of an endpoint connection is in the range of 100 to 10,240 Mbit/s. The default bandwidth is 1,024 Mbit/s. When the endpoint is connected to the endpoint service, the default bandwidth is the minimum bandwidth. In this case, the connection bandwidth range is 1,024 to 10,240 Mbit/s.
     * 
     */
    public Optional<Output<Integer>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
     * - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.
     * - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether to perform only a dry run, without performing the actual request. Valid values:
     * - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.
     * - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The endpoint ID.
     * 
     */
    @Import(name="endpointId", required=true)
    private Output<String> endpointId;

    /**
     * @return The endpoint ID.
     * 
     */
    public Output<String> endpointId() {
        return this.endpointId;
    }

    /**
     * The endpoint service ID.
     * 
     */
    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    /**
     * @return The endpoint service ID.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    private VpcEndpointServiceConnectionArgs() {}

    private VpcEndpointServiceConnectionArgs(VpcEndpointServiceConnectionArgs $) {
        this.bandwidth = $.bandwidth;
        this.dryRun = $.dryRun;
        this.endpointId = $.endpointId;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcEndpointServiceConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcEndpointServiceConnectionArgs $;

        public Builder() {
            $ = new VpcEndpointServiceConnectionArgs();
        }

        public Builder(VpcEndpointServiceConnectionArgs defaults) {
            $ = new VpcEndpointServiceConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidth The bandwidth of the endpoint connection. Valid values: 100 to 10240. Unit: Mbit/s.Note: The bandwidth of an endpoint connection is in the range of 100 to 10,240 Mbit/s. The default bandwidth is 1,024 Mbit/s. When the endpoint is connected to the endpoint service, the default bandwidth is the minimum bandwidth. In this case, the connection bandwidth range is 1,024 to 10,240 Mbit/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<Integer> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The bandwidth of the endpoint connection. Valid values: 100 to 10240. Unit: Mbit/s.Note: The bandwidth of an endpoint connection is in the range of 100 to 10,240 Mbit/s. The default bandwidth is 1,024 Mbit/s. When the endpoint is connected to the endpoint service, the default bandwidth is the minimum bandwidth. In this case, the connection bandwidth range is 1,024 to 10,240 Mbit/s.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(Integer bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param dryRun Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.
         * - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * - **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.
         * - **false (default)**: performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param endpointId The endpoint ID.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(Output<String> endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        /**
         * @param endpointId The endpoint ID.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(String endpointId) {
            return endpointId(Output.of(endpointId));
        }

        /**
         * @param serviceId The endpoint service ID.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The endpoint service ID.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public VpcEndpointServiceConnectionArgs build() {
            if ($.endpointId == null) {
                throw new MissingRequiredPropertyException("VpcEndpointServiceConnectionArgs", "endpointId");
            }
            if ($.serviceId == null) {
                throw new MissingRequiredPropertyException("VpcEndpointServiceConnectionArgs", "serviceId");
            }
            return $;
        }
    }

}