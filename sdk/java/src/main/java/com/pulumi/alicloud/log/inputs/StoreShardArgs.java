// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StoreShardArgs extends com.pulumi.resources.ResourceArgs {

    public static final StoreShardArgs Empty = new StoreShardArgs();

    /**
     * The begin value of the shard range(MD5), included in the shard range.
     * 
     */
    @Import(name="beginKey")
    private @Nullable Output<String> beginKey;

    /**
     * @return The begin value of the shard range(MD5), included in the shard range.
     * 
     */
    public Optional<Output<String>> beginKey() {
        return Optional.ofNullable(this.beginKey);
    }

    /**
     * The end value of the shard range(MD5), not included in shard range.
     * 
     */
    @Import(name="endKey")
    private @Nullable Output<String> endKey;

    /**
     * @return The end value of the shard range(MD5), not included in shard range.
     * 
     */
    public Optional<Output<String>> endKey() {
        return Optional.ofNullable(this.endKey);
    }

    /**
     * The ID of the shard.
     * 
     */
    @Import(name="id")
    private @Nullable Output<Integer> id;

    /**
     * @return The ID of the shard.
     * 
     */
    public Optional<Output<Integer>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Shard status, only two status of `readwrite` and `readonly`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Shard status, only two status of `readwrite` and `readonly`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private StoreShardArgs() {}

    private StoreShardArgs(StoreShardArgs $) {
        this.beginKey = $.beginKey;
        this.endKey = $.endKey;
        this.id = $.id;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StoreShardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StoreShardArgs $;

        public Builder() {
            $ = new StoreShardArgs();
        }

        public Builder(StoreShardArgs defaults) {
            $ = new StoreShardArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param beginKey The begin value of the shard range(MD5), included in the shard range.
         * 
         * @return builder
         * 
         */
        public Builder beginKey(@Nullable Output<String> beginKey) {
            $.beginKey = beginKey;
            return this;
        }

        /**
         * @param beginKey The begin value of the shard range(MD5), included in the shard range.
         * 
         * @return builder
         * 
         */
        public Builder beginKey(String beginKey) {
            return beginKey(Output.of(beginKey));
        }

        /**
         * @param endKey The end value of the shard range(MD5), not included in shard range.
         * 
         * @return builder
         * 
         */
        public Builder endKey(@Nullable Output<String> endKey) {
            $.endKey = endKey;
            return this;
        }

        /**
         * @param endKey The end value of the shard range(MD5), not included in shard range.
         * 
         * @return builder
         * 
         */
        public Builder endKey(String endKey) {
            return endKey(Output.of(endKey));
        }

        /**
         * @param id The ID of the shard.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the shard.
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        /**
         * @param status Shard status, only two status of `readwrite` and `readonly`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Shard status, only two status of `readwrite` and `readonly`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public StoreShardArgs build() {
            return $;
        }
    }

}
