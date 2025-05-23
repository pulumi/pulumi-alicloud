// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kvstore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceClassesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceClassesArgs Empty = new GetInstanceClassesArgs();

    /**
     * The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance system architecture required by the user. Valid values: `standard`, `cluster` and `rwsplit`.
     * 
     */
    @Import(name="architecture")
    private @Nullable Output<String> architecture;

    /**
     * @return The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance system architecture required by the user. Valid values: `standard`, `cluster` and `rwsplit`.
     * 
     */
    public Optional<Output<String>> architecture() {
        return Optional.ofNullable(this.architecture);
    }

    /**
     * The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance edition type required by the user. Valid values: `Community` and `Enterprise`.
     * 
     */
    @Import(name="editionType")
    private @Nullable Output<String> editionType;

    /**
     * @return The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance edition type required by the user. Valid values: `Community` and `Enterprise`.
     * 
     */
    public Optional<Output<String>> editionType() {
        return Optional.ofNullable(this.editionType);
    }

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
     * Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-createinstance-redis) `EngineVersion`. Value of Memcache should be empty.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    /**
     * @return Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-createinstance-redis) `EngineVersion`. Value of Memcache should be empty.
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
     * The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance node type required by the user. Valid values: `double`, `single`, `readone`, `readthree` and `readfive`.
     * 
     */
    @Import(name="nodeType")
    private @Nullable Output<String> nodeType;

    /**
     * @return The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance node type required by the user. Valid values: `double`, `single`, `readone`, `readthree` and `readfive`.
     * 
     */
    public Optional<Output<String>> nodeType() {
        return Optional.ofNullable(this.nodeType);
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
     * It has been deprecated from 1.68.0.
     * 
     * @deprecated
     * The parameter &#39;package_type&#39; has been deprecated from 1.68.0.
     * 
     */
    @Deprecated /* The parameter 'package_type' has been deprecated from 1.68.0. */
    @Import(name="packageType")
    private @Nullable Output<String> packageType;

    /**
     * @return It has been deprecated from 1.68.0.
     * 
     * @deprecated
     * The parameter &#39;package_type&#39; has been deprecated from 1.68.0.
     * 
     */
    @Deprecated /* The parameter 'package_type' has been deprecated from 1.68.0. */
    public Optional<Output<String>> packageType() {
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
    private @Nullable Output<String> performanceType;

    /**
     * @return It has been deprecated from 1.68.0.
     * 
     * @deprecated
     * The parameter &#39;performance_type&#39; has been deprecated from 1.68.0.
     * 
     */
    @Deprecated /* The parameter 'performance_type' has been deprecated from 1.68.0. */
    public Optional<Output<String>> performanceType() {
        return Optional.ofNullable(this.performanceType);
    }

    /**
     * The type of the service. Valid values:
     * * Local: a Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance with a local disk.
     * * OnECS: a Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance with a standard disk. This type is available only on the Alibaba Cloud China site.
     * 
     */
    @Import(name="productType")
    private @Nullable Output<String> productType;

    /**
     * @return The type of the service. Valid values:
     * * Local: a Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance with a local disk.
     * * OnECS: a Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance with a standard disk. This type is available only on the Alibaba Cloud China site.
     * 
     */
    public Optional<Output<String>> productType() {
        return Optional.ofNullable(this.productType);
    }

    /**
     * The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance series type required by the user. Valid values: `enhanced_performance_type` and `hybrid_storage`.
     * 
     */
    @Import(name="seriesType")
    private @Nullable Output<String> seriesType;

    /**
     * @return The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance series type required by the user. Valid values: `enhanced_performance_type` and `hybrid_storage`.
     * 
     */
    public Optional<Output<String>> seriesType() {
        return Optional.ofNullable(this.seriesType);
    }

    /**
     * The number of shard.Valid values: `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`.
     * 
     */
    @Import(name="shardNumber")
    private @Nullable Output<Integer> shardNumber;

    /**
     * @return The number of shard.Valid values: `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`.
     * 
     */
    public Optional<Output<Integer>> shardNumber() {
        return Optional.ofNullable(this.shardNumber);
    }

    @Import(name="sortedBy")
    private @Nullable Output<String> sortedBy;

    public Optional<Output<String>> sortedBy() {
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
    private @Nullable Output<String> storageType;

    /**
     * @return It has been deprecated from 1.68.0.
     * 
     * @deprecated
     * The parameter &#39;storage_type&#39; has been deprecated from 1.68.0.
     * 
     */
    @Deprecated /* The parameter 'storage_type' has been deprecated from 1.68.0. */
    public Optional<Output<String>> storageType() {
        return Optional.ofNullable(this.storageType);
    }

    /**
     * The Zone to launch the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The Zone to launch the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private GetInstanceClassesArgs() {}

    private GetInstanceClassesArgs(GetInstanceClassesArgs $) {
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
    public static Builder builder(GetInstanceClassesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceClassesArgs $;

        public Builder() {
            $ = new GetInstanceClassesArgs();
        }

        public Builder(GetInstanceClassesArgs defaults) {
            $ = new GetInstanceClassesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param architecture The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance system architecture required by the user. Valid values: `standard`, `cluster` and `rwsplit`.
         * 
         * @return builder
         * 
         */
        public Builder architecture(@Nullable Output<String> architecture) {
            $.architecture = architecture;
            return this;
        }

        /**
         * @param architecture The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance system architecture required by the user. Valid values: `standard`, `cluster` and `rwsplit`.
         * 
         * @return builder
         * 
         */
        public Builder architecture(String architecture) {
            return architecture(Output.of(architecture));
        }

        /**
         * @param editionType The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance edition type required by the user. Valid values: `Community` and `Enterprise`.
         * 
         * @return builder
         * 
         */
        public Builder editionType(@Nullable Output<String> editionType) {
            $.editionType = editionType;
            return this;
        }

        /**
         * @param editionType The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance edition type required by the user. Valid values: `Community` and `Enterprise`.
         * 
         * @return builder
         * 
         */
        public Builder editionType(String editionType) {
            return editionType(Output.of(editionType));
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
         * @param engineVersion Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-createinstance-redis) `EngineVersion`. Value of Memcache should be empty.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param engineVersion Database version required by the user. Value options of Redis can refer to the latest docs [detail info](https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-createinstance-redis) `EngineVersion`. Value of Memcache should be empty.
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
         * @param nodeType The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance node type required by the user. Valid values: `double`, `single`, `readone`, `readthree` and `readfive`.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(@Nullable Output<String> nodeType) {
            $.nodeType = nodeType;
            return this;
        }

        /**
         * @param nodeType The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance node type required by the user. Valid values: `double`, `single`, `readone`, `readthree` and `readfive`.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(String nodeType) {
            return nodeType(Output.of(nodeType));
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
         * @param packageType It has been deprecated from 1.68.0.
         * 
         * @return builder
         * 
         * @deprecated
         * The parameter &#39;package_type&#39; has been deprecated from 1.68.0.
         * 
         */
        @Deprecated /* The parameter 'package_type' has been deprecated from 1.68.0. */
        public Builder packageType(@Nullable Output<String> packageType) {
            $.packageType = packageType;
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
        public Builder packageType(String packageType) {
            return packageType(Output.of(packageType));
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
        public Builder performanceType(@Nullable Output<String> performanceType) {
            $.performanceType = performanceType;
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
        public Builder performanceType(String performanceType) {
            return performanceType(Output.of(performanceType));
        }

        /**
         * @param productType The type of the service. Valid values:
         * * Local: a Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance with a local disk.
         * * OnECS: a Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance with a standard disk. This type is available only on the Alibaba Cloud China site.
         * 
         * @return builder
         * 
         */
        public Builder productType(@Nullable Output<String> productType) {
            $.productType = productType;
            return this;
        }

        /**
         * @param productType The type of the service. Valid values:
         * * Local: a Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance with a local disk.
         * * OnECS: a Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance with a standard disk. This type is available only on the Alibaba Cloud China site.
         * 
         * @return builder
         * 
         */
        public Builder productType(String productType) {
            return productType(Output.of(productType));
        }

        /**
         * @param seriesType The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance series type required by the user. Valid values: `enhanced_performance_type` and `hybrid_storage`.
         * 
         * @return builder
         * 
         */
        public Builder seriesType(@Nullable Output<String> seriesType) {
            $.seriesType = seriesType;
            return this;
        }

        /**
         * @param seriesType The Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance series type required by the user. Valid values: `enhanced_performance_type` and `hybrid_storage`.
         * 
         * @return builder
         * 
         */
        public Builder seriesType(String seriesType) {
            return seriesType(Output.of(seriesType));
        }

        /**
         * @param shardNumber The number of shard.Valid values: `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`.
         * 
         * @return builder
         * 
         */
        public Builder shardNumber(@Nullable Output<Integer> shardNumber) {
            $.shardNumber = shardNumber;
            return this;
        }

        /**
         * @param shardNumber The number of shard.Valid values: `1`, `2`, `4`, `8`, `16`, `32`, `64`, `128`, `256`.
         * 
         * @return builder
         * 
         */
        public Builder shardNumber(Integer shardNumber) {
            return shardNumber(Output.of(shardNumber));
        }

        public Builder sortedBy(@Nullable Output<String> sortedBy) {
            $.sortedBy = sortedBy;
            return this;
        }

        public Builder sortedBy(String sortedBy) {
            return sortedBy(Output.of(sortedBy));
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
        public Builder storageType(@Nullable Output<String> storageType) {
            $.storageType = storageType;
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
        public Builder storageType(String storageType) {
            return storageType(Output.of(storageType));
        }

        /**
         * @param zoneId The Zone to launch the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The Zone to launch the Tair (Redis OSS-Compatible) And Memcache (KVStore) Instance.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetInstanceClassesArgs build() {
            if ($.zoneId == null) {
                throw new MissingRequiredPropertyException("GetInstanceClassesArgs", "zoneId");
            }
            return $;
        }
    }

}
