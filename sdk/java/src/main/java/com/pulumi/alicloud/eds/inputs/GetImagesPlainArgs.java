// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetImagesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImagesPlainArgs Empty = new GetImagesPlainArgs();

    /**
     * The desktop type of the image.
     * 
     */
    @Import(name="desktopInstanceType")
    private @Nullable String desktopInstanceType;

    /**
     * @return The desktop type of the image.
     * 
     */
    public Optional<String> desktopInstanceType() {
        return Optional.ofNullable(this.desktopInstanceType);
    }

    /**
     * A list of Image IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Image IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The image type of the image. Valid values: `SYSTEM`, `CUSTOM`.
     * 
     */
    @Import(name="imageType")
    private @Nullable String imageType;

    /**
     * @return The image type of the image. Valid values: `SYSTEM`, `CUSTOM`.
     * 
     */
    public Optional<String> imageType() {
        return Optional.ofNullable(this.imageType);
    }

    /**
     * A regex string to filter results by Image name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Image name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * The os type of the image.
     * 
     */
    @Import(name="osType")
    private @Nullable String osType;

    /**
     * @return The os type of the image.
     * 
     */
    public Optional<String> osType() {
        return Optional.ofNullable(this.osType);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The status of the image. Valid values: `Creating`, `Available`, `CreateFailed`.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the image. Valid values: `Creating`, `Available`, `CreateFailed`.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private GetImagesPlainArgs() {}

    private GetImagesPlainArgs(GetImagesPlainArgs $) {
        this.desktopInstanceType = $.desktopInstanceType;
        this.ids = $.ids;
        this.imageType = $.imageType;
        this.nameRegex = $.nameRegex;
        this.osType = $.osType;
        this.outputFile = $.outputFile;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImagesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImagesPlainArgs $;

        public Builder() {
            $ = new GetImagesPlainArgs();
        }

        public Builder(GetImagesPlainArgs defaults) {
            $ = new GetImagesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param desktopInstanceType The desktop type of the image.
         * 
         * @return builder
         * 
         */
        public Builder desktopInstanceType(@Nullable String desktopInstanceType) {
            $.desktopInstanceType = desktopInstanceType;
            return this;
        }

        /**
         * @param ids A list of Image IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Image IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param imageType The image type of the image. Valid values: `SYSTEM`, `CUSTOM`.
         * 
         * @return builder
         * 
         */
        public Builder imageType(@Nullable String imageType) {
            $.imageType = imageType;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Image name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param osType The os type of the image.
         * 
         * @return builder
         * 
         */
        public Builder osType(@Nullable String osType) {
            $.osType = osType;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param status The status of the image. Valid values: `Creating`, `Available`, `CreateFailed`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public GetImagesPlainArgs build() {
            return $;
        }
    }

}