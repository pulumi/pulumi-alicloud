// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.privatelink.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcEndpointZonesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcEndpointZonesPlainArgs Empty = new GetVpcEndpointZonesPlainArgs();

    /**
     * The ID of the Vpc Endpoint.
     * 
     */
    @Import(name="endpointId", required=true)
    private String endpointId;

    /**
     * @return The ID of the Vpc Endpoint.
     * 
     */
    public String endpointId() {
        return this.endpointId;
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The Status of Vpc Endpoint Zone. Valid Values: `Connected`, `Connecting`, `Creating`, `Deleted`, `Deleting`, `Disconnected`, `Disconnecting` and `Wait`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The Status of Vpc Endpoint Zone. Valid Values: `Connected`, `Connecting`, `Creating`, `Deleted`, `Deleting`, `Disconnected`, `Disconnecting` and `Wait`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetVpcEndpointZonesPlainArgs() {}

    private GetVpcEndpointZonesPlainArgs(GetVpcEndpointZonesPlainArgs $) {
        this.endpointId = $.endpointId;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcEndpointZonesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcEndpointZonesPlainArgs $;

        public Builder() {
            $ = new GetVpcEndpointZonesPlainArgs();
        }

        public Builder(GetVpcEndpointZonesPlainArgs defaults) {
            $ = new GetVpcEndpointZonesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointId The ID of the Vpc Endpoint.
         * 
         * @return builder
         * 
         */
        public Builder endpointId(String endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param status The Status of Vpc Endpoint Zone. Valid Values: `Connected`, `Connecting`, `Creating`, `Deleted`, `Deleting`, `Disconnected`, `Disconnecting` and `Wait`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetVpcEndpointZonesPlainArgs build() {
            if ($.endpointId == null) {
                throw new MissingRequiredPropertyException("GetVpcEndpointZonesPlainArgs", "endpointId");
            }
            return $;
        }
    }

}