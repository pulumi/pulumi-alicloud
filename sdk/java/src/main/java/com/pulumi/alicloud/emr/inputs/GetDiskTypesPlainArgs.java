// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emr.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDiskTypesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiskTypesPlainArgs Empty = new GetDiskTypesPlainArgs();

    /**
     * The cluster type of the emr cluster instance. Possible values: `HADOOP`, `KAFKA`, `ZOOKEEPER`, `DRUID`.
     * 
     */
    @Import(name="clusterType", required=true)
    private String clusterType;

    /**
     * @return The cluster type of the emr cluster instance. Possible values: `HADOOP`, `KAFKA`, `ZOOKEEPER`, `DRUID`.
     * 
     */
    public String clusterType() {
        return this.clusterType;
    }

    /**
     * The destination resource of emr cluster instance
     * 
     */
    @Import(name="destinationResource", required=true)
    private String destinationResource;

    /**
     * @return The destination resource of emr cluster instance
     * 
     */
    public String destinationResource() {
        return this.destinationResource;
    }

    /**
     * Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
     * 
     */
    @Import(name="instanceChargeType", required=true)
    private String instanceChargeType;

    /**
     * @return Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
     * 
     */
    public String instanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * The ecs instance type of create emr cluster instance.
     * 
     */
    @Import(name="instanceType", required=true)
    private String instanceType;

    /**
     * @return The ecs instance type of create emr cluster instance.
     * 
     */
    public String instanceType() {
        return this.instanceType;
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
     * The Zone to create emr cluster instance.
     * 
     */
    @Import(name="zoneId")
    private @Nullable String zoneId;

    /**
     * @return The Zone to create emr cluster instance.
     * 
     */
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetDiskTypesPlainArgs() {}

    private GetDiskTypesPlainArgs(GetDiskTypesPlainArgs $) {
        this.clusterType = $.clusterType;
        this.destinationResource = $.destinationResource;
        this.instanceChargeType = $.instanceChargeType;
        this.instanceType = $.instanceType;
        this.outputFile = $.outputFile;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiskTypesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiskTypesPlainArgs $;

        public Builder() {
            $ = new GetDiskTypesPlainArgs();
        }

        public Builder(GetDiskTypesPlainArgs defaults) {
            $ = new GetDiskTypesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterType The cluster type of the emr cluster instance. Possible values: `HADOOP`, `KAFKA`, `ZOOKEEPER`, `DRUID`.
         * 
         * @return builder
         * 
         */
        public Builder clusterType(String clusterType) {
            $.clusterType = clusterType;
            return this;
        }

        /**
         * @param destinationResource The destination resource of emr cluster instance
         * 
         * @return builder
         * 
         */
        public Builder destinationResource(String destinationResource) {
            $.destinationResource = destinationResource;
            return this;
        }

        /**
         * @param instanceChargeType Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
         * 
         * @return builder
         * 
         */
        public Builder instanceChargeType(String instanceChargeType) {
            $.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * @param instanceType The ecs instance type of create emr cluster instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            $.instanceType = instanceType;
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
         * @param zoneId The Zone to create emr cluster instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetDiskTypesPlainArgs build() {
            if ($.clusterType == null) {
                throw new MissingRequiredPropertyException("GetDiskTypesPlainArgs", "clusterType");
            }
            if ($.destinationResource == null) {
                throw new MissingRequiredPropertyException("GetDiskTypesPlainArgs", "destinationResource");
            }
            if ($.instanceChargeType == null) {
                throw new MissingRequiredPropertyException("GetDiskTypesPlainArgs", "instanceChargeType");
            }
            if ($.instanceType == null) {
                throw new MissingRequiredPropertyException("GetDiskTypesPlainArgs", "instanceType");
            }
            return $;
        }
    }

}