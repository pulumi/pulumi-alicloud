// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamingDataSourceState extends com.pulumi.resources.ResourceArgs {

    public static final StreamingDataSourceState Empty = new StreamingDataSourceState();

    /**
     * Creation time
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Creation time
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The configurations of the data source.
     * 
     */
    @Import(name="dataSourceConfig")
    private @Nullable Output<String> dataSourceConfig;

    /**
     * @return The configurations of the data source.
     * 
     */
    public Optional<Output<String>> dataSourceConfig() {
        return Optional.ofNullable(this.dataSourceConfig);
    }

    /**
     * The description of the data source.
     * 
     */
    @Import(name="dataSourceDescription")
    private @Nullable Output<String> dataSourceDescription;

    /**
     * @return The description of the data source.
     * 
     */
    public Optional<Output<String>> dataSourceDescription() {
        return Optional.ofNullable(this.dataSourceDescription);
    }

    /**
     * The data source ID.
     * 
     */
    @Import(name="dataSourceId")
    private @Nullable Output<String> dataSourceId;

    /**
     * @return The data source ID.
     * 
     */
    public Optional<Output<String>> dataSourceId() {
        return Optional.ofNullable(this.dataSourceId);
    }

    /**
     * Data Source Name
     * 
     */
    @Import(name="dataSourceName")
    private @Nullable Output<String> dataSourceName;

    /**
     * @return Data Source Name
     * 
     */
    public Optional<Output<String>> dataSourceName() {
        return Optional.ofNullable(this.dataSourceName);
    }

    /**
     * Data Source Type
     * 
     */
    @Import(name="dataSourceType")
    private @Nullable Output<String> dataSourceType;

    /**
     * @return Data Source Type
     * 
     */
    public Optional<Output<String>> dataSourceType() {
        return Optional.ofNullable(this.dataSourceType);
    }

    /**
     * The instance ID.
     * 
     * &gt; **NOTE:**   You can call the [DescribeDBInstances](https://www.alibabacloud.com/help/en/doc-detail/196830.html) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
     * 
     */
    @Import(name="dbInstanceId")
    private @Nullable Output<String> dbInstanceId;

    /**
     * @return The instance ID.
     * 
     * &gt; **NOTE:**   You can call the [DescribeDBInstances](https://www.alibabacloud.com/help/en/doc-detail/196830.html) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
     * 
     */
    public Optional<Output<String>> dbInstanceId() {
        return Optional.ofNullable(this.dbInstanceId);
    }

    /**
     * The real-time data service ID.
     * 
     */
    @Import(name="serviceId")
    private @Nullable Output<Integer> serviceId;

    /**
     * @return The real-time data service ID.
     * 
     */
    public Optional<Output<Integer>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    /**
     * Service Status:
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Service Status:
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private StreamingDataSourceState() {}

    private StreamingDataSourceState(StreamingDataSourceState $) {
        this.createTime = $.createTime;
        this.dataSourceConfig = $.dataSourceConfig;
        this.dataSourceDescription = $.dataSourceDescription;
        this.dataSourceId = $.dataSourceId;
        this.dataSourceName = $.dataSourceName;
        this.dataSourceType = $.dataSourceType;
        this.dbInstanceId = $.dbInstanceId;
        this.serviceId = $.serviceId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingDataSourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingDataSourceState $;

        public Builder() {
            $ = new StreamingDataSourceState();
        }

        public Builder(StreamingDataSourceState defaults) {
            $ = new StreamingDataSourceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Creation time
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Creation time
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param dataSourceConfig The configurations of the data source.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceConfig(@Nullable Output<String> dataSourceConfig) {
            $.dataSourceConfig = dataSourceConfig;
            return this;
        }

        /**
         * @param dataSourceConfig The configurations of the data source.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceConfig(String dataSourceConfig) {
            return dataSourceConfig(Output.of(dataSourceConfig));
        }

        /**
         * @param dataSourceDescription The description of the data source.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceDescription(@Nullable Output<String> dataSourceDescription) {
            $.dataSourceDescription = dataSourceDescription;
            return this;
        }

        /**
         * @param dataSourceDescription The description of the data source.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceDescription(String dataSourceDescription) {
            return dataSourceDescription(Output.of(dataSourceDescription));
        }

        /**
         * @param dataSourceId The data source ID.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(@Nullable Output<String> dataSourceId) {
            $.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * @param dataSourceId The data source ID.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceId(String dataSourceId) {
            return dataSourceId(Output.of(dataSourceId));
        }

        /**
         * @param dataSourceName Data Source Name
         * 
         * @return builder
         * 
         */
        public Builder dataSourceName(@Nullable Output<String> dataSourceName) {
            $.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * @param dataSourceName Data Source Name
         * 
         * @return builder
         * 
         */
        public Builder dataSourceName(String dataSourceName) {
            return dataSourceName(Output.of(dataSourceName));
        }

        /**
         * @param dataSourceType Data Source Type
         * 
         * @return builder
         * 
         */
        public Builder dataSourceType(@Nullable Output<String> dataSourceType) {
            $.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * @param dataSourceType Data Source Type
         * 
         * @return builder
         * 
         */
        public Builder dataSourceType(String dataSourceType) {
            return dataSourceType(Output.of(dataSourceType));
        }

        /**
         * @param dbInstanceId The instance ID.
         * 
         * &gt; **NOTE:**   You can call the [DescribeDBInstances](https://www.alibabacloud.com/help/en/doc-detail/196830.html) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(@Nullable Output<String> dbInstanceId) {
            $.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * @param dbInstanceId The instance ID.
         * 
         * &gt; **NOTE:**   You can call the [DescribeDBInstances](https://www.alibabacloud.com/help/en/doc-detail/196830.html) operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(String dbInstanceId) {
            return dbInstanceId(Output.of(dbInstanceId));
        }

        /**
         * @param serviceId The real-time data service ID.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(@Nullable Output<Integer> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The real-time data service ID.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Integer serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param status Service Status:
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Service Status:
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public StreamingDataSourceState build() {
            return $;
        }
    }

}
