// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTrafficMirrorFilterIngressRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTrafficMirrorFilterIngressRulesArgs Empty = new GetTrafficMirrorFilterIngressRulesArgs();

    /**
     * A list of Traffic Mirror Filter Ingress Rule IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Traffic Mirror Filter Ingress Rule IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
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
     * The status of the resource. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the Traffic Mirror Filter.
     * 
     */
    @Import(name="trafficMirrorFilterId", required=true)
    private Output<String> trafficMirrorFilterId;

    /**
     * @return The ID of the Traffic Mirror Filter.
     * 
     */
    public Output<String> trafficMirrorFilterId() {
        return this.trafficMirrorFilterId;
    }

    private GetTrafficMirrorFilterIngressRulesArgs() {}

    private GetTrafficMirrorFilterIngressRulesArgs(GetTrafficMirrorFilterIngressRulesArgs $) {
        this.ids = $.ids;
        this.outputFile = $.outputFile;
        this.status = $.status;
        this.trafficMirrorFilterId = $.trafficMirrorFilterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTrafficMirrorFilterIngressRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTrafficMirrorFilterIngressRulesArgs $;

        public Builder() {
            $ = new GetTrafficMirrorFilterIngressRulesArgs();
        }

        public Builder(GetTrafficMirrorFilterIngressRulesArgs defaults) {
            $ = new GetTrafficMirrorFilterIngressRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Traffic Mirror Filter Ingress Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Traffic Mirror Filter Ingress Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Traffic Mirror Filter Ingress Rule IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
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
         * @param status The status of the resource. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource. Valid values:`Creating`, `Created`, `Modifying` and `Deleting`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param trafficMirrorFilterId The ID of the Traffic Mirror Filter.
         * 
         * @return builder
         * 
         */
        public Builder trafficMirrorFilterId(Output<String> trafficMirrorFilterId) {
            $.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }

        /**
         * @param trafficMirrorFilterId The ID of the Traffic Mirror Filter.
         * 
         * @return builder
         * 
         */
        public Builder trafficMirrorFilterId(String trafficMirrorFilterId) {
            return trafficMirrorFilterId(Output.of(trafficMirrorFilterId));
        }

        public GetTrafficMirrorFilterIngressRulesArgs build() {
            if ($.trafficMirrorFilterId == null) {
                throw new MissingRequiredPropertyException("GetTrafficMirrorFilterIngressRulesArgs", "trafficMirrorFilterId");
            }
            return $;
        }
    }

}