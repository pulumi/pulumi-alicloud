// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageSharePermissionState extends com.pulumi.resources.ResourceArgs {

    public static final ImageSharePermissionState Empty = new ImageSharePermissionState();

    /**
     * Alibaba Cloud Account ID. It is used to share images.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Alibaba Cloud Account ID. It is used to share images.
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The source image ID.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return The source image ID.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    private ImageSharePermissionState() {}

    private ImageSharePermissionState(ImageSharePermissionState $) {
        this.accountId = $.accountId;
        this.imageId = $.imageId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageSharePermissionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageSharePermissionState $;

        public Builder() {
            $ = new ImageSharePermissionState();
        }

        public Builder(ImageSharePermissionState defaults) {
            $ = new ImageSharePermissionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Alibaba Cloud Account ID. It is used to share images.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Alibaba Cloud Account ID. It is used to share images.
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param imageId The source image ID.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The source image ID.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        public ImageSharePermissionState build() {
            return $;
        }
    }

}
