// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kvstore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceEnginesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceEnginesArgs Empty = new GetInstanceEnginesArgs();

    /**
     * Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
     * 
     */
    @Import(name="engine")
    private @Nullable Output<String> engine;

    /**
     * @return Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
     * 
     */
    public Optional<Output<String>> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    /**
     * @return Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
     * 
     */
    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
     * 
     */
    @Import(name="instanceChargeType")
    private @Nullable Output<String> instanceChargeType;

    /**
     * @return Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
     * 
     */
    public Optional<Output<String>> instanceChargeType() {
        return Optional.ofNullable(this.instanceChargeType);
    }

    /**
     * File name where to save data source results (after running `pulumi up`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi up`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The Zone to launch the KVStore instance.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The Zone to launch the KVStore instance.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private GetInstanceEnginesArgs() {}

    private GetInstanceEnginesArgs(GetInstanceEnginesArgs $) {
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.instanceChargeType = $.instanceChargeType;
        this.outputFile = $.outputFile;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceEnginesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceEnginesArgs $;

        public Builder() {
            $ = new GetInstanceEnginesArgs();
        }

        public Builder(GetInstanceEnginesArgs defaults) {
            $ = new GetInstanceEnginesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param engine Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable Output<String> engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engine Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
         * 
         * @return builder
         * 
         */
        public Builder engine(String engine) {
            return engine(Output.of(engine));
        }

        /**
         * @param engineVersion Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param engineVersion Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        /**
         * @param instanceChargeType Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
         * 
         * @return builder
         * 
         */
        public Builder instanceChargeType(@Nullable Output<String> instanceChargeType) {
            $.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * @param instanceChargeType Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
         * 
         * @return builder
         * 
         */
        public Builder instanceChargeType(String instanceChargeType) {
            return instanceChargeType(Output.of(instanceChargeType));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi up`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi up`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param zoneId The Zone to launch the KVStore instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The Zone to launch the KVStore instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetInstanceEnginesArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetInstanceEnginesArgs", "zoneId");
            }
            return $;
        }
    }

}