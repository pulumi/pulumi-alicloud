// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dts.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SynchronizationInstanceState extends com.pulumi.resources.ResourceArgs {

    public static final SynchronizationInstanceState Empty = new SynchronizationInstanceState();

    /**
     * Whether to automatically renew when it expires. Valid values: `true`, `false`.
     * 
     */
    @Import(name="autoPay")
    private @Nullable Output<String> autoPay;

    /**
     * @return Whether to automatically renew when it expires. Valid values: `true`, `false`.
     * 
     */
    public Optional<Output<String>> autoPay() {
        return Optional.ofNullable(this.autoPay);
    }

    /**
     * Whether to automatically start the task after the purchase completed. Valid values: `true`, `false`.
     * 
     */
    @Import(name="autoStart")
    private @Nullable Output<String> autoStart;

    /**
     * @return Whether to automatically start the task after the purchase completed. Valid values: `true`, `false`.
     * 
     */
    public Optional<Output<String>> autoStart() {
        return Optional.ofNullable(this.autoStart);
    }

    /**
     * [ETL specifications](https://help.aliyun.com/document_detail/212324.html). The unit is the computing unit ComputeUnit (CU), 1CU=1vCPU+4 GB memory. The value range is an integer greater than or equal to 2.
     * 
     */
    @Import(name="computeUnit")
    private @Nullable Output<Integer> computeUnit;

    /**
     * @return [ETL specifications](https://help.aliyun.com/document_detail/212324.html). The unit is the computing unit ComputeUnit (CU), 1CU=1vCPU+4 GB memory. The value range is an integer greater than or equal to 2.
     * 
     */
    public Optional<Output<Integer>> computeUnit() {
        return Optional.ofNullable(this.computeUnit);
    }

    /**
     * The number of private customized RDS instances under PolarDB-X. The default value is 1. This parameter needs to be passed only when `source_endpoint_engine_name` equals `drds`.
     * 
     */
    @Import(name="databaseCount")
    private @Nullable Output<Integer> databaseCount;

    /**
     * @return The number of private customized RDS instances under PolarDB-X. The default value is 1. This parameter needs to be passed only when `source_endpoint_engine_name` equals `drds`.
     * 
     */
    public Optional<Output<Integer>> databaseCount() {
        return Optional.ofNullable(this.databaseCount);
    }

    /**
     * The type of destination engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardb_o`, `polardb_pg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
     * 
     */
    @Import(name="destinationEndpointEngineName")
    private @Nullable Output<String> destinationEndpointEngineName;

    /**
     * @return The type of destination engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardb_o`, `polardb_pg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
     * 
     */
    public Optional<Output<String>> destinationEndpointEngineName() {
        return Optional.ofNullable(this.destinationEndpointEngineName);
    }

    /**
     * The region of destination instance. List of [supported regions](https://help.aliyun.com/document_detail/141033.html).
     * 
     */
    @Import(name="destinationEndpointRegion")
    private @Nullable Output<String> destinationEndpointRegion;

    /**
     * @return The region of destination instance. List of [supported regions](https://help.aliyun.com/document_detail/141033.html).
     * 
     */
    public Optional<Output<String>> destinationEndpointRegion() {
        return Optional.ofNullable(this.destinationEndpointRegion);
    }

    /**
     * The instance class. Valid values: `large`, `medium`, `micro`, `small`, `xlarge`, `xxlarge`. You can only upgrade the configuration, not downgrade the configuration. If you downgrade the instance, you need to [submit a ticket](https://selfservice.console.aliyun.com/ticket/category/dts/today).
     * 
     */
    @Import(name="instanceClass")
    private @Nullable Output<String> instanceClass;

    /**
     * @return The instance class. Valid values: `large`, `medium`, `micro`, `small`, `xlarge`, `xxlarge`. You can only upgrade the configuration, not downgrade the configuration. If you downgrade the instance, you need to [submit a ticket](https://selfservice.console.aliyun.com/ticket/category/dts/today).
     * 
     */
    public Optional<Output<String>> instanceClass() {
        return Optional.ofNullable(this.instanceClass);
    }

    /**
     * The duration of prepaid instance purchase. this parameter is required When `payment_type` equals `Subscription`.
     * 
     */
    @Import(name="paymentDuration")
    private @Nullable Output<Integer> paymentDuration;

    /**
     * @return The duration of prepaid instance purchase. this parameter is required When `payment_type` equals `Subscription`.
     * 
     */
    public Optional<Output<Integer>> paymentDuration() {
        return Optional.ofNullable(this.paymentDuration);
    }

    /**
     * The payment duration unit. Valid values: `Month`, `Year`. When `payment_type` is `Subscription`, this parameter is valid and must be passed in.
     * 
     */
    @Import(name="paymentDurationUnit")
    private @Nullable Output<String> paymentDurationUnit;

    /**
     * @return The payment duration unit. Valid values: `Month`, `Year`. When `payment_type` is `Subscription`, this parameter is valid and must be passed in.
     * 
     */
    public Optional<Output<String>> paymentDurationUnit() {
        return Optional.ofNullable(this.paymentDurationUnit);
    }

    /**
     * The payment type of the resource. Valid values: `Subscription`, `PayAsYouGo`.
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return The payment type of the resource. Valid values: `Subscription`, `PayAsYouGo`.
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The number of instances purchased.
     * 
     */
    @Import(name="quantity")
    private @Nullable Output<Integer> quantity;

    /**
     * @return The number of instances purchased.
     * 
     */
    public Optional<Output<Integer>> quantity() {
        return Optional.ofNullable(this.quantity);
    }

    /**
     * The type of source endpoint engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardb_o`, `polardb_pg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
     * 
     */
    @Import(name="sourceEndpointEngineName")
    private @Nullable Output<String> sourceEndpointEngineName;

    /**
     * @return The type of source endpoint engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardb_o`, `polardb_pg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
     * 
     */
    public Optional<Output<String>> sourceEndpointEngineName() {
        return Optional.ofNullable(this.sourceEndpointEngineName);
    }

    /**
     * The region of source instance.
     * 
     */
    @Import(name="sourceEndpointRegion")
    private @Nullable Output<String> sourceEndpointRegion;

    /**
     * @return The region of source instance.
     * 
     */
    public Optional<Output<String>> sourceEndpointRegion() {
        return Optional.ofNullable(this.sourceEndpointRegion);
    }

    /**
     * The status.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The sync architecture. Valid values: `oneway`, `bidirectional`.
     * 
     */
    @Import(name="syncArchitecture")
    private @Nullable Output<String> syncArchitecture;

    /**
     * @return The sync architecture. Valid values: `oneway`, `bidirectional`.
     * 
     */
    public Optional<Output<String>> syncArchitecture() {
        return Optional.ofNullable(this.syncArchitecture);
    }

    private SynchronizationInstanceState() {}

    private SynchronizationInstanceState(SynchronizationInstanceState $) {
        this.autoPay = $.autoPay;
        this.autoStart = $.autoStart;
        this.computeUnit = $.computeUnit;
        this.databaseCount = $.databaseCount;
        this.destinationEndpointEngineName = $.destinationEndpointEngineName;
        this.destinationEndpointRegion = $.destinationEndpointRegion;
        this.instanceClass = $.instanceClass;
        this.paymentDuration = $.paymentDuration;
        this.paymentDurationUnit = $.paymentDurationUnit;
        this.paymentType = $.paymentType;
        this.quantity = $.quantity;
        this.sourceEndpointEngineName = $.sourceEndpointEngineName;
        this.sourceEndpointRegion = $.sourceEndpointRegion;
        this.status = $.status;
        this.syncArchitecture = $.syncArchitecture;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SynchronizationInstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SynchronizationInstanceState $;

        public Builder() {
            $ = new SynchronizationInstanceState();
        }

        public Builder(SynchronizationInstanceState defaults) {
            $ = new SynchronizationInstanceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoPay Whether to automatically renew when it expires. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoPay(@Nullable Output<String> autoPay) {
            $.autoPay = autoPay;
            return this;
        }

        /**
         * @param autoPay Whether to automatically renew when it expires. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoPay(String autoPay) {
            return autoPay(Output.of(autoPay));
        }

        /**
         * @param autoStart Whether to automatically start the task after the purchase completed. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoStart(@Nullable Output<String> autoStart) {
            $.autoStart = autoStart;
            return this;
        }

        /**
         * @param autoStart Whether to automatically start the task after the purchase completed. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoStart(String autoStart) {
            return autoStart(Output.of(autoStart));
        }

        /**
         * @param computeUnit [ETL specifications](https://help.aliyun.com/document_detail/212324.html). The unit is the computing unit ComputeUnit (CU), 1CU=1vCPU+4 GB memory. The value range is an integer greater than or equal to 2.
         * 
         * @return builder
         * 
         */
        public Builder computeUnit(@Nullable Output<Integer> computeUnit) {
            $.computeUnit = computeUnit;
            return this;
        }

        /**
         * @param computeUnit [ETL specifications](https://help.aliyun.com/document_detail/212324.html). The unit is the computing unit ComputeUnit (CU), 1CU=1vCPU+4 GB memory. The value range is an integer greater than or equal to 2.
         * 
         * @return builder
         * 
         */
        public Builder computeUnit(Integer computeUnit) {
            return computeUnit(Output.of(computeUnit));
        }

        /**
         * @param databaseCount The number of private customized RDS instances under PolarDB-X. The default value is 1. This parameter needs to be passed only when `source_endpoint_engine_name` equals `drds`.
         * 
         * @return builder
         * 
         */
        public Builder databaseCount(@Nullable Output<Integer> databaseCount) {
            $.databaseCount = databaseCount;
            return this;
        }

        /**
         * @param databaseCount The number of private customized RDS instances under PolarDB-X. The default value is 1. This parameter needs to be passed only when `source_endpoint_engine_name` equals `drds`.
         * 
         * @return builder
         * 
         */
        public Builder databaseCount(Integer databaseCount) {
            return databaseCount(Output.of(databaseCount));
        }

        /**
         * @param destinationEndpointEngineName The type of destination engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardb_o`, `polardb_pg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
         * 
         * @return builder
         * 
         */
        public Builder destinationEndpointEngineName(@Nullable Output<String> destinationEndpointEngineName) {
            $.destinationEndpointEngineName = destinationEndpointEngineName;
            return this;
        }

        /**
         * @param destinationEndpointEngineName The type of destination engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardb_o`, `polardb_pg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
         * 
         * @return builder
         * 
         */
        public Builder destinationEndpointEngineName(String destinationEndpointEngineName) {
            return destinationEndpointEngineName(Output.of(destinationEndpointEngineName));
        }

        /**
         * @param destinationEndpointRegion The region of destination instance. List of [supported regions](https://help.aliyun.com/document_detail/141033.html).
         * 
         * @return builder
         * 
         */
        public Builder destinationEndpointRegion(@Nullable Output<String> destinationEndpointRegion) {
            $.destinationEndpointRegion = destinationEndpointRegion;
            return this;
        }

        /**
         * @param destinationEndpointRegion The region of destination instance. List of [supported regions](https://help.aliyun.com/document_detail/141033.html).
         * 
         * @return builder
         * 
         */
        public Builder destinationEndpointRegion(String destinationEndpointRegion) {
            return destinationEndpointRegion(Output.of(destinationEndpointRegion));
        }

        /**
         * @param instanceClass The instance class. Valid values: `large`, `medium`, `micro`, `small`, `xlarge`, `xxlarge`. You can only upgrade the configuration, not downgrade the configuration. If you downgrade the instance, you need to [submit a ticket](https://selfservice.console.aliyun.com/ticket/category/dts/today).
         * 
         * @return builder
         * 
         */
        public Builder instanceClass(@Nullable Output<String> instanceClass) {
            $.instanceClass = instanceClass;
            return this;
        }

        /**
         * @param instanceClass The instance class. Valid values: `large`, `medium`, `micro`, `small`, `xlarge`, `xxlarge`. You can only upgrade the configuration, not downgrade the configuration. If you downgrade the instance, you need to [submit a ticket](https://selfservice.console.aliyun.com/ticket/category/dts/today).
         * 
         * @return builder
         * 
         */
        public Builder instanceClass(String instanceClass) {
            return instanceClass(Output.of(instanceClass));
        }

        /**
         * @param paymentDuration The duration of prepaid instance purchase. this parameter is required When `payment_type` equals `Subscription`.
         * 
         * @return builder
         * 
         */
        public Builder paymentDuration(@Nullable Output<Integer> paymentDuration) {
            $.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * @param paymentDuration The duration of prepaid instance purchase. this parameter is required When `payment_type` equals `Subscription`.
         * 
         * @return builder
         * 
         */
        public Builder paymentDuration(Integer paymentDuration) {
            return paymentDuration(Output.of(paymentDuration));
        }

        /**
         * @param paymentDurationUnit The payment duration unit. Valid values: `Month`, `Year`. When `payment_type` is `Subscription`, this parameter is valid and must be passed in.
         * 
         * @return builder
         * 
         */
        public Builder paymentDurationUnit(@Nullable Output<String> paymentDurationUnit) {
            $.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * @param paymentDurationUnit The payment duration unit. Valid values: `Month`, `Year`. When `payment_type` is `Subscription`, this parameter is valid and must be passed in.
         * 
         * @return builder
         * 
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            return paymentDurationUnit(Output.of(paymentDurationUnit));
        }

        /**
         * @param paymentType The payment type of the resource. Valid values: `Subscription`, `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The payment type of the resource. Valid values: `Subscription`, `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param quantity The number of instances purchased.
         * 
         * @return builder
         * 
         */
        public Builder quantity(@Nullable Output<Integer> quantity) {
            $.quantity = quantity;
            return this;
        }

        /**
         * @param quantity The number of instances purchased.
         * 
         * @return builder
         * 
         */
        public Builder quantity(Integer quantity) {
            return quantity(Output.of(quantity));
        }

        /**
         * @param sourceEndpointEngineName The type of source endpoint engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardb_o`, `polardb_pg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
         * 
         * @return builder
         * 
         */
        public Builder sourceEndpointEngineName(@Nullable Output<String> sourceEndpointEngineName) {
            $.sourceEndpointEngineName = sourceEndpointEngineName;
            return this;
        }

        /**
         * @param sourceEndpointEngineName The type of source endpoint engine. Valid values: `ADS`, `DB2`, `DRDS`, `DataHub`, `Greenplum`, `MSSQL`, `MySQL`, `PolarDB`, `PostgreSQL`, `Redis`, `Tablestore`, `as400`, `clickhouse`, `kafka`, `mongodb`, `odps`, `oracle`, `polardb_o`, `polardb_pg`, `tidb`. For the correspondence between the supported source and target libraries, see [Supported Databases, Synchronization Initialization Types and Synchronization Topologies](https://help.aliyun.com/document_detail/130744.html), [Supported Databases and Migration Types](https://help.aliyun.com/document_detail/26618.html).
         * 
         * @return builder
         * 
         */
        public Builder sourceEndpointEngineName(String sourceEndpointEngineName) {
            return sourceEndpointEngineName(Output.of(sourceEndpointEngineName));
        }

        /**
         * @param sourceEndpointRegion The region of source instance.
         * 
         * @return builder
         * 
         */
        public Builder sourceEndpointRegion(@Nullable Output<String> sourceEndpointRegion) {
            $.sourceEndpointRegion = sourceEndpointRegion;
            return this;
        }

        /**
         * @param sourceEndpointRegion The region of source instance.
         * 
         * @return builder
         * 
         */
        public Builder sourceEndpointRegion(String sourceEndpointRegion) {
            return sourceEndpointRegion(Output.of(sourceEndpointRegion));
        }

        /**
         * @param status The status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param syncArchitecture The sync architecture. Valid values: `oneway`, `bidirectional`.
         * 
         * @return builder
         * 
         */
        public Builder syncArchitecture(@Nullable Output<String> syncArchitecture) {
            $.syncArchitecture = syncArchitecture;
            return this;
        }

        /**
         * @param syncArchitecture The sync architecture. Valid values: `oneway`, `bidirectional`.
         * 
         * @return builder
         * 
         */
        public Builder syncArchitecture(String syncArchitecture) {
            return syncArchitecture(Output.of(syncArchitecture));
        }

        public SynchronizationInstanceState build() {
            return $;
        }
    }

}