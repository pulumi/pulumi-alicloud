// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageState extends com.pulumi.resources.ResourceArgs {

    public static final ImageState Empty = new ImageState();

    /**
     * Image creation time.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Image creation time.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Whether the instance is automatically released after the image is packaged and uploaded successfully, only the build machine is supported.  Optional values: true: When the instance is released, the image is released together with the instance. false: When the instance is released, the image is retained and is not released together with the instance. Empty means false by default.
     * 
     */
    @Import(name="deleteAfterImageUpload")
    private @Nullable Output<String> deleteAfterImageUpload;

    /**
     * @return Whether the instance is automatically released after the image is packaged and uploaded successfully, only the build machine is supported.  Optional values: true: When the instance is released, the image is released together with the instance. false: When the instance is released, the image is retained and is not released together with the instance. Empty means false by default.
     * 
     */
    public Optional<Output<String>> deleteAfterImageUpload() {
        return Optional.ofNullable(this.deleteAfterImageUpload);
    }

    /**
     * Image Name.
     * 
     */
    @Import(name="imageName")
    private @Nullable Output<String> imageName;

    /**
     * @return Image Name.
     * 
     */
    public Optional<Output<String>> imageName() {
        return Optional.ofNullable(this.imageName);
    }

    /**
     * The ID of the instance corresponding to the image.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The ID of the instance corresponding to the image.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * Mirror Status  Optional values: Creating: Creating Packing: Packing Uploading: Uploading Pack_failed: Packing failed Upload_failed: Upload failed Available: Only images in the Available state can be used and operated. Unavailable: Not available Copying: Copying.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Mirror Status  Optional values: Creating: Creating Packing: Packing Uploading: Uploading Pack_failed: Packing failed Upload_failed: Upload failed Available: Only images in the Available state can be used and operated. Unavailable: Not available Copying: Copying.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private ImageState() {}

    private ImageState(ImageState $) {
        this.createTime = $.createTime;
        this.deleteAfterImageUpload = $.deleteAfterImageUpload;
        this.imageName = $.imageName;
        this.instanceId = $.instanceId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageState $;

        public Builder() {
            $ = new ImageState();
        }

        public Builder(ImageState defaults) {
            $ = new ImageState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Image creation time.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Image creation time.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param deleteAfterImageUpload Whether the instance is automatically released after the image is packaged and uploaded successfully, only the build machine is supported.  Optional values: true: When the instance is released, the image is released together with the instance. false: When the instance is released, the image is retained and is not released together with the instance. Empty means false by default.
         * 
         * @return builder
         * 
         */
        public Builder deleteAfterImageUpload(@Nullable Output<String> deleteAfterImageUpload) {
            $.deleteAfterImageUpload = deleteAfterImageUpload;
            return this;
        }

        /**
         * @param deleteAfterImageUpload Whether the instance is automatically released after the image is packaged and uploaded successfully, only the build machine is supported.  Optional values: true: When the instance is released, the image is released together with the instance. false: When the instance is released, the image is retained and is not released together with the instance. Empty means false by default.
         * 
         * @return builder
         * 
         */
        public Builder deleteAfterImageUpload(String deleteAfterImageUpload) {
            return deleteAfterImageUpload(Output.of(deleteAfterImageUpload));
        }

        /**
         * @param imageName Image Name.
         * 
         * @return builder
         * 
         */
        public Builder imageName(@Nullable Output<String> imageName) {
            $.imageName = imageName;
            return this;
        }

        /**
         * @param imageName Image Name.
         * 
         * @return builder
         * 
         */
        public Builder imageName(String imageName) {
            return imageName(Output.of(imageName));
        }

        /**
         * @param instanceId The ID of the instance corresponding to the image.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the instance corresponding to the image.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param status Mirror Status  Optional values: Creating: Creating Packing: Packing Uploading: Uploading Pack_failed: Packing failed Upload_failed: Upload failed Available: Only images in the Available state can be used and operated. Unavailable: Not available Copying: Copying.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Mirror Status  Optional values: Creating: Creating Packing: Packing Uploading: Uploading Pack_failed: Packing failed Upload_failed: Upload failed Available: Only images in the Available state can be used and operated. Unavailable: Not available Copying: Copying.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public ImageState build() {
            return $;
        }
    }

}
