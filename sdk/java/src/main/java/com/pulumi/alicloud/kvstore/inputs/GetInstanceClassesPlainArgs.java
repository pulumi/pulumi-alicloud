// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kvstore.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceClassesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceClassesPlainArgs Empty = new GetInstanceClassesPlainArgs();

    /**
     * The KVStore instance system architecture required by the user. Valid values: `standard`, `cluster` and `rwsplit`.
     * 
     */
    @Import(name="architecture")
    private @Nullable String architecture;

    /**
     * @return The KVStore instance system architecture required by the user. Valid values: `standard`, `cluster` and `rwsplit`.
     * 
     */
    public Optional<String> architecture() {
        return Optional.ofNullable(this.architecture);
    }

    /**
     * The KVStore instance edition type required by the user. Valid values: `Community` and `Enterprise`.
     * 
     */
    @Import(name="editionType")
    private @Nullable String editionType;

    /**
     * @return The KVStore instance edition type required by the user. Valid values: `Community` and `Enterprise`.
     * 
     */
    public Optional<String> editionType() {
        return Optional.ofNullable(this.editionType);
    }

    /**
     * Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
     * 
     */
    @Import(name="engine")
    private @Nullable String engine;

    /**
     * @return Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
     * 
     */
    public Optional<String> engine() {
        return Optional.ofNullable(this.engine);
    }

    /**
     * Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable String engineVersion;

    /**
     * @return Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
     * 
     */
    public Optional<String> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
     * 
     */
    @Import(name="instanceChargeType")
    private @Nullable String instanceChargeType;

    /**
     * @return Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
     * 
     */
    public Optional<String> instanceChargeType() {
        return Optional.ofNullable(this.instanceChargeType);
    }

    /**
     * The KVStore instance node type required by the user. Valid values: `double`, `single`, `readone`, `readthree` and `readfive`.
     * 
     */
    @Import(name="nodeType")
    private @Nullable String nodeType;

    /**
     * @return The KVStore instance node type required by the user. Valid values: `double`, `single`, `readone`, `readthree` and `readfive`.
     * 
     */
    public Optional<String> nodeType() {
        return Optional.ofNullable(this.nodeType);
    }

    /**
     * File name where to save data source results (after running `pulumi up`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi up`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * It has been deprecated from 1.68.0.
     * 
     * @deprecated
     * The parameter &#39;package_type&#39; has been deprecated from 1.68.0.
     * 
     */
    @Deprecated /* The parameter 'package_type' has been deprecated from 1.68.0. */
    @Import(name="packageType")
    private @Nullable String packageType;

    /**
     * @return It has been deprecated from 1.68.0.
     * 
     * @deprecated
     * The parameter &#39;package_type&#39; has been deprecated from 1.68.0.
     * 
     */
    @Deprecated /* The parameter 'package_type' has been deprecated from 1.68.0. */
    public Optional<String> packageType() {
        return Optional.ofNullable(this.packageType);
    }

    /**
     * It has been deprecated from 1.68.0.
     * 
     * @deprecated
     * The parameter &#39;performance_type&#39; has been deprecated from 1.68.0.
     * 
     */
    @Deprecated /* The parameter 'performance_type' has been deprecated from 1.68.0. */
    @Import(name="performanceType")
    private @Nullable String performanceType;

    /**
     * @return It has been deprecated from 1.68.0.
     * 
     * @deprecated
     * The parameter &#39;performance_type&#39; has been deprecated from 1.68.0.
     * 
     */
    @Deprecated /* The parameter 'performance_type' has been deprecated from 1.68.0. */
    public Optional<String> performanceType() {
        return Optional.ofNullable(this.performanceType);
    }

    @Import(name="productType")
    private @Nullable String productType;

    public Optional<String> productType() {
        return Optional.ofNullable(this.productType);
    }

    /**
     * The KVStore instance series type required by the user. Valid values: `enhanced_performance_type` and `hybrid_storage`.
     * 
     */
    @Import(name="seriesType")
    private @Nullable String seriesType;

    /**
     * @return The KVStore instance series type required by the user. Valid values: `enhanced_performance_type` and `hybrid_storage`.
     * 
     */
    public Optional<String> seriesType() {
        return Optional.ofNullable(this.seriesType);
    }

    /**
     * The number of shard.Valid values: `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`.
     * * product_type - (Optional, Available since 1.130.0) The type of the service. Valid values:
     * * Local: an ApsaraDB for Redis instance with a local disk.
     * * OnECS: an ApsaraDB for Redis instance with a standard disk. This type is available only on the Alibaba Cloud China site.
     * 
     */
    @Import(name="shardNumber")
    private @Nullable Integer shardNumber;

    /**
     * @return The number of shard.Valid values: `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`.
     * * product_type - (Optional, Available since 1.130.0) The type of the service. Valid values:
     * * Local: an ApsaraDB for Redis instance with a local disk.
     * * OnECS: an ApsaraDB for Redis instance with a standard disk. This type is available only on the Alibaba Cloud China site.
     * 
     */
    public Optional<Integer> shardNumber() {
        return Optional.ofNullable(this.shardNumber);
    }

    @Import(name="sortedBy")
    private @Nullable String sortedBy;

    public Optional<String> sortedBy() {
        return Optional.ofNullable(this.sortedBy);
    }

    /**
     * It has been deprecated from 1.68.0.
     * 
     * @deprecated
     * The parameter &#39;storage_type&#39; has been deprecated from 1.68.0.
     * 
     */
    @Deprecated /* The parameter 'storage_type' has been deprecated from 1.68.0. */
    @Import(name="storageType")
    private @Nullable String storageType;

    /**
     * @return It has been deprecated from 1.68.0.
     * 
     * @deprecated
     * The parameter &#39;storage_type&#39; has been deprecated from 1.68.0.
     * 
     */
    @Deprecated /* The parameter 'storage_type' has been deprecated from 1.68.0. */
    public Optional<String> storageType() {
        return Optional.ofNullable(this.storageType);
    }

    /**
     * The Zone to launch the KVStore instance.
     * 
     */
    @Import(name="zoneId", required=true)
    private String zoneId;

    /**
     * @return The Zone to launch the KVStore instance.
     * 
     */
    public String zoneId() {
        return this.zoneId;
    }

    private GetInstanceClassesPlainArgs() {}

    private GetInstanceClassesPlainArgs(GetInstanceClassesPlainArgs $) {
        this.architecture = $.architecture;
        this.editionType = $.editionType;
        this.engine = $.engine;
        this.engineVersion = $.engineVersion;
        this.instanceChargeType = $.instanceChargeType;
        this.nodeType = $.nodeType;
        this.outputFile = $.outputFile;
        this.packageType = $.packageType;
        this.performanceType = $.performanceType;
        this.productType = $.productType;
        this.seriesType = $.seriesType;
        this.shardNumber = $.shardNumber;
        this.sortedBy = $.sortedBy;
        this.storageType = $.storageType;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceClassesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceClassesPlainArgs $;

        public Builder() {
            $ = new GetInstanceClassesPlainArgs();
        }

        public Builder(GetInstanceClassesPlainArgs defaults) {
            $ = new GetInstanceClassesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param architecture The KVStore instance system architecture required by the user. Valid values: `standard`, `cluster` and `rwsplit`.
         * 
         * @return builder
         * 
         */
        public Builder architecture(@Nullable String architecture) {
            $.architecture = architecture;
            return this;
        }

        /**
         * @param editionType The KVStore instance edition type required by the user. Valid values: `Community` and `Enterprise`.
         * 
         * @return builder
         * 
         */
        public Builder editionType(@Nullable String editionType) {
            $.editionType = editionType;
            return this;
        }

        /**
         * @param engine Database type. Options are `Redis`, `Memcache`. Default to `Redis`.
         * 
         * @return builder
         * 
         */
        public Builder engine(@Nullable String engine) {
            $.engine = engine;
            return this;
        }

        /**
         * @param engineVersion Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/60873.htm) `EngineVersion`. Value of Memcache should be empty.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable String engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param instanceChargeType Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PrePaid`.
         * 
         * @return builder
         * 
         */
        public Builder instanceChargeType(@Nullable String instanceChargeType) {
            $.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * @param nodeType The KVStore instance node type required by the user. Valid values: `double`, `single`, `readone`, `readthree` and `readfive`.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(@Nullable String nodeType) {
            $.nodeType = nodeType;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi up`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param packageType It has been deprecated from 1.68.0.
         * 
         * @return builder
         * 
         * @deprecated
         * The parameter &#39;package_type&#39; has been deprecated from 1.68.0.
         * 
         */
        @Deprecated /* The parameter 'package_type' has been deprecated from 1.68.0. */
        public Builder packageType(@Nullable String packageType) {
            $.packageType = packageType;
            return this;
        }

        /**
         * @param performanceType It has been deprecated from 1.68.0.
         * 
         * @return builder
         * 
         * @deprecated
         * The parameter &#39;performance_type&#39; has been deprecated from 1.68.0.
         * 
         */
        @Deprecated /* The parameter 'performance_type' has been deprecated from 1.68.0. */
        public Builder performanceType(@Nullable String performanceType) {
            $.performanceType = performanceType;
            return this;
        }

        public Builder productType(@Nullable String productType) {
            $.productType = productType;
            return this;
        }

        /**
         * @param seriesType The KVStore instance series type required by the user. Valid values: `enhanced_performance_type` and `hybrid_storage`.
         * 
         * @return builder
         * 
         */
        public Builder seriesType(@Nullable String seriesType) {
            $.seriesType = seriesType;
            return this;
        }

        /**
         * @param shardNumber The number of shard.Valid values: `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`.
         * * product_type - (Optional, Available since 1.130.0) The type of the service. Valid values:
         * * Local: an ApsaraDB for Redis instance with a local disk.
         * * OnECS: an ApsaraDB for Redis instance with a standard disk. This type is available only on the Alibaba Cloud China site.
         * 
         * @return builder
         * 
         */
        public Builder shardNumber(@Nullable Integer shardNumber) {
            $.shardNumber = shardNumber;
            return this;
        }

        public Builder sortedBy(@Nullable String sortedBy) {
            $.sortedBy = sortedBy;
            return this;
        }

        /**
         * @param storageType It has been deprecated from 1.68.0.
         * 
         * @return builder
         * 
         * @deprecated
         * The parameter &#39;storage_type&#39; has been deprecated from 1.68.0.
         * 
         */
        @Deprecated /* The parameter 'storage_type' has been deprecated from 1.68.0. */
        public Builder storageType(@Nullable String storageType) {
            $.storageType = storageType;
            return this;
        }

        /**
         * @param zoneId The Zone to launch the KVStore instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public GetInstanceClassesPlainArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetInstanceClassesPlainArgs", "zoneId");
            }
            return $;
        }
    }

}