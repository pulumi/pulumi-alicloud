// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketStyleState extends com.pulumi.resources.ResourceArgs {

    public static final BucketStyleState Empty = new BucketStyleState();

    /**
     * Storage space to which the picture style belongs
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return Storage space to which the picture style belongs
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Style category, valid values: image, document, video.
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return Style category, valid values: image, document, video.
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * The Image style content can contain single or multiple image processing parameters.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The Image style content can contain single or multiple image processing parameters.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * Image Style Creation Time
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Image Style Creation Time
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Image Style Name
     * 
     */
    @Import(name="styleName")
    private @Nullable Output<String> styleName;

    /**
     * @return Image Style Name
     * 
     */
    public Optional<Output<String>> styleName() {
        return Optional.ofNullable(this.styleName);
    }

    private BucketStyleState() {}

    private BucketStyleState(BucketStyleState $) {
        this.bucket = $.bucket;
        this.category = $.category;
        this.content = $.content;
        this.createTime = $.createTime;
        this.styleName = $.styleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketStyleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketStyleState $;

        public Builder() {
            $ = new BucketStyleState();
        }

        public Builder(BucketStyleState defaults) {
            $ = new BucketStyleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Storage space to which the picture style belongs
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Storage space to which the picture style belongs
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param category Style category, valid values: image, document, video.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category Style category, valid values: image, document, video.
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param content The Image style content can contain single or multiple image processing parameters.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The Image style content can contain single or multiple image processing parameters.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param createTime Image Style Creation Time
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Image Style Creation Time
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param styleName Image Style Name
         * 
         * @return builder
         * 
         */
        public Builder styleName(@Nullable Output<String> styleName) {
            $.styleName = styleName;
            return this;
        }

        /**
         * @param styleName Image Style Name
         * 
         * @return builder
         * 
         */
        public Builder styleName(String styleName) {
            return styleName(Output.of(styleName));
        }

        public BucketStyleState build() {
            return $;
        }
    }

}
