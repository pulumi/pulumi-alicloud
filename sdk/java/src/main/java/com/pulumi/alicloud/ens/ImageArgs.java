// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageArgs Empty = new ImageArgs();

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
    @Import(name="imageName", required=true)
    private Output<String> imageName;

    /**
     * @return Image Name.
     * 
     */
    public Output<String> imageName() {
        return this.imageName;
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

    private ImageArgs() {}

    private ImageArgs(ImageArgs $) {
        this.deleteAfterImageUpload = $.deleteAfterImageUpload;
        this.imageName = $.imageName;
        this.instanceId = $.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageArgs $;

        public Builder() {
            $ = new ImageArgs();
        }

        public Builder(ImageArgs defaults) {
            $ = new ImageArgs(Objects.requireNonNull(defaults));
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
        public Builder imageName(Output<String> imageName) {
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

        public ImageArgs build() {
            if ($.imageName == null) {
                throw new MissingRequiredPropertyException("ImageArgs", "imageName");
            }
            return $;
        }
    }

}
