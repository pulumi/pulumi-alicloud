// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcEndpointServiceResourcesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcEndpointServiceResourcesArgs Empty = new GetVpcEndpointServiceResourcesArgs();

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The ID of Vpc Endpoint Service.
     * 
     */
    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    /**
     * @return The ID of Vpc Endpoint Service.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    private GetVpcEndpointServiceResourcesArgs() {}

    private GetVpcEndpointServiceResourcesArgs(GetVpcEndpointServiceResourcesArgs $) {
        this.outputFile = $.outputFile;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcEndpointServiceResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcEndpointServiceResourcesArgs $;

        public Builder() {
            $ = new GetVpcEndpointServiceResourcesArgs();
        }

        public Builder(GetVpcEndpointServiceResourcesArgs defaults) {
            $ = new GetVpcEndpointServiceResourcesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param serviceId The ID of Vpc Endpoint Service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The ID of Vpc Endpoint Service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public GetVpcEndpointServiceResourcesArgs build() {
            if ($.serviceId == null) {
                throw new MissingRequiredPropertyException("GetVpcEndpointServiceResourcesArgs", "serviceId");
            }
            return $;
        }
    }

}