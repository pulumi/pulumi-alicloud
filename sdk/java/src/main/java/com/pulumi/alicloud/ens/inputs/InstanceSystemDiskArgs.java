// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceSystemDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceSystemDiskArgs Empty = new InstanceSystemDiskArgs();

    /**
     * System disk type. Optional values:
     * - cloud_efficiency: Ultra cloud disk
     * - cloud_ssd: Full Flash cloud disk
     * - local_hdd: local hdd disk
     * - local_ssd: local disk ssd.
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return System disk type. Optional values:
     * - cloud_efficiency: Ultra cloud disk
     * - cloud_ssd: Full Flash cloud disk
     * - local_hdd: local hdd disk
     * - local_ssd: local disk ssd.
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * System disk size, unit: GB.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return System disk size, unit: GB.
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    private InstanceSystemDiskArgs() {}

    private InstanceSystemDiskArgs(InstanceSystemDiskArgs $) {
        this.category = $.category;
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceSystemDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceSystemDiskArgs $;

        public Builder() {
            $ = new InstanceSystemDiskArgs();
        }

        public Builder(InstanceSystemDiskArgs defaults) {
            $ = new InstanceSystemDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category System disk type. Optional values:
         * - cloud_efficiency: Ultra cloud disk
         * - cloud_ssd: Full Flash cloud disk
         * - local_hdd: local hdd disk
         * - local_ssd: local disk ssd.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category System disk type. Optional values:
         * - cloud_efficiency: Ultra cloud disk
         * - cloud_ssd: Full Flash cloud disk
         * - local_hdd: local hdd disk
         * - local_ssd: local disk ssd.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param size System disk size, unit: GB.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size System disk size, unit: GB.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        public InstanceSystemDiskArgs build() {
            return $;
        }
    }

}