// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StorageCapacityUnitState extends com.pulumi.resources.ResourceArgs {

    public static final StorageCapacityUnitState Empty = new StorageCapacityUnitState();

    /**
     * The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    /**
     * @return The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
     * 
     */
    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The validity period of the Storage Capacity Unit. Default value: `1`.
     * * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
     * * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return The validity period of the Storage Capacity Unit. Default value: `1`.
     * * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
     * * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
     * 
     */
    @Import(name="periodUnit")
    private @Nullable Output<String> periodUnit;

    /**
     * @return The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
     * 
     */
    public Optional<Output<String>> periodUnit() {
        return Optional.ofNullable(this.periodUnit);
    }

    /**
     * The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * The status of Storage Capacity Unit.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of Storage Capacity Unit.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The name of the Storage Capacity Unit.
     * 
     */
    @Import(name="storageCapacityUnitName")
    private @Nullable Output<String> storageCapacityUnitName;

    /**
     * @return The name of the Storage Capacity Unit.
     * 
     */
    public Optional<Output<String>> storageCapacityUnitName() {
        return Optional.ofNullable(this.storageCapacityUnitName);
    }

    private StorageCapacityUnitState() {}

    private StorageCapacityUnitState(StorageCapacityUnitState $) {
        this.capacity = $.capacity;
        this.description = $.description;
        this.period = $.period;
        this.periodUnit = $.periodUnit;
        this.startTime = $.startTime;
        this.status = $.status;
        this.storageCapacityUnitName = $.storageCapacityUnitName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageCapacityUnitState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageCapacityUnitState $;

        public Builder() {
            $ = new StorageCapacityUnitState();
        }

        public Builder(StorageCapacityUnitState defaults) {
            $ = new StorageCapacityUnitState(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacity The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
         * 
         * @return builder
         * 
         */
        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        /**
         * @param capacity The capacity of the Storage Capacity Unit. Unit: GiB. Valid values: `20`, `40`, `100`, `200`, `500`, `1024`, `2048`, `5120`, `10240`, `20480`, and `51200`.
         * 
         * @return builder
         * 
         */
        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        /**
         * @param description The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Storage Capacity Unit. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param period The validity period of the Storage Capacity Unit. Default value: `1`.
         * * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
         * * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The validity period of the Storage Capacity Unit. Default value: `1`.
         * * When PeriodUnit is set to Month, Valid values: `1`, `2`, `3`, `6`.
         * * When PeriodUnit is set to Year, Valid values: `1`, `3`, `5`.
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param periodUnit The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
         * 
         * @return builder
         * 
         */
        public Builder periodUnit(@Nullable Output<String> periodUnit) {
            $.periodUnit = periodUnit;
            return this;
        }

        /**
         * @param periodUnit The unit of the validity period of the Storage Capacity Unit. Default value: `Month`. Valid values: `Month`, `Year`.
         * 
         * @return builder
         * 
         */
        public Builder periodUnit(String periodUnit) {
            return periodUnit(Output.of(periodUnit));
        }

        /**
         * @param startTime The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The time when the Storage Capacity Unit takes effect. It cannot be earlier than or more than six months later than the time when the Storage Capacity Unit is created. Specify the time in the ISO 8601 standard in the `yyyy-MM-ddTHH:mm:ssZ` format. The time must be in UTC. **NOTE:** This parameter is empty by default. The Storage Capacity Unit immediately takes effect after it is created.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param status The status of Storage Capacity Unit.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of Storage Capacity Unit.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param storageCapacityUnitName The name of the Storage Capacity Unit.
         * 
         * @return builder
         * 
         */
        public Builder storageCapacityUnitName(@Nullable Output<String> storageCapacityUnitName) {
            $.storageCapacityUnitName = storageCapacityUnitName;
            return this;
        }

        /**
         * @param storageCapacityUnitName The name of the Storage Capacity Unit.
         * 
         * @return builder
         * 
         */
        public Builder storageCapacityUnitName(String storageCapacityUnitName) {
            return storageCapacityUnitName(Output.of(storageCapacityUnitName));
        }

        public StorageCapacityUnitState build() {
            return $;
        }
    }

}
