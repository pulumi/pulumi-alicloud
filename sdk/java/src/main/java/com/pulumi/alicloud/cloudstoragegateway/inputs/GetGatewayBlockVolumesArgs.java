// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudstoragegateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGatewayBlockVolumesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGatewayBlockVolumesArgs Empty = new GetGatewayBlockVolumesArgs();

    /**
     * The Gateway ID.
     * 
     */
    @Import(name="gatewayId", required=true)
    private Output<String> gatewayId;

    /**
     * @return The Gateway ID.
     * 
     */
    public Output<String> gatewayId() {
        return this.gatewayId;
    }

    /**
     * A list of Gateway Block Volume IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Gateway Block Volume IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Gateway Block Volume name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Gateway Block Volume name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

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
     * The status of volume. Valid values:
     * 
     */
    @Import(name="status")
    private @Nullable Output<Integer> status;

    /**
     * @return The status of volume. Valid values:
     * 
     */
    public Optional<Output<Integer>> status() {
        return Optional.ofNullable(this.status);
    }

    private GetGatewayBlockVolumesArgs() {}

    private GetGatewayBlockVolumesArgs(GetGatewayBlockVolumesArgs $) {
        this.gatewayId = $.gatewayId;
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGatewayBlockVolumesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGatewayBlockVolumesArgs $;

        public Builder() {
            $ = new GetGatewayBlockVolumesArgs();
        }

        public Builder(GetGatewayBlockVolumesArgs defaults) {
            $ = new GetGatewayBlockVolumesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatewayId The Gateway ID.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(Output<String> gatewayId) {
            $.gatewayId = gatewayId;
            return this;
        }

        /**
         * @param gatewayId The Gateway ID.
         * 
         * @return builder
         * 
         */
        public Builder gatewayId(String gatewayId) {
            return gatewayId(Output.of(gatewayId));
        }

        /**
         * @param ids A list of Gateway Block Volume IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Gateway Block Volume IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Gateway Block Volume IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Gateway Block Volume name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Gateway Block Volume name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
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
         * @param status The status of volume. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Integer> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of volume. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder status(Integer status) {
            return status(Output.of(status));
        }

        public GetGatewayBlockVolumesArgs build() {
            if ($.gatewayId == null) {
                throw new MissingRequiredPropertyException("GetGatewayBlockVolumesArgs", "gatewayId");
            }
            return $;
        }
    }

}