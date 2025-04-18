// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dfs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileSystemArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileSystemArgs Empty = new FileSystemArgs();

    /**
     * Redundancy mode of the file system. Value:
     * - LRS (default): Local redundancy.
     * - ZRS: Same-City redundancy. When ZRS is selected, zoneId is a string consisting of multiple zones that are expected to be redundant in the same city, for example,  &#39;zoneId1,zoneId2 &#39;.
     * 
     */
    @Import(name="dataRedundancyType")
    private @Nullable Output<String> dataRedundancyType;

    /**
     * @return Redundancy mode of the file system. Value:
     * - LRS (default): Local redundancy.
     * - ZRS: Same-City redundancy. When ZRS is selected, zoneId is a string consisting of multiple zones that are expected to be redundant in the same city, for example,  &#39;zoneId1,zoneId2 &#39;.
     * 
     */
    public Optional<Output<String>> dataRedundancyType() {
        return Optional.ofNullable(this.dataRedundancyType);
    }

    /**
     * Dedicated cluster id, which is used to support scenarios such as group cloud migration.
     * 
     */
    @Import(name="dedicatedClusterId")
    private @Nullable Output<String> dedicatedClusterId;

    /**
     * @return Dedicated cluster id, which is used to support scenarios such as group cloud migration.
     * 
     */
    public Optional<Output<String>> dedicatedClusterId() {
        return Optional.ofNullable(this.dedicatedClusterId);
    }

    /**
     * The description of the file system resource. No more than 32 characters in length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the file system resource. No more than 32 characters in length.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The file system name. The naming rules are as follows: The length is 6~64 characters. Globally unique and cannot be an empty string. English letters are supported and can contain numbers, underscores (_), and dashes (-).
     * 
     */
    @Import(name="fileSystemName", required=true)
    private Output<String> fileSystemName;

    /**
     * @return The file system name. The naming rules are as follows: The length is 6~64 characters. Globally unique and cannot be an empty string. English letters are supported and can contain numbers, underscores (_), and dashes (-).
     * 
     */
    public Output<String> fileSystemName() {
        return this.fileSystemName;
    }

    /**
     * Save set sequence number, the user selects the content of the specified sequence number in the Save set.
     * 
     */
    @Import(name="partitionNumber")
    private @Nullable Output<Integer> partitionNumber;

    /**
     * @return Save set sequence number, the user selects the content of the specified sequence number in the Save set.
     * 
     */
    public Optional<Output<Integer>> partitionNumber() {
        return Optional.ofNullable(this.partitionNumber);
    }

    /**
     * The protocol type. Value: `HDFS`, `PANGU`.
     * 
     */
    @Import(name="protocolType", required=true)
    private Output<String> protocolType;

    /**
     * @return The protocol type. Value: `HDFS`, `PANGU`.
     * 
     */
    public Output<String> protocolType() {
        return this.protocolType;
    }

    /**
     * Provisioned throughput. This parameter is required when ThroughputMode is set to Provisioned. Unit: MB/s Value range: 1~5120.
     * 
     */
    @Import(name="provisionedThroughputInMiBps")
    private @Nullable Output<Integer> provisionedThroughputInMiBps;

    /**
     * @return Provisioned throughput. This parameter is required when ThroughputMode is set to Provisioned. Unit: MB/s Value range: 1~5120.
     * 
     */
    public Optional<Output<Integer>> provisionedThroughputInMiBps() {
        return Optional.ofNullable(this.provisionedThroughputInMiBps);
    }

    /**
     * File system capacity.  When the actual amount of data stored reaches the capacity of the file system, data cannot be written.  Unit: GiB.
     * 
     */
    @Import(name="spaceCapacity", required=true)
    private Output<Integer> spaceCapacity;

    /**
     * @return File system capacity.  When the actual amount of data stored reaches the capacity of the file system, data cannot be written.  Unit: GiB.
     * 
     */
    public Output<Integer> spaceCapacity() {
        return this.spaceCapacity;
    }

    /**
     * Save set identity, used to select a user-specified save set.
     * 
     */
    @Import(name="storageSetName")
    private @Nullable Output<String> storageSetName;

    /**
     * @return Save set identity, used to select a user-specified save set.
     * 
     */
    public Optional<Output<String>> storageSetName() {
        return Optional.ofNullable(this.storageSetName);
    }

    /**
     * The storage media type. Value: STANDARD (default): STANDARD PERFORMANCE: PERFORMANCE type.
     * 
     */
    @Import(name="storageType", required=true)
    private Output<String> storageType;

    /**
     * @return The storage media type. Value: STANDARD (default): STANDARD PERFORMANCE: PERFORMANCE type.
     * 
     */
    public Output<String> storageType() {
        return this.storageType;
    }

    /**
     * The throughput mode. Value: Standard (default): Standard throughput Provisioned: preset throughput.
     * 
     */
    @Import(name="throughputMode")
    private @Nullable Output<String> throughputMode;

    /**
     * @return The throughput mode. Value: Standard (default): Standard throughput Provisioned: preset throughput.
     * 
     */
    public Optional<Output<String>> throughputMode() {
        return Optional.ofNullable(this.throughputMode);
    }

    /**
     * Zone Id, which is used to create file system resources to the specified zone.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return Zone Id, which is used to create file system resources to the specified zone.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private FileSystemArgs() {}

    private FileSystemArgs(FileSystemArgs $) {
        this.dataRedundancyType = $.dataRedundancyType;
        this.dedicatedClusterId = $.dedicatedClusterId;
        this.description = $.description;
        this.fileSystemName = $.fileSystemName;
        this.partitionNumber = $.partitionNumber;
        this.protocolType = $.protocolType;
        this.provisionedThroughputInMiBps = $.provisionedThroughputInMiBps;
        this.spaceCapacity = $.spaceCapacity;
        this.storageSetName = $.storageSetName;
        this.storageType = $.storageType;
        this.throughputMode = $.throughputMode;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileSystemArgs $;

        public Builder() {
            $ = new FileSystemArgs();
        }

        public Builder(FileSystemArgs defaults) {
            $ = new FileSystemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataRedundancyType Redundancy mode of the file system. Value:
         * - LRS (default): Local redundancy.
         * - ZRS: Same-City redundancy. When ZRS is selected, zoneId is a string consisting of multiple zones that are expected to be redundant in the same city, for example,  &#39;zoneId1,zoneId2 &#39;.
         * 
         * @return builder
         * 
         */
        public Builder dataRedundancyType(@Nullable Output<String> dataRedundancyType) {
            $.dataRedundancyType = dataRedundancyType;
            return this;
        }

        /**
         * @param dataRedundancyType Redundancy mode of the file system. Value:
         * - LRS (default): Local redundancy.
         * - ZRS: Same-City redundancy. When ZRS is selected, zoneId is a string consisting of multiple zones that are expected to be redundant in the same city, for example,  &#39;zoneId1,zoneId2 &#39;.
         * 
         * @return builder
         * 
         */
        public Builder dataRedundancyType(String dataRedundancyType) {
            return dataRedundancyType(Output.of(dataRedundancyType));
        }

        /**
         * @param dedicatedClusterId Dedicated cluster id, which is used to support scenarios such as group cloud migration.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedClusterId(@Nullable Output<String> dedicatedClusterId) {
            $.dedicatedClusterId = dedicatedClusterId;
            return this;
        }

        /**
         * @param dedicatedClusterId Dedicated cluster id, which is used to support scenarios such as group cloud migration.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedClusterId(String dedicatedClusterId) {
            return dedicatedClusterId(Output.of(dedicatedClusterId));
        }

        /**
         * @param description The description of the file system resource. No more than 32 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the file system resource. No more than 32 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param fileSystemName The file system name. The naming rules are as follows: The length is 6~64 characters. Globally unique and cannot be an empty string. English letters are supported and can contain numbers, underscores (_), and dashes (-).
         * 
         * @return builder
         * 
         */
        public Builder fileSystemName(Output<String> fileSystemName) {
            $.fileSystemName = fileSystemName;
            return this;
        }

        /**
         * @param fileSystemName The file system name. The naming rules are as follows: The length is 6~64 characters. Globally unique and cannot be an empty string. English letters are supported and can contain numbers, underscores (_), and dashes (-).
         * 
         * @return builder
         * 
         */
        public Builder fileSystemName(String fileSystemName) {
            return fileSystemName(Output.of(fileSystemName));
        }

        /**
         * @param partitionNumber Save set sequence number, the user selects the content of the specified sequence number in the Save set.
         * 
         * @return builder
         * 
         */
        public Builder partitionNumber(@Nullable Output<Integer> partitionNumber) {
            $.partitionNumber = partitionNumber;
            return this;
        }

        /**
         * @param partitionNumber Save set sequence number, the user selects the content of the specified sequence number in the Save set.
         * 
         * @return builder
         * 
         */
        public Builder partitionNumber(Integer partitionNumber) {
            return partitionNumber(Output.of(partitionNumber));
        }

        /**
         * @param protocolType The protocol type. Value: `HDFS`, `PANGU`.
         * 
         * @return builder
         * 
         */
        public Builder protocolType(Output<String> protocolType) {
            $.protocolType = protocolType;
            return this;
        }

        /**
         * @param protocolType The protocol type. Value: `HDFS`, `PANGU`.
         * 
         * @return builder
         * 
         */
        public Builder protocolType(String protocolType) {
            return protocolType(Output.of(protocolType));
        }

        /**
         * @param provisionedThroughputInMiBps Provisioned throughput. This parameter is required when ThroughputMode is set to Provisioned. Unit: MB/s Value range: 1~5120.
         * 
         * @return builder
         * 
         */
        public Builder provisionedThroughputInMiBps(@Nullable Output<Integer> provisionedThroughputInMiBps) {
            $.provisionedThroughputInMiBps = provisionedThroughputInMiBps;
            return this;
        }

        /**
         * @param provisionedThroughputInMiBps Provisioned throughput. This parameter is required when ThroughputMode is set to Provisioned. Unit: MB/s Value range: 1~5120.
         * 
         * @return builder
         * 
         */
        public Builder provisionedThroughputInMiBps(Integer provisionedThroughputInMiBps) {
            return provisionedThroughputInMiBps(Output.of(provisionedThroughputInMiBps));
        }

        /**
         * @param spaceCapacity File system capacity.  When the actual amount of data stored reaches the capacity of the file system, data cannot be written.  Unit: GiB.
         * 
         * @return builder
         * 
         */
        public Builder spaceCapacity(Output<Integer> spaceCapacity) {
            $.spaceCapacity = spaceCapacity;
            return this;
        }

        /**
         * @param spaceCapacity File system capacity.  When the actual amount of data stored reaches the capacity of the file system, data cannot be written.  Unit: GiB.
         * 
         * @return builder
         * 
         */
        public Builder spaceCapacity(Integer spaceCapacity) {
            return spaceCapacity(Output.of(spaceCapacity));
        }

        /**
         * @param storageSetName Save set identity, used to select a user-specified save set.
         * 
         * @return builder
         * 
         */
        public Builder storageSetName(@Nullable Output<String> storageSetName) {
            $.storageSetName = storageSetName;
            return this;
        }

        /**
         * @param storageSetName Save set identity, used to select a user-specified save set.
         * 
         * @return builder
         * 
         */
        public Builder storageSetName(String storageSetName) {
            return storageSetName(Output.of(storageSetName));
        }

        /**
         * @param storageType The storage media type. Value: STANDARD (default): STANDARD PERFORMANCE: PERFORMANCE type.
         * 
         * @return builder
         * 
         */
        public Builder storageType(Output<String> storageType) {
            $.storageType = storageType;
            return this;
        }

        /**
         * @param storageType The storage media type. Value: STANDARD (default): STANDARD PERFORMANCE: PERFORMANCE type.
         * 
         * @return builder
         * 
         */
        public Builder storageType(String storageType) {
            return storageType(Output.of(storageType));
        }

        /**
         * @param throughputMode The throughput mode. Value: Standard (default): Standard throughput Provisioned: preset throughput.
         * 
         * @return builder
         * 
         */
        public Builder throughputMode(@Nullable Output<String> throughputMode) {
            $.throughputMode = throughputMode;
            return this;
        }

        /**
         * @param throughputMode The throughput mode. Value: Standard (default): Standard throughput Provisioned: preset throughput.
         * 
         * @return builder
         * 
         */
        public Builder throughputMode(String throughputMode) {
            return throughputMode(Output.of(throughputMode));
        }

        /**
         * @param zoneId Zone Id, which is used to create file system resources to the specified zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId Zone Id, which is used to create file system resources to the specified zone.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public FileSystemArgs build() {
            if ($.fileSystemName == null) {
                throw new MissingRequiredPropertyException("FileSystemArgs", "fileSystemName");
            }
            if ($.protocolType == null) {
                throw new MissingRequiredPropertyException("FileSystemArgs", "protocolType");
            }
            if ($.spaceCapacity == null) {
                throw new MissingRequiredPropertyException("FileSystemArgs", "spaceCapacity");
            }
            if ($.storageType == null) {
                throw new MissingRequiredPropertyException("FileSystemArgs", "storageType");
            }
            return $;
        }
    }

}
