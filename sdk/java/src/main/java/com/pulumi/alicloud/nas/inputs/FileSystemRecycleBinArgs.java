// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileSystemRecycleBinArgs extends com.pulumi.resources.ResourceArgs {

    public static final FileSystemRecycleBinArgs Empty = new FileSystemRecycleBinArgs();

    /**
     * The time at which the recycle bin was enabled.
     * 
     */
    @Import(name="enableTime")
    private @Nullable Output<String> enableTime;

    /**
     * @return The time at which the recycle bin was enabled.
     * 
     */
    public Optional<Output<String>> enableTime() {
        return Optional.ofNullable(this.enableTime);
    }

    /**
     * The retention period of the files in the recycle bin. Unit: days. Default value: `3`. Valid values: `1` to `180`. **NOTE:** `reserved_days` takes effect only if `status` is set to `Enable`.
     * 
     */
    @Import(name="reservedDays")
    private @Nullable Output<Integer> reservedDays;

    /**
     * @return The retention period of the files in the recycle bin. Unit: days. Default value: `3`. Valid values: `1` to `180`. **NOTE:** `reserved_days` takes effect only if `status` is set to `Enable`.
     * 
     */
    public Optional<Output<Integer>> reservedDays() {
        return Optional.ofNullable(this.reservedDays);
    }

    /**
     * The size of the Infrequent Access (IA) data that is dumped to the recycle bin.
     * 
     */
    @Import(name="secondarySize")
    private @Nullable Output<Integer> secondarySize;

    /**
     * @return The size of the Infrequent Access (IA) data that is dumped to the recycle bin.
     * 
     */
    public Optional<Output<Integer>> secondarySize() {
        return Optional.ofNullable(this.secondarySize);
    }

    /**
     * The size of the files that are dumped to the recycle bin.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @return The size of the files that are dumped to the recycle bin.
     * 
     */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    /**
     * Specifies whether to enable the recycle bin feature. Default value: `Disable`. Valid values: `Enable`, `Disable`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Specifies whether to enable the recycle bin feature. Default value: `Disable`. Valid values: `Enable`, `Disable`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private FileSystemRecycleBinArgs() {}

    private FileSystemRecycleBinArgs(FileSystemRecycleBinArgs $) {
        this.enableTime = $.enableTime;
        this.reservedDays = $.reservedDays;
        this.secondarySize = $.secondarySize;
        this.size = $.size;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileSystemRecycleBinArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileSystemRecycleBinArgs $;

        public Builder() {
            $ = new FileSystemRecycleBinArgs();
        }

        public Builder(FileSystemRecycleBinArgs defaults) {
            $ = new FileSystemRecycleBinArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableTime The time at which the recycle bin was enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableTime(@Nullable Output<String> enableTime) {
            $.enableTime = enableTime;
            return this;
        }

        /**
         * @param enableTime The time at which the recycle bin was enabled.
         * 
         * @return builder
         * 
         */
        public Builder enableTime(String enableTime) {
            return enableTime(Output.of(enableTime));
        }

        /**
         * @param reservedDays The retention period of the files in the recycle bin. Unit: days. Default value: `3`. Valid values: `1` to `180`. **NOTE:** `reserved_days` takes effect only if `status` is set to `Enable`.
         * 
         * @return builder
         * 
         */
        public Builder reservedDays(@Nullable Output<Integer> reservedDays) {
            $.reservedDays = reservedDays;
            return this;
        }

        /**
         * @param reservedDays The retention period of the files in the recycle bin. Unit: days. Default value: `3`. Valid values: `1` to `180`. **NOTE:** `reserved_days` takes effect only if `status` is set to `Enable`.
         * 
         * @return builder
         * 
         */
        public Builder reservedDays(Integer reservedDays) {
            return reservedDays(Output.of(reservedDays));
        }

        /**
         * @param secondarySize The size of the Infrequent Access (IA) data that is dumped to the recycle bin.
         * 
         * @return builder
         * 
         */
        public Builder secondarySize(@Nullable Output<Integer> secondarySize) {
            $.secondarySize = secondarySize;
            return this;
        }

        /**
         * @param secondarySize The size of the Infrequent Access (IA) data that is dumped to the recycle bin.
         * 
         * @return builder
         * 
         */
        public Builder secondarySize(Integer secondarySize) {
            return secondarySize(Output.of(secondarySize));
        }

        /**
         * @param size The size of the files that are dumped to the recycle bin.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the files that are dumped to the recycle bin.
         * 
         * @return builder
         * 
         */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        /**
         * @param status Specifies whether to enable the recycle bin feature. Default value: `Disable`. Valid values: `Enable`, `Disable`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Specifies whether to enable the recycle bin feature. Default value: `Disable`. Valid values: `Enable`, `Disable`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public FileSystemRecycleBinArgs build() {
            return $;
        }
    }

}