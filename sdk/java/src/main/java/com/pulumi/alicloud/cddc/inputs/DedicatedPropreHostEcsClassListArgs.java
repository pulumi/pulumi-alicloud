// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cddc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DedicatedPropreHostEcsClassListArgs extends com.pulumi.resources.ResourceArgs {

    public static final DedicatedPropreHostEcsClassListArgs Empty = new DedicatedPropreHostEcsClassListArgs();

    /**
     * Data disk PL level.
     * 
     */
    @Import(name="dataDiskPerformanceLevel")
    private @Nullable Output<String> dataDiskPerformanceLevel;

    /**
     * @return Data disk PL level.
     * 
     */
    public Optional<Output<String>> dataDiskPerformanceLevel() {
        return Optional.ofNullable(this.dataDiskPerformanceLevel);
    }

    /**
     * The capacity of the data disk.
     * 
     */
    @Import(name="diskCapacity")
    private @Nullable Output<Integer> diskCapacity;

    /**
     * @return The capacity of the data disk.
     * 
     */
    public Optional<Output<Integer>> diskCapacity() {
        return Optional.ofNullable(this.diskCapacity);
    }

    /**
     * Number of mounted data disks.
     * 
     */
    @Import(name="diskCount")
    private @Nullable Output<Integer> diskCount;

    /**
     * @return Number of mounted data disks.
     * 
     */
    public Optional<Output<Integer>> diskCount() {
        return Optional.ofNullable(this.diskCount);
    }

    /**
     * Data disk type, value range:
     * - **cloud_essd**: the ESSD cloud disk.
     * - **cloud_ssd**: SSD cloud disk.
     * - **cloud_efficiency**: The ultra cloud disk.
     * - **cloud_auto**: ESSD AutoPL cloud disk.
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<String> diskType;

    /**
     * @return Data disk type, value range:
     * - **cloud_essd**: the ESSD cloud disk.
     * - **cloud_ssd**: SSD cloud disk.
     * - **cloud_efficiency**: The ultra cloud disk.
     * - **cloud_auto**: ESSD AutoPL cloud disk.
     * 
     */
    public Optional<Output<String>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * ECS specifications.
     * 
     */
    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    /**
     * @return ECS specifications.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }

    /**
     * System disk capacity.
     * 
     */
    @Import(name="sysDiskCapacity", required=true)
    private Output<Integer> sysDiskCapacity;

    /**
     * @return System disk capacity.
     * 
     */
    public Output<Integer> sysDiskCapacity() {
        return this.sysDiskCapacity;
    }

    /**
     * System disk type, value:
     * - **cloud_essd**: the ESSD cloud disk.
     * - **cloud_ssd**: SSD cloud disk.
     * - **cloud_efficiency**: The ultra cloud disk.
     * - **cloud_auto**: ESSD AutoPL cloud disk.
     * 
     */
    @Import(name="sysDiskType", required=true)
    private Output<String> sysDiskType;

    /**
     * @return System disk type, value:
     * - **cloud_essd**: the ESSD cloud disk.
     * - **cloud_ssd**: SSD cloud disk.
     * - **cloud_efficiency**: The ultra cloud disk.
     * - **cloud_auto**: ESSD AutoPL cloud disk.
     * 
     */
    public Output<String> sysDiskType() {
        return this.sysDiskType;
    }

    /**
     * System disk PL level.
     * 
     */
    @Import(name="systemDiskPerformanceLevel")
    private @Nullable Output<String> systemDiskPerformanceLevel;

    /**
     * @return System disk PL level.
     * 
     */
    public Optional<Output<String>> systemDiskPerformanceLevel() {
        return Optional.ofNullable(this.systemDiskPerformanceLevel);
    }

    private DedicatedPropreHostEcsClassListArgs() {}

    private DedicatedPropreHostEcsClassListArgs(DedicatedPropreHostEcsClassListArgs $) {
        this.dataDiskPerformanceLevel = $.dataDiskPerformanceLevel;
        this.diskCapacity = $.diskCapacity;
        this.diskCount = $.diskCount;
        this.diskType = $.diskType;
        this.instanceType = $.instanceType;
        this.sysDiskCapacity = $.sysDiskCapacity;
        this.sysDiskType = $.sysDiskType;
        this.systemDiskPerformanceLevel = $.systemDiskPerformanceLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DedicatedPropreHostEcsClassListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DedicatedPropreHostEcsClassListArgs $;

        public Builder() {
            $ = new DedicatedPropreHostEcsClassListArgs();
        }

        public Builder(DedicatedPropreHostEcsClassListArgs defaults) {
            $ = new DedicatedPropreHostEcsClassListArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataDiskPerformanceLevel Data disk PL level.
         * 
         * @return builder
         * 
         */
        public Builder dataDiskPerformanceLevel(@Nullable Output<String> dataDiskPerformanceLevel) {
            $.dataDiskPerformanceLevel = dataDiskPerformanceLevel;
            return this;
        }

        /**
         * @param dataDiskPerformanceLevel Data disk PL level.
         * 
         * @return builder
         * 
         */
        public Builder dataDiskPerformanceLevel(String dataDiskPerformanceLevel) {
            return dataDiskPerformanceLevel(Output.of(dataDiskPerformanceLevel));
        }

        /**
         * @param diskCapacity The capacity of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder diskCapacity(@Nullable Output<Integer> diskCapacity) {
            $.diskCapacity = diskCapacity;
            return this;
        }

        /**
         * @param diskCapacity The capacity of the data disk.
         * 
         * @return builder
         * 
         */
        public Builder diskCapacity(Integer diskCapacity) {
            return diskCapacity(Output.of(diskCapacity));
        }

        /**
         * @param diskCount Number of mounted data disks.
         * 
         * @return builder
         * 
         */
        public Builder diskCount(@Nullable Output<Integer> diskCount) {
            $.diskCount = diskCount;
            return this;
        }

        /**
         * @param diskCount Number of mounted data disks.
         * 
         * @return builder
         * 
         */
        public Builder diskCount(Integer diskCount) {
            return diskCount(Output.of(diskCount));
        }

        /**
         * @param diskType Data disk type, value range:
         * - **cloud_essd**: the ESSD cloud disk.
         * - **cloud_ssd**: SSD cloud disk.
         * - **cloud_efficiency**: The ultra cloud disk.
         * - **cloud_auto**: ESSD AutoPL cloud disk.
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<String> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType Data disk type, value range:
         * - **cloud_essd**: the ESSD cloud disk.
         * - **cloud_ssd**: SSD cloud disk.
         * - **cloud_efficiency**: The ultra cloud disk.
         * - **cloud_auto**: ESSD AutoPL cloud disk.
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            return diskType(Output.of(diskType));
        }

        /**
         * @param instanceType ECS specifications.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType ECS specifications.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param sysDiskCapacity System disk capacity.
         * 
         * @return builder
         * 
         */
        public Builder sysDiskCapacity(Output<Integer> sysDiskCapacity) {
            $.sysDiskCapacity = sysDiskCapacity;
            return this;
        }

        /**
         * @param sysDiskCapacity System disk capacity.
         * 
         * @return builder
         * 
         */
        public Builder sysDiskCapacity(Integer sysDiskCapacity) {
            return sysDiskCapacity(Output.of(sysDiskCapacity));
        }

        /**
         * @param sysDiskType System disk type, value:
         * - **cloud_essd**: the ESSD cloud disk.
         * - **cloud_ssd**: SSD cloud disk.
         * - **cloud_efficiency**: The ultra cloud disk.
         * - **cloud_auto**: ESSD AutoPL cloud disk.
         * 
         * @return builder
         * 
         */
        public Builder sysDiskType(Output<String> sysDiskType) {
            $.sysDiskType = sysDiskType;
            return this;
        }

        /**
         * @param sysDiskType System disk type, value:
         * - **cloud_essd**: the ESSD cloud disk.
         * - **cloud_ssd**: SSD cloud disk.
         * - **cloud_efficiency**: The ultra cloud disk.
         * - **cloud_auto**: ESSD AutoPL cloud disk.
         * 
         * @return builder
         * 
         */
        public Builder sysDiskType(String sysDiskType) {
            return sysDiskType(Output.of(sysDiskType));
        }

        /**
         * @param systemDiskPerformanceLevel System disk PL level.
         * 
         * @return builder
         * 
         */
        public Builder systemDiskPerformanceLevel(@Nullable Output<String> systemDiskPerformanceLevel) {
            $.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
            return this;
        }

        /**
         * @param systemDiskPerformanceLevel System disk PL level.
         * 
         * @return builder
         * 
         */
        public Builder systemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
            return systemDiskPerformanceLevel(Output.of(systemDiskPerformanceLevel));
        }

        public DedicatedPropreHostEcsClassListArgs build() {
            if ($.instanceType == null) {
                throw new MissingRequiredPropertyException("DedicatedPropreHostEcsClassListArgs", "instanceType");
            }
            if ($.sysDiskCapacity == null) {
                throw new MissingRequiredPropertyException("DedicatedPropreHostEcsClassListArgs", "sysDiskCapacity");
            }
            if ($.sysDiskType == null) {
                throw new MissingRequiredPropertyException("DedicatedPropreHostEcsClassListArgs", "sysDiskType");
            }
            return $;
        }
    }

}
